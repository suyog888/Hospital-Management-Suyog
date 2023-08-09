import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
declare var window:any;
@Component({
  selector: 'app-doctor-notice',
  templateUrl: './doctor-notice.component.html',
  styleUrls: ['./doctor-notice.component.css']
})
export class DoctorNoticeComponent {

formModal:any;

  NoticeArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;

  noticeTitle:string="";
  noticeDis:string="";
  currentNoticeID="";
  constructor(private http:HttpClient){
    this.getAllNotice();
  }
  getAllNotice(){
    this.http.get("http://localhost:8080/api/v1/notice/getAllNotice").subscribe(
      (resultData:any)=>{
        this.isResultLoaded=true;
        console.log(resultData);
        this.NoticeArray=resultData;
      }
    );
  }
  register(){
    let bodyData={
      "noticeTitle":this.noticeTitle,
      "noticeDis":this.noticeDis
      
      };
      this.http.post("http://localhost:8080/api/v1/notice/save",bodyData,{responseType: 'text'}).subscribe(
        (resultData:any)=>{
          console.log(resultData);
          alert("notice added succesfully");
          this.getAllNotice();
          this.noticeTitle='',
          this.noticeDis=''
        });
  }
  setUpdate(data:any){
    this.noticeTitle=data.noticeTitle;
    this.noticeDis=data.noticeDis;
  }
  updateRecords(){
    let bodyData={
      "noticeId":this.currentNoticeID,
      "noticeTitle":this.noticeTitle,
      "noticeDis":this.noticeDis
    };
    this.http.put("http://localhost:8080/api/v1/notice/update",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>{
      console.log(resultData);
      alert("notice updated");
      this.getAllNotice();
      this.noticeTitle='';
      this.noticeDis=''

    });
  }
  save(){
    if(this.currentNoticeID== ''){
      this.register();
    }
    else{
      this.updateRecords();
    }
  }
  setDelete(data:any){
    this.http.delete("http://localhost:8080/api/v1/notice/deletenotice"+ "/"+ data.noticeId,{responseType: 'text'}).subscribe((resultData: any)=>{
      console.log(resultData);
      alert("notice deleted");
      this.getAllNotice();

      this.noticeTitle='';
      this.noticeDis=''

    });
  }
  openModal(){
    this.formModal.show();
  } 
  doSomething(){
    this.formModal.hide();
  }

}

