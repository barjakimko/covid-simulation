package covidsymulation.demo.Service;

import covidsymulation.demo.Repository.SimulationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SimulationServiceTest {

    @Mock
    private SimulationRepository simulationRepository;

    @InjectMocks
    private SimulationServiceImpl simulationService;

    @Test
    public void should_delete_user(){
        // given:
        Long id = 10L;

        // when:
        simulationService.deleteSimulationById(id);

        // then:
        verify(simulationRepository, timeout(1)).deleteById(eq(id));
    }
}
