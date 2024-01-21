package emsi.ma.TNB_gestion.Services;

import emsi.ma.TNB_gestion.Model.Taux;
import emsi.ma.TNB_gestion.Repository.TauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TauxService {

    @Autowired
    private TauxRepository tauxRepository;

    public List<Taux> findAll() {
        return tauxRepository.findAll();
    }

    public Taux findById(int id) throws Exception {
        return tauxRepository.findById(id).orElseThrow(() -> new Exception("Invalid Taux ID"));
    }

    public void addTaux(Taux taux) {
        tauxRepository.save(taux);
    }

}
