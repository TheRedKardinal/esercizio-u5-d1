package claudiogiasi.eserciziou5d1.repositories;

import claudiogiasi.eserciziou5d1.entities.POI;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PoiRepo extends JpaRepository<POI, UUID> {
}
