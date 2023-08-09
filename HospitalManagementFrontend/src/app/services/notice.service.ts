import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseurl from './helper';

@Injectable({
  providedIn: 'root'
})
export class NoticeService {

  constructor(private http:HttpClient) { }
  public addNotice(notice:any){
    return this.http.post(`${baseurl}/api/v1/notice/save`,notice);
  }
}
