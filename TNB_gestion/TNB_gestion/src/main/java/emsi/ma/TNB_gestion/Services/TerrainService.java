package emsi.ma.TNB_gestion.Services;
import emsi.ma.TNB_gestion.Model.Terrain;
import emsi.ma.TNB_gestion.Repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerrainService {

    @Autowired
    private TerrainRepository terrainRepository;

    public List<Terrain> findAll() {
        return terrainRepository.findAll();
    }

    public Terrain findById(int id) throws Exception {
        return terrainRepository.findById(id).orElseThrow(() -> new Exception("Invalid Terrain ID"));
    }

    public void addTerrain(Terrain terrain) {
        terrainRepository.save(terrain);
    }
}