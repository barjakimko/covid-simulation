package covidsymulation.demo.Repository;

import covidsymulation.demo.Entity.Population;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopulationRepository extends CrudRepository<Population, Long> {
}
