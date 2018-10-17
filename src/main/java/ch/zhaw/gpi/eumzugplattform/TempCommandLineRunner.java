package ch.zhaw.gpi.eumzugplattform;

import ch.zhaw.gpi.eumzugplattform.entities.MunicipalityDocumentRelationEntity;
import ch.zhaw.gpi.eumzugplattform.entities.MunicipalityEntity;
import ch.zhaw.gpi.eumzugplattform.repositories.MunicipalityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Vorübergehende Klasse, um Dinge auszutesten
 * 
 * @author scep
 */
@Component
public class TempCommandLineRunner implements CommandLineRunner {

    @Autowired
    private MunicipalityRepository municipalityRepository;
    
    @Override
    public void run(String... args) throws Exception {
        List<MunicipalityEntity> municipalities = municipalityRepository.findAll();
        
        for(MunicipalityEntity municipalityEntity : municipalities) {
            List<MunicipalityDocumentRelationEntity> municipalityDocumentRelationEntities = municipalityEntity.getMunicipalityDocumentRelationEntities();
            if(municipalityDocumentRelationEntities.size() > 0){
                System.out.println("Allenfalls hochzuladende Dokumente für Gemeinde " + municipalityEntity.getMunicipalityName() + ":");
                for(MunicipalityDocumentRelationEntity municipalityDocumentRelationEntity : municipalityDocumentRelationEntities) {
                    System.out.println("   - " + municipalityDocumentRelationEntity.getDocumentEntity().getName());
                }
            }
        }
    }
    
}
