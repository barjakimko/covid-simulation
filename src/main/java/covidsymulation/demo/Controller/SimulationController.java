package covidsymulation.demo.Controller;

import covidsymulation.demo.Dto.SimulationDto;
import covidsymulation.demo.Service.SimulationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/ap1/v1")
public class SimulationController {

    private SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @GetMapping("/simulations")
    public List<SimulationDto> getSimulations() {
        return simulationService.getAllSimulation();
    }

    @GetMapping("/simulations/{id}")
    public SimulationDto getSimulationsById(@PathVariable Long id) {
        return simulationService.getSimulationById(id);
    }

    @DeleteMapping("/simulations/{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteSimulationById(@PathVariable Long id){
        simulationService.deleteSimulationById(id);
    }

    @PostMapping("/simulations")
    @ResponseStatus(CREATED)
    public void createSimulation(@RequestBody SimulationDto simulationDto) {
        simulationService.saveSimulation(simulationDto);
    }

    @PutMapping("/simulations")
    @ResponseStatus(OK)
    public void updateSimulation(@RequestBody SimulationDto simulationDto) {
        simulationService.updateSimulation(simulationDto);
    }
}
