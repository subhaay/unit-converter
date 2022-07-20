import {Injectable} from "@angular/core";
import {catchError, Observable, throwError} from "rxjs";
import {StudentConverterRequest} from "../models/student-converter-request";
import {HttpClient} from "@angular/common/http";
import {ApiConstants} from "../constants/api-constants";

@Injectable()
export class UnitConverterService {
  constructor(
    private http: HttpClient,
  ) {}

  private formatErrors(error: any) {
    return  throwError(error.error);
  }

  convertVolume(studentConverterRequest: StudentConverterRequest): Observable<Number> {
    return this.http.post<Number>(
      ApiConstants.volume_converter_url,
      studentConverterRequest,
    ).pipe(catchError(this.formatErrors));
  }

  convertTemperature(studentConverterRequest: StudentConverterRequest): Observable<Number> {
    return this.http.post<Number>(
      ApiConstants.temperature_converter_url,
      studentConverterRequest,
    ).pipe(catchError(this.formatErrors));
  }
}
