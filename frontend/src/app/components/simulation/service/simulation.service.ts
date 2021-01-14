import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SimulationService {

  constructor(private http: HttpClient) {
  }

  public getSimulationById(id): Observable<Simulation> {
    return this.http.get<Simulation>('http://localhost:8080/ap1/v1/simulations/' + id);
  }

  public getAllSimulation(): Observable<Simulation[]> {
    return this.http.get<Simulation[]>('http://localhost:8080/ap1/v1/simulations/');
  }
}

export interface Population {
  id: number;
  infected: number;
  healthy: number;
  died: number;
  recovered: number;
}

export interface Simulation {
  id: number;
  name: string;
  populationSize: number;
  initialInfectedSize: number;
  contagiousness: number;
  mortality: number;
  cycleTime: number;
  simulationTime: number;
  populations: Population[];
}
