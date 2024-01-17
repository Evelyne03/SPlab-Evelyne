package uvt.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uvt.models.Section;
public interface SectionsRepository extends JpaRepository<Section, Long>{
}
