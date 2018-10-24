package ch.zhaw.gpi.eumzugplattform.entities;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Enitity-Klasse für Stammdaten zu einer Person
 * 
 * @author scep
 */
@Entity(name="Person")
public class PersonEntity {

    // Manuell gesetzte Personenidentifikation
    @Id
    @Size(min = 1, max = 36)
    private String localPersonId;

    // AHV-Nummer
    @Basic
    @Min(value = 7560000000001L)
    @Max(value = 7569999999999L)
    private Long vn;
    
    // Vorname
    @Column(nullable = false)
    @Basic
    @NotNull
    @Size(min = 1, max = 100)
    private String firstName;

    // Nachname
    @Column(nullable = false)
    @Basic
    @NotNull
    @Size(min = 1, max = 100)
    private String officialName;
    
    // Geschlecht (1=männlich, 2,= weiblich, 3=unbestimmt)
    @Column(nullable = false)
    @Basic
    @NotNull
    @Min(value = 1)
    @Max(value = 3)
    private int sex;

    // Geburtsdatum
    @Column(nullable = false)
    @Basic
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    
    // GETTER und SETTER
    public String getLocalPersonId() {
        return localPersonId;
    }

    public void setLocalPersonId(String localPersonId) {
        this.localPersonId = localPersonId;
    }

    public Long getVn() {
        return vn;
    }

    public void setVn(Long vn) {
        this.vn = vn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    
}
