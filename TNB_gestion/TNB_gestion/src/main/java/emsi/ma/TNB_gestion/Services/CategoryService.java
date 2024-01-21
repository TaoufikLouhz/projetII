package emsi.ma.TNB_gestion.Services;

import emsi.ma.TNB_gestion.Model.Category;
import emsi.ma.TNB_gestion.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(int id) throws Exception {
        return categoryRepository.findById(id).orElseThrow(() -> new Exception("Invalid Category ID"));
    }

    public void addCategory(Category category) {
        categoryRepository.save(category);
    }
}
