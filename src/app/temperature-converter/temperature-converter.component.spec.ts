import {TestBed,} from '@angular/core/testing';
import {HttpClientTestingModule,} from '@angular/common/http/testing';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {UnitConverterService} from '../core/services/unit-converter.service';
import {AppModule} from '../app.module';
import {HttpClientModule} from '@angular/common/http';
import {TemperatureConverterComponent} from './temperature-converter.component';

describe('TemperatureConverterComponent', () => {

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        TemperatureConverterComponent
      ],
      imports: [
        HttpClientModule,
        HttpClientTestingModule,
        ReactiveFormsModule,
        FormsModule,
        AppModule],
      providers: [
        { provide: UnitConverterService, useValue: {} }
      ],
    }).compileComponents();
  });

  it('should create the temperature component', () => {
    const fixture = TestBed.createComponent(TemperatureConverterComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it('should have called onInit', () => {
    const fixture = TestBed.createComponent(TemperatureConverterComponent);
    const app = fixture.componentInstance;
    app.ngOnInit();
    expect(app).toBeTruthy();
  });

  it('should have called changeTemperatureInput', () => {
    const fixture = TestBed.createComponent(TemperatureConverterComponent);
    const app = fixture.componentInstance;
    app.changeTemperatureInput({target: {value: 'Fahrenheit'}});
    expect(app).toBeTruthy();
  });

  it('should have called changeTemperatureTarget', () => {
    const fixture = TestBed.createComponent(TemperatureConverterComponent);
    const app = fixture.componentInstance;
    app.changeTemperatureTarget({target: {value: 'Kelvin'}});
    expect(app).toBeTruthy();
  });
});
