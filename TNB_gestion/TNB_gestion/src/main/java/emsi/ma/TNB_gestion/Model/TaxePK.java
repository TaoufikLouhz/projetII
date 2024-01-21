package emsi.ma.TNB_gestion.Model;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;


@Embeddable
public class TaxePK implements Serializable {

    private int taux;
    private int terrain;
    private int annee;
    private float montant;


}
