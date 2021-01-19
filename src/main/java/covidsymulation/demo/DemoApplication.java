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
}
