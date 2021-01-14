package covidsymulation.demo.Service;

import covidsymulation.demo.Dto.SimulationDto;
import covidsymulation.demo.Entity.Simulation;
import covidsymulation.demo.Exception.IdNotFoundException;
import covidsymulation.demo.Repository.SimulationRepository;
import covidsymulation.demo.util.SimulationConverter;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulationServiceImpl implements SimulationService {

    private SimulationRepository simulationRepository;

    public SimulationServiceImpl(SimulationRepository simulationRepository) {
        this.simulationRepository = simulationRepository;
    }

    @Override
    public void saveSimulation(SimulationDto simulationDto) {
        Simulation simulation = SimulationConverter.convertToSimulation(simulationDto);
        simulationRepository.save(simulation);
    }

    @Override
    public List<SimulationDto> getAllSimulation() {
        return SimulationConverter.convertToListDto(
                (List<Simulation>) simulationRepository.findAll());
    }

    @Override
    public SimulationDto getSimulationById(Long Id) {
        Simulation simulation = simulationRepository.findById(Id)
                .orElseThrow(() -> new IdNotFoundException(Id, Simulation.class.getSimpleName())
                );
        return SimulationConverter.convertToDto(simulation);
    }

    @Override
    public void deleteSimulationById(Long Id) {
        try {
            simulationRepository.deleteById(Id);
        } catch (EmptyResultDataAccessException e) {
            throw new IdNotFoundException(Id, Simulation.class.getSimpleName());
        }
    }

    @Override
    public void updateSimulation(SimulationDto simulationDto) {
        Simulation simulation = SimulationConverter.convertToNewSimulation(simulationDto);
        simulationRepository.save(simulation);
    }
}
