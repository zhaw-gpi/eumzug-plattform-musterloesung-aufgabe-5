package ch.zhaw.gpi.eumzugplattform.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
    
    // Liste benötigter Dokumente inkl. Hochlad-Bedingungen
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "MUNICIPALITY_ID")
    private List<MunicipalityDocumentRelationEntity> municipalityDocumentRelationEntities;
    
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
    
    public List<MunicipalityDocumentRelationEntity> getMunicipalityDocumentRelationEntities() {
        return municipalityDocumentRelationEntities;
    }

    public void setMunicipalityDocumentRelationEntities(List<MunicipalityDocumentRelationEntity> municipalityDocumentRelationEntities) {
        this.municipalityDocumentRelationEntities = municipalityDocumentRelationEntities;
    }
    
    public void addMunicipalityDocumentRelationEntity(MunicipalityDocumentRelationEntity municipalityDocumentRelationEntity) {
        this.municipalityDocumentRelationEntities.add(municipalityDocumentRelationEntity);
    }
    
    public void removeMunicipalityDocumentRelationEntity(MunicipalityDocumentRelationEntity municipalityDocumentRelationEntity) {
        this.municipalityDocumentRelationEntities.remove(municipalityDocumentRelationEntity);
    }
    
}
