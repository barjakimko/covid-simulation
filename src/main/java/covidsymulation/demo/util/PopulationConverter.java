package covidsymulation.demo.util;

import covidsymulation.demo.Dto.PopulationDto;
import covidsymulation.demo.Entity.Population;
import covidsymulation.demo.Entity.Simulation;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PopulationConverter {

    public static PopulationDto convertToDto(Population population) {
        return new PopulationDto(population.getId(),
                population.getInfected(),
                population.getHealthy(),
                population.getDied(),
                population.getRecovered());
    }

    public static List<PopulationDto> convertToListDto(List<Population> populations) {
        return populations.stream()
                .map(population -> convertToDto(population))
                .collect(Collectors.toList());
    }

    public static Population convertToPopulation(PopulationDto populationDto) {

        return new Population(populationDto.getInfected(),
                populationDto.getHealthy(),
                populationDto.getDied(),
                populationDto.getRecovered());
    }

    public static List<Population> convertToPopulationList(List<PopulationDto> populationsDto){
        return populationsDto.stream()
                .map(populationDto -> convertToPopulation(populationDto))
                .collect(Collectors.toList());
    }


}
