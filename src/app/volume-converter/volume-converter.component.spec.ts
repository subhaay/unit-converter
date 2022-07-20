import {TestBed,} from '@angular/core/testing';
import {HttpClientTestingModule,} from '@angular/common/http/testing';
import {VolumeConverterComponent} from './volume-converter.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {UnitConverterService} from '../core/services/unit-converter.service';
import {AppModule} from '../app.module';
import {HttpClientModule} from '@angular/common/http';
import {of} from 'rxjs';

describe('VolumeConverterComponent', () => {

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        VolumeConverterComponent
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

  it('should create the volume component', () => {
    const fixture = TestBed.createComponent(VolumeConverterComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it('should have called onInit', () => {
    const fixture = TestBed.createComponent(VolumeConverterComponent);
    const app = fixture.componentInstance;
    app.ngOnInit();
    expect(app).toBeTruthy();
  });

  it('should have called changeVolumeInput', () => {
    const fixture = TestBed.createComponent(VolumeConverterComponent);
    const app = fixture.componentInstance;
    app.changeVolumeInput({target: {value: 'Liters'}});
    expect(app).toBeTruthy();
  });

  it('should have called changeVolumeTarget', () => {
    const fixture = TestBed.createComponent(VolumeConverterComponent);
    const app = fixture.componentInstance;
    app.changeVolumeTarget({target: {value: 'Gallons'}});
    expect(app).toBeTruthy();
  });
});
