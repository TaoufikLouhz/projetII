package emsi.ma.TNB_gestion.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Taxe {
    @EmbeddedId
    private TaxePK id;
    @JoinColumn(name = "terrain", referencedColumnName = "id",insertable = false,updatable = false)
    @ManyToOne
    private Terrain terrain;
    @JoinColumn(name = "taux", referencedColumnName = "id",insertable = false,updatable = false)
    @ManyToOne
    private Taux taux;

    public TaxePK getId() {
        return id;
    }

    public void setId(TaxePK id) {
        this.id = id;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Taux getTaux() {
        return taux;
    }

    public void setTaux(Taux taux) {
        this.taux = taux;
    }

    public void setMontant(float taxeMontant) {

    }
}
