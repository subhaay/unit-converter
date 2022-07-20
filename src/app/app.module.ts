import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {TemperatureConverterComponent} from "./temperature-converter/temperature-converter.component";
import {VolumeConverterComponent} from "./volume-converter/volume-converter.component";
import {ReactiveFormsModule} from "@angular/forms";
import {UnitConverterService} from "./core/services/unit-converter.service";

@NgModule({
  declarations: [
    AppComponent,
    TemperatureConverterComponent,
    VolumeConverterComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [UnitConverterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
