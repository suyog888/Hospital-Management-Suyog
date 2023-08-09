import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseurl from './helper';

@Injectable({
  providedIn: 'root'
})
export class DoctorsignupService {

  constructor(private http:HttpClient) { }
  //add admin
  public addDoctor(doctor:any){
    return this.http.post(`${baseurl}/api/v1/doctor/save`,doctor);
    

  }


  
}
