import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {SimulationComponent} from './components/simulation/simulation.component';
import {HttpClientModule} from '@angular/common/http';

import {BrowserModule} from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
// import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NgxChartsModule} from '@swimlane/ngx-charts';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
// import {DemoMaterialModule} from './app/material-module';
import {MatNativeDateModule} from '@angular/material/core';
import {MatSliderModule} from '@angular/material/slider';


@NgModule({
  declarations: [
    AppComponent,
    SimulationComponent,
  ],
  imports: [
    MatSliderModule,
    HttpClientModule,
    BrowserModule,
    FormsModule,
    NgxChartsModule,
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    // DemoMaterialModule,
    MatNativeDateModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
