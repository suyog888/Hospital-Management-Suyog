import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseurl from './helper';

@Injectable({
  providedIn: 'root'
})
export class AdminsignupService {

  constructor(private http:HttpClient) { }
  //add admin
  public addAdmin(admin:any){
    return this.http.post(`${baseurl}/api/v1/admin/save`,admin);
    

  }
}
