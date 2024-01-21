package emsi.ma.TNB_gestion.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Taux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float montant;
    @OneToMany(mappedBy = "taux")
    private List<Category> categories;
    @OneToMany(mappedBy = "taux")
    private List<Taxe> taxes;


}