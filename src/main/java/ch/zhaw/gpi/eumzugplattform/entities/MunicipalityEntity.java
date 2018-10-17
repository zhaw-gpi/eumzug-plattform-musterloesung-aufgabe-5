package ch.zhaw.gpi.eumzugplattform.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Enitity-Klasse für Stammdaten zu einer politischen Gemeinde
 * 
 * @author scep
 */
@Entity(name = "Municipality")
public class MunicipalityEntity implements Serializable {

    // Manuell gesetzte Id (BFS-Nummer)
    @Id
    @Column(unique = true, nullable = false)
    @Min(value = 1)
    @Max(value = 9999)
    private int municipalityId;
    
    // Offizieller Name
    @Column(nullable = false)
    @Basic
    @NotNull
    @Size(min = 1, max = 40)
    private String municipalityName;

    
    // GETTER UND SETTER
    public int getMunicipalityId() {
        return municipalityId;
    }

    public void setMunicipalityId(int municipalityId) {
        this.municipalityId = municipalityId;
    }
    
    public String getMunicipalityName() {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }
    
}
