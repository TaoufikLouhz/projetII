package emsi.ma.TNB_gestion.Repository;

import emsi.ma.TNB_gestion.Model.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain,Integer> {
}
