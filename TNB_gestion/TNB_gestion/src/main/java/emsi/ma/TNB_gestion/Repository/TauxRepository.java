package emsi.ma.TNB_gestion.Repository;

import emsi.ma.TNB_gestion.Model.Taux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxRepository extends JpaRepository <Taux,Integer> {
}
