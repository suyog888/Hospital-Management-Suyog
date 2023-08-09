import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseurl from './helper';

@Injectable({
  providedIn: 'root'
})
export class AdminLoginService {

  constructor(private httpClient:HttpClient) { }
  public getAdminDetails(){
    return this.httpClient.get(`${baseurl}/api/v1/admin/`)
  }
  public getCurrentUser(){
    return this.httpClient.get(`${baseurl}api/vi/doctor/`);
  }


}
