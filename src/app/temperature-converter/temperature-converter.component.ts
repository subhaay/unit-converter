import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, Validators} from '@angular/forms';
import {StudentConverterRequest} from "../core/models/student-converter-request";
import {UnitConverterService} from "../core/services/unit-converter.service";

@Component({
  selector: 'app-temperature-converter',
  templateUrl: './temperature-converter.component.html',
  styleUrls: ['./temperature-converter.component.css']
})
export class TemperatureConverterComponent implements OnInit{
  output = 'invalid';
  numberRegEx = /\-?\d*\.?\d{1,2}/;
  temperatureForm = this.fb.group({
    inputNumericalValue: new FormControl('', {
      validators: [Validators.required, Validators.pattern(this.numberRegEx)],
      updateOn: "blur"
    }),
    inputUnitOfMeasure:  new FormControl('', {validators: [Validators.required]}),
    targetUnitOfMeasure: new FormControl('', {validators: [Validators.required]}),
    studentResponse: new FormControl('', {
      validators: [Validators.required, Validators.pattern(this.numberRegEx)],
      updateOn: "blur"
    }),
    output: ['']
  });
  temperatureList: any = ['Kelvin', 'Celsius', 'Fahrenheit', 'Rankine']
  constructor(private fb: FormBuilder,
              private unitConverterService: UnitConverterService)
  { }

  ngOnInit() {
    this.temperatureForm.get('inputNumericalValue')?.valueChanges.subscribe(val => {
      this.output = '';
    });
    this.temperatureForm.get('inputUnitOfMeasure')?.valueChanges.subscribe(val => {
      this.output = '';
    });
    this.temperatureForm.get('targetUnitOfMeasure')?.valueChanges.subscribe(val => {
      this.output = '';
    });
    this.temperatureForm.get('studentResponse')?.valueChanges.subscribe(val => {
      this.output = '';
    });
  }

  changeTemperatureInput(e){
    this.temperatureForm.get('inputUnitOfMeasure')!.setValue(e.target.value, {
      onlySelf: true
    })
  }

  changeTemperatureTarget(e){
    this.temperatureForm.get('targetUnitOfMeasure')!.setValue(e.target.value, {
      onlySelf: true
    })
  }

  onSubmit() {
    console.warn(this.temperatureForm.value);
    let studentConverterRequest: StudentConverterRequest = {
      inputNumericalValue: this.temperatureForm.get('inputNumericalValue')?.value,
      inputUnitOfMeasure: this.temperatureForm.get('inputUnitOfMeasure')?.value,
      targetUnitOfMeasure: this.temperatureForm.get('targetUnitOfMeasure')?.value
    };
    this.unitConverterService.convertTemperature(studentConverterRequest).subscribe(convertedValue => {
      if(Number(this.temperatureForm.get('studentResponse')?.value).toFixed(1) == convertedValue.toFixed(1)) {
        this.temperatureForm.get('output')!.setValue('correct');
        this.output = 'correct';
      } else {
        this.temperatureForm.get('output')!.setValue('incorrect');
        this.output = 'incorrect';
      }
    });
  }
}
