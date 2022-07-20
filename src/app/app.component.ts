import { Component } from '@angular/core';
export type ConverterType = 'temperature' | 'volume';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  converterType: ConverterType = 'temperature';
  constructor() {
    //http.get('volume').subscribe(data => this.data = data);
  }

  get showTemperatureConverter() {
    return this.converterType === 'temperature';
  }

  get showVolumeConverter() {
    return this.converterType === 'volume';
  }

  toggleEditor(type: ConverterType) {
    this.converterType = type;
  }
}
