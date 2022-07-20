import {fakeAsync, TestBed, tick} from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [
        AppComponent
      ],
      imports: [HttpClientTestingModule]
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it('should have temperature when toggleEditor is called with temperature', () => {
    const temperature = 'temperature';
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.toggleEditor(temperature);
    expect(app.converterType).toEqual(temperature);
  })

  it('should have volume when toggleEditor is called with volume', () => {
    const volume = 'volume';
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.toggleEditor(volume);
    expect(app.converterType).toEqual(volume);
  })

  it('should have called showTemperatureConverter', fakeAsync( ()=>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    const temperature:boolean = true;
    app.showTemperatureConverter;
    expect(app.showTemperatureConverter).toEqual(temperature);
  }))

  it('should have called showVolumeConverter', fakeAsync( ()=>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    const volume:boolean = false;
    app.showVolumeConverter;
    expect(app.showVolumeConverter).toEqual(volume);
  }))
});
