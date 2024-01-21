package emsi.ma.TNB_gestion.Services;

import emsi.ma.TNB_gestion.Model.Redevable;
import emsi.ma.TNB_gestion.Repository.RedevableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedevableService {


    @Autowired
    private RedevableRepository redevableRepository;

    public List<Redevable> findAll() {
        return redevableRepository.findAll();
    }

    public Redevable findById(int id) throws Exception {
        return redevableRepository.findById(id).orElseThrow(() -> new Exception("Invalid Redevable ID"));
    }

    public void addRedevable(Redevable redevable) {
        redevableRepository.save(redevable);
    }
}