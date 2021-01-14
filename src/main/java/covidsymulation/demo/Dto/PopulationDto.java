package covidsymulation.demo.Dto;


public class PopulationDto {

    private Long id;

    private Double infected;

    private Double healthy;

    private Double died;

    private Double recovered;

    public PopulationDto(Long id, Double infected, Double healthy, Double died, Double recovered) {
        this.id = id;
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
}
