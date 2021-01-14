package covidsymulation.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity(name = "populations")
public class Population {

    @Id
    @SequenceGenerator(name = "population_id_generator", initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "population_id_generator")
    private Long id;

    private Double infected;

    private Double healthy;

    private Double died;

    private Double recovered;

    public Population() {
    }

    public Population(@JsonProperty("infected") Double infected,
                      @JsonProperty("healthy") Double healthy,
                      @JsonProperty("died") Double died,
                      @JsonProperty("recovered") Double recovered) {
        this.infected = infected;
        this.healthy = healthy;
        this.died = died;
        this.recovered = recovered;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getInfected() {
        return infected;
    }

    public void setInfected(Double infected) {
        this.infected = infected;
    }

    public Double getHealthy() {
        return healthy;
    }

    public void setHealthy(Double healthy) {
        this.healthy = healthy;
    }

    public Double getDied() {
        return died;
    }

    public void setDied(Double died) {
        this.died = died;
    }

    public Double getRecovered() {
        return recovered;
    }

    public void setRecovered(Double recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return "Population{" +
                "id=" + id +
                ", infected=" + infected +
                ", healthy=" + healthy +
                ", died=" + died +
                ", recovered=" + recovered +
                '}';
    }
}
