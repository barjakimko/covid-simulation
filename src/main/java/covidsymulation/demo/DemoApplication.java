package covidsymulation.demo;

import covidsymulation.demo.Entity.Simulation;
import covidsymulation.demo.Repository.SimulationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    SimulationRepository simulationRepository;

    public DemoApplication(SimulationRepository simulationRepository) {
        this.simulationRepository = simulationRepository;
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {

            Simulation covid_start = new Simulation(
                    "start covid-19",
                    1_000_000,
                    100,
                    3.0,
                    0.03,
                    14,
                    3000
            );

            Simulation covid_now = new Simulation(
                    "now covid-19",
                    1_000_000,
                    100,
                    1.3,
                    0.03,
                    14,
                    3000
            );

            covid_start.addFirstPopulation();
            covid_now.addFirstPopulation();

            covid_start.makeSimulation();
            covid_now.makeSimulation();

            simulationRepository.save(covid_start);
            simulationRepository.save(covid_now);

        };
    }
}
