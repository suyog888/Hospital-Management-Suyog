import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { NoticeService } from 'src/app/services/notice.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-notice',
  templateUrl: './notice.component.html',
  styleUrls: ['./notice.component.css']
})
export class NoticeComponent implements OnInit {
  constructor(private noticeSerice:NoticeService,private snack:MatSnackBar){}
  public notice={
    noticeTitle:'',
    noticeDis:'',
  }
  ngOnInit(): void {}
    formSubmit(){
      console.log(this.notice);
      if(this.notice.noticeTitle==''||this.notice.noticeTitle==null){
        this.snack.open("Notice title required....",'',{duration:3000});
        return;
      }
      this.noticeSerice.addNotice(this.notice).subscribe(
        (data:any)=>{
          console.log(data);
          Swal.fire('Success','Notice is register....');
        },
        (error)=>{
          console.log(error);
        }
      );
  }

}
