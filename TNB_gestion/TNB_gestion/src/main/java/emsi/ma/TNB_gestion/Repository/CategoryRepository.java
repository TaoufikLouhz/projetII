package emsi.ma.TNB_gestion.Repository;

import emsi.ma.TNB_gestion.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}

