package covidsymulation.demo.Controller;

import covidsymulation.demo.Service.SimulationService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class SimulationControllerTestConfiguration {

    @Bean
    public SimulationController simulationController() {
        return new SimulationController(simulationService());
    }

    @Bean
    public SimulationService simulationService() {
        return Mockito.mock(SimulationService.class);
    }

}
