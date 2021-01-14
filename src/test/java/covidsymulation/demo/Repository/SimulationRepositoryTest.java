package covidsymulation.demo.Repository;

import covidsymulation.demo.Entity.Simulation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@Sql("db_data_for_test.sql")
@DataJpaTest
public class SimulationRepositoryTest {

    @Autowired
    private SimulationRepository simulationRepository;

    @Test
    public void dummy_method_should_find_simulation_with_id() {
        //given
        Long id = 10L;

        //when
        Optional<Simulation> simulation = simulationRepository.findById(id);

        //then
        assertEquals(simulation.get().getName(), "first");
    }
}

