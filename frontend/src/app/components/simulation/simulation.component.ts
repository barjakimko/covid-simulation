import {Component, OnInit} from '@angular/core';
import {Population, Simulation, SimulationService} from './service/simulation.service';

import {FormControl, FormGroup} from '@angular/forms';
import {testData} from '../../data';


@Component({
  selector: 'app-simulation',
  templateUrl: './simulation.component.html',
  styleUrls: ['./simulation.component.css']
})
export class SimulationComponent implements OnInit {

  chosenSimulation: Simulation;
  allSimulations: Simulation[];
  allPopulations: Population[];

  infected: PopulationData;
  healthy: PopulationData;
  died: PopulationData;
  recovered: PopulationData;
  allPopulationsData: PopulationData[] = [];

  simulationForm = new FormGroup({
    populationSize: new FormControl(''),
    initialInfectedSize: new FormControl(''),
    contagiousness: new FormControl(''),
    mortality: new FormControl(''),
    cycleTime: new FormControl(''),
    simulationTime: new FormControl(''),
  });

  constructor(private simulationService: SimulationService) {

  }

  title = 'frontend';

  multi = testData;
  view: any[] = [700, 300];

  // options
  legend = true;
  showLabels = true;
  animations = true;
  xAxis = true;
  yAxis = true;
  showYAxisLabel = true;
  showXAxisLabel = true;
  xAxisLabel = 'Time';
  yAxisLabel = 'Population';
  timeline = true;

  colorScheme = {
    domain: ['#5AA454', '#E44D25', '#CFC0BB', '#7aa3e5', '#a8385d', '#aae3f5']
  };


  ngOnInit(): void {
    this.getSimulations();
    this.setSimulationForm();
  }

  getSimulation(simulationId: number): void {
    this.simulationService.getSimulationById(simulationId)
      .subscribe(value => {
          this.chosenSimulation = value;
          this.getPopulations();
          this.multi = [...this.allPopulationsData];
        }
      );
    this.setSimulationFormF(this.chosenSimulation);
    // this.simulationFormComponent.setSimulationFormF(this.chosenSimulation);
  }

  getSimulations(): void {
    this.simulationService.getAllSimulation()
      .subscribe(value => this.allSimulations = value);
  }

  getPopulations(): void {
    for (const p of this.chosenSimulation.populations) {
      p.recovered = this.roundUp(p.recovered);
      p.infected = this.roundUp(p.infected);
      p.healthy = this.roundUp(p.healthy);
      p.died = this.roundUp(p.died);
    }
    this.allPopulations = this.chosenSimulation.populations;
    this.convertPopulationsToData();
  }

  roundUp(num: number): number {
    return Math.round(num);
  }

  onSelect(data): void {
    console.log('Item clicked', JSON.parse(JSON.stringify(data)));
  }

  onActivate(data): void {
    console.log('Activate', JSON.parse(JSON.stringify(data)));
  }

  onDeactivate(data): void {
    console.log('Deactivate', JSON.parse(JSON.stringify(data)));
  }

  formatLabel(value: number): number | string {
    if (value >= 1000) {
      return Math.round(value / 1000) + 'k';
    }
    return value;
  }

  convertPopulationsToData(): void {
    this.allPopulationsData = [];
    this.infected = {
      name: 'infected',
      series: []
    };
    this.healthy = {
      name: 'healthy',
      series: []
    };
    this.died = {
      name: 'died',
      series: []
    };
    this.recovered = {
      name: 'recovered',
      series: []
    };

    let i = 0;

    for (const population of this.allPopulations) {
      this.infected.series.push(new Series(`${i}`, population.infected));
      this.healthy.series.push(new Series(`${i}`, population.healthy));
      this.died.series.push(new Series(`${i}`, population.died));
      this.recovered.series.push(new Series(`${i}`, population.recovered));
      i += this.chosenSimulation.cycleTime;
    }
    this.allPopulationsData.push(this.infected);
    this.allPopulationsData.push(this.healthy);
    this.allPopulationsData.push(this.died);
    this.allPopulationsData.push(this.recovered);
  }

  public setSimulationForm(): void {
    this.simulationForm.patchValue({
      populationSize: '0',
      initialInfectedSize: '0',
      contagiousness: '0',
      mortality: '0',
      cycleTime: '0',
      simulationTime: '0',
    });
  }

  public setSimulationFormF(simulation: Simulation): void {
    this.simulationForm.patchValue(
      {
        populationSize: simulation.populationSize,
        initialInfectedSize: simulation.initialInfectedSize,
        contagiousness: simulation.contagiousness,
        mortality: simulation.mortality,
        cycleTime: simulation.cycleTime,
        simulationTime: simulation.simulationTime,
      }
    );
  }
}

export class Series {
  name: string;
  value: number;

  constructor(name: string, value: number) {
    this.name = name;
    this.value = value;
  }
}

export interface PopulationData {
  name: string;
  series: Series[];
}


