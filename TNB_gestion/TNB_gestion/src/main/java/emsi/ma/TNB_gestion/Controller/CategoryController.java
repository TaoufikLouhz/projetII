package emsi.ma.TNB_gestion.Controller;

import emsi.ma.TNB_gestion.Model.Category;
import emsi.ma.TNB_gestion.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable int id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Category Category) {
        service.addCategory(Category);
    }



}
