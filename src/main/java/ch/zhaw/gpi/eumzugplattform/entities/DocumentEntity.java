package ch.zhaw.gpi.eumzugplattform.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Enitity-Klasse für Stammdaten zu einem Dokument
 *
 * @author scep
 */
@Entity(name = "Document")
public class DocumentEntity implements Serializable {

    // Manuell gesetzte Id
    @Id
    @Column(unique = true, nullable = false)
    private int documentId;

    // Bezeichnung des Dokuments
    @Basic
    @NotNull
    @Column(unique = true, nullable = false)
    private String name;
    
    // GETTER UND SETTER
    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
