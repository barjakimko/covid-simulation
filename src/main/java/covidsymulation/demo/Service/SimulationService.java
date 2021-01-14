package covidsymulation.demo.Service;

import covidsymulation.demo.Dto.SimulationDto;

import java.util.List;

public interface SimulationService {
    void saveSimulation(SimulationDto simulationDto);
    List<SimulationDto> getAllSimulation();
    SimulationDto getSimulationById(Long Id);
    void deleteSimulationById(Long Id);
    void updateSimulation(SimulationDto simulationDto);
}
