import { Component,OnInit } from '@angular/core';
import { AdminLoginService } from 'src/app/services/admin-login.service';

@Component({
  selector: 'app-doctor-profile',
  templateUrl: './doctor-profile.component.html',
  styleUrls: ['./doctor-profile.component.css']
})
export class DoctorProfileComponent implements OnInit {
  user=null;
  constructor(private adminLogin:AdminLoginService){}
  ngOnInit() :void{
    // this.user= this.doctorLogin.saveinfo();
    this.adminLogin.getCurrentUser().subscribe(
      (user:any)=>{
        this.user=user;
      },
      (error)=>{
        alert('error');
      }
    );


  }

}
