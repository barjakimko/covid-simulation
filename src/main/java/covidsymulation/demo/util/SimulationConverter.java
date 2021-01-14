package covidsymulation.demo.util;

import covidsymulation.demo.Dto.SimulationDto;
import covidsymulation.demo.Entity.Simulation;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SimulationConverter {


    public static SimulationDto convertToDto(Simulation simulation) {
        return new SimulationDto(simulation.getId(),
                simulation.getName(),
                simulation.getPopulationSize(),
                simulation.getInitialInfectedSize(),
                simulation.getContagiousness(),
                simulation.getMortality(),
                simulation.getCycleTime(),
                simulation.getSimulationTime(),
                PopulationConverter.convertToListDto(simulation.getPopulations()));
    }

    public static List<SimulationDto> convertToListDto(List<Simulation> simulations) {
        return simulations.stream()
                .map(simulation -> convertToDto(simulation))
                .collect(Collectors.toList());
    }

    public static Simulation convertToSimulation(SimulationDto simulationDto) {
        return new Simulation(simulationDto.getName(),
                simulationDto.getPopulationSize(),
                simulationDto.getInitialInfectedSize(),
                simulationDto.getContagiousness(),
                simulationDto.getMortality(),
                simulationDto.getCycleTime(),
                simulationDto.getSimulationTime(),
                PopulationConverter.convertToPopulationList(simulationDto.getPopulations())
        );
    }

    public static Simulation convertToNewSimulation(SimulationDto simulationDto) {
        return new Simulation(
                simulationDto.getId(),
                simulationDto.getName(),
                simulationDto.getPopulationSize(),
                simulationDto.getInitialInfectedSize(),
                simulationDto.getContagiousness(),
                simulationDto.getMortality(),
                simulationDto.getCycleTime(),
                simulationDto.getSimulationTime(),
                PopulationConverter.convertToPopulationList(simulationDto.getPopulations())
        );
    }

}
