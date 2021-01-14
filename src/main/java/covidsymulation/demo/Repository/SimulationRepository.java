package covidsymulation.demo.Repository;

import covidsymulation.demo.Entity.Simulation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulationRepository extends CrudRepository<Simulation, Long> {
}
