import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';



@Injectable({
  providedIn: 'root'
})
export class PatientInfoService {

  constructor(private httpClient:HttpClient) { }
  // public getPatientDetails(){
  //   return this.httpClient.get(`${baseurl}/api/v1/patient/view`)
  // }
  getPatients(username:string){
    return this.httpClient.get('localhost:8080/api/v1/patient/${username}'); 
  
  }


}
