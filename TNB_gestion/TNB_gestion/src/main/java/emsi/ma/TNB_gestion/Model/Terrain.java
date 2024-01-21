package emsi.ma.TNB_gestion.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String nom;
    private String surface;
    @ManyToOne
    private Redevable redevable;
    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "terrain")
    private List<Taxe> taxes;




}
