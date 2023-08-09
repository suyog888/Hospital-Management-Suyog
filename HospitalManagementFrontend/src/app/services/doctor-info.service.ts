import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseurl from './helper';

@Injectable({
  providedIn: 'root'
})
export class DoctorInfoService {

  constructor(private httpClient:HttpClient) { }

  public getDoctorDetails(){
    return this.httpClient.get(`${baseurl}/api/v1/doctor/view`);
  }

  //delete doctor recore
  public deleteDoctor(doctorId:number){
    return this.httpClient.delete(`${baseurl}/api/v1/doctor/${doctorId}`);
  }

  //udate doctor record
  // public updateDoctor(username:any){
  //   return this.httpClient.put(`${baseurl}/api/v1/doctor/save/`,username);
  // }
  //update doctor
  public addDoctor(doctor:any){
    return this.httpClient.post(`${baseurl}/api/v1/doctor/update`,doctor);

  }

  


  
  

  
}
