package emsi.ma.TNB_gestion.Controller;

import emsi.ma.TNB_gestion.Model.Terrain;
import emsi.ma.TNB_gestion.Services.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/terrain")
public class TerrainController {
    @Autowired
    private TerrainService service;

    @GetMapping
    public List<Terrain> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Terrain findById(@PathVariable int id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Terrain terrain) {
        service.addTerrain(terrain);
    }
}
