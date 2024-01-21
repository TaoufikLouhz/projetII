package emsi.ma.TNB_gestion.Services;

import emsi.ma.TNB_gestion.Model.Terrain;
import emsi.ma.TNB_gestion.Model.Taxe;
import emsi.ma.TNB_gestion.Repository.TaxeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxeService {

    private final TaxeRepository taxeRepository;

    @Autowired
    public TaxeService(TaxeRepository taxeRepository) {
        this.taxeRepository = taxeRepository;
    }

    public float calculerTaxe(Terrain terrain) {
        float tauxMontant = terrain.getCategory().getTaux().getMontant();
        return tauxMontant * Float.parseFloat(terrain.getSurface());
    }

    public void enregistrerTaxe(Terrain terrain) {
        float taxeMontant = calculerTaxe(terrain);
        Taxe taxe = new Taxe();
        taxe.setMontant(taxeMontant);
        taxeRepository.save(taxe);


    }

}

