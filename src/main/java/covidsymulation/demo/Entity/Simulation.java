package covidsymulation.demo.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "symulations")
public class Simulation {

    @Id
    @SequenceGenerator(name = "symulation_id_generator", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "symulation_id_generator")
    private Long id;

    private String name;

    private Integer populationSize;

    private Integer initialInfectedSize;

    private Double contagiousness;

    private Double mortality;

    private Integer cycleTime;

    private Integer simulationTime;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "symulation_id")
    private List<Population> populations = new ArrayList<>();

    public Simulation() {
    }

    public Simulation(String name,
                      Integer populationSize,
                      Integer initialInfectedSize,
                      Double contagiousness,
                      Double mortality,
                      Integer cycleTime,
                      Integer simulationTime) {
        this.name = name;
        this.populationSize = populationSize;
        this.initialInfectedSize = initialInfectedSize;
        this.contagiousness = contagiousness;
        this.mortality = mortality;
        this.cycleTime = cycleTime;
        this.simulationTime = simulationTime;
    }

    public Simulation(String name,
                      Integer populationSize,
                      Integer initialInfectedSize,
                      Double contagiousness,
                      Double mortality,
                      Integer cycleTime,
                      Integer simulationTime,
                      List<Population> populations) {
        this.name = name;
        this.populationSize = populationSize;
        this.initialInfectedSize = initialInfectedSize;
        this.contagiousness = contagiousness;
        this.mortality = mortality;
        this.cycleTime = cycleTime;
        this.simulationTime = simulationTime;
        this.populations = populations;
    }

    public Simulation(Long id,
                      String name,
                      Integer populationSize,
                      Integer initialInfectedSize,
                      Double contagiousness,
                      Double mortality,
                      Integer cycleTime,
                      Integer simulationTime,
                      List<Population> populations) {
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

    public List<Population> getPopulations() {
        return populations;
    }

    public void setPopulations(List<Population> populations) {
        this.populations = populations;
    }

    public Integer getSimulationTime() {
        return simulationTime;
    }

    public void setSimulationTime(Integer simulationTime) {
        this.simulationTime = simulationTime;
    }


    public void addFirstPopulation() {
        Population firstPopulation = new Population(initialInfectedSize.doubleValue(),
                populationSize.doubleValue() - initialInfectedSize.doubleValue(),
                0.0,
                0.0);
        populations.add(firstPopulation);
    }

    public void makeSimulation() {
        for (int i = 0; i <= simulationTime; i += cycleTime) {

            Population lastElement = populations.get(populations.size() - 1);

            Double infected = lastElement.getInfected() * contagiousness;

            Double died = lastElement.getDied() + lastElement.getInfected() * mortality;

            Double recovered = lastElement.getRecovered() + lastElement.getInfected() - died;

            Double healthy = populationSize - infected - died - recovered;

            Population nextPopulation = new Population();

            nextPopulation.setDied(died);
            nextPopulation.setInfected(infected);
            nextPopulation.setRecovered(recovered);
            nextPopulation.setHealthy(healthy);


            if (nextPopulation.getHealthy() <= 0) {
                break;
            }
            populations.add(nextPopulation);
        }
    }
}
