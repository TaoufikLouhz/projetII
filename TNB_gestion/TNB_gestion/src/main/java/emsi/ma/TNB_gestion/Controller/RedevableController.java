package emsi.ma.TNB_gestion.Controller;

import emsi.ma.TNB_gestion.Model.Redevable;
import emsi.ma.TNB_gestion.Services.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/Redevable")
public class RedevableController {
    @Autowired
    private RedevableService service;

    @GetMapping
    public List<Redevable> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Redevable findById(@PathVariable int id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Redevable redevable) {
        service.addRedevable(redevable);
    }
}
