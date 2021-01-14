package covidsymulation.demo.Dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import covidsymulation.demo.Entity.Population;

import java.util.ArrayList;
import java.util.List;

public class SimulationDto {

    private Long id;

    private String name;

    private Integer populationSize;

    private Integer initialInfectedSize;

    private Double contagiousness;

    private Double mortality;

    private Integer cycleTime;

    private Integer simulationTime;

    private List<PopulationDto> populations = new ArrayList<>();

    @JsonCreator
    public SimulationDto(@JsonProperty ("id") Long id,
                         @JsonProperty ("name") String name,
                         @JsonProperty ("populationSize") Integer populationSize,
                         @JsonProperty ("initialInfectedSize") Integer initialInfectedSize,
                         @JsonProperty ("contagiousness") Double contagiousness,
                         @JsonProperty ("mortality") Double mortality,
                         @JsonProperty ("cycleTime") Integer cycleTime,
                         @JsonProperty ("simulationTime") Integer simulationTime,
                         @JsonProperty ("populations") List<PopulationDto> populations) {
        this.id = id;
        this.name = name;
        this.populationSize = populationSize;
        this.initialInfectedSize = initialInfectedSize;
        this.contagiousness = contagiousness;
        this.mortality = mortality;
        this.cycleTime = cycleTime;
        this.simulationTime = simulationTime;
        this.populations = populations;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(Integer populationSize) {
        this.populationSize = populationSize;
    }

    public Integer getInitialInfectedSize() {
        return initialInfectedSize;
    }

    public void setInitialInfectedSize(Integer initialInfectedSize) {
        this.initialInfectedSize = initialInfectedSize;
    }

    public Double getContagiousness() {
        return contagiousness;
    }

    public void setContagiousness(Double contagiousness) {
        this.contagiousness = contagiousness;
    }

    public Double getMortality() {
        return mortality;
    }

    public void setMortality(Double mortality) {
        this.mortality = mortality;
    }

    public Integer getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
    }

    public Integer getSimulationTime() {
        return simulationTime;
    }

    public void setSimulationTime(Integer simulationTime) {
        this.simulationTime = simulationTime;
    }

    public List<PopulationDto> getPopulations() {
        return populations;
    }

    public void setPopulations(List<PopulationDto> populations) {
        this.populations = populations;
    }
}
