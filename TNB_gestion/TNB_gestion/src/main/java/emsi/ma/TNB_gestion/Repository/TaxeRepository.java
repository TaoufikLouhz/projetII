package emsi.ma.TNB_gestion.Repository;


import emsi.ma.TNB_gestion.Model.Taxe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeRepository extends JpaRepository<Taxe, Integer> {

}

