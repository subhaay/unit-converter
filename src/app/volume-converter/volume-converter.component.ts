import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, Validators} from '@angular/forms';
import {UnitConverterService} from "../core/services/unit-converter.service";
import {StudentConverterRequest} from "../core/models/student-converter-request";

@Component({
  selector: 'app-volume-converter',
  templateUrl: './volume-converter.component.html',
  styleUrls: ['./volume-converter.component.css']
})
export class VolumeConverterComponent implements OnInit{
  output = 'invalid';
  numberRegEx = /\-?\d*\.?\d{1,2}/;
  volumeForm = this.fb.group({
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

  volumeList: any = ['Liters', 'Tablespoons', 'Cubic-Inches', 'Cups', 'Cubic-Feet', 'Gallons']

  constructor(private fb: FormBuilder,
              private unitConverterService: UnitConverterService)
  { }

  ngOnInit() {
    this.volumeForm.get('inputNumericalValue')?.valueChanges.subscribe(val => {
      this.output = '';
    });
    this.volumeForm.get('inputUnitOfMeasure')?.valueChanges.subscribe(val => {
      this.output = '';
    });
    this.volumeForm.get('targetUnitOfMeasure')?.valueChanges.subscribe(val => {
      this.output = '';
    });
    this.volumeForm.get('studentResponse')?.valueChanges.subscribe(val => {
      this.output = '';
    });
  }

  changeVolumeInput(e){
    this.volumeForm.get('inputUnitOfMeasure')!.setValue(e.target.value, {
      onlySelf: true
    })
  }

  changeVolumeTarget(e){
    this.volumeForm.get('targetUnitOfMeasure')!.setValue(e.target.value, {
      onlySelf: true
    })
  }

  onSubmit() {
    console.warn(this.volumeForm.value);
    let studentConverterRequest: StudentConverterRequest = {
      inputNumericalValue: this.volumeForm.get('inputNumericalValue')?.value,
      inputUnitOfMeasure: this.volumeForm.get('inputUnitOfMeasure')?.value,
      targetUnitOfMeasure: this.volumeForm.get('targetUnitOfMeasure')?.value
    };
    this.unitConverterService.convertVolume(studentConverterRequest).subscribe(convertedValue => {
      if(Number(this.volumeForm.get('studentResponse')?.value).toFixed(1) == convertedValue.toFixed(1)) {
        this.volumeForm.get('output')!.setValue('correct');
        this.output = 'correct';
      } else {
        this.volumeForm.get('output')!.setValue('incorrect');
        this.output = 'incorrect';
      }
    });
  }
}
