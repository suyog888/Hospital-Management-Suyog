import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseurl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PatientSignupService {

  constructor(private http:HttpClient) { }

  public addPatient (patient:any){
    return this.http.post(`${baseurl}/api/v1/patient/save`,patient)
  }
}
