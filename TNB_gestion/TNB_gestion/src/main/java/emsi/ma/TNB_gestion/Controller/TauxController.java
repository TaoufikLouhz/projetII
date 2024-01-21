package emsi.ma.TNB_gestion.Controller;

import emsi.ma.TNB_gestion.Model.Taux;
import emsi.ma.TNB_gestion.Services.TauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/taux")
public class TauxController {

    @Autowired
    private TauxService service;

    @GetMapping
    public List<Taux> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Taux findById(@PathVariable int id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Taux taux) {
        service.addTaux(taux);
    }
}
