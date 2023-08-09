import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { AdminsignupService } from 'src/app/services/adminsignup.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-admin-signup',
  templateUrl: './admin-signup.component.html',
  styleUrls: ['./admin-signup.component.css']
})
export class AdminSignupComponent implements OnInit{
  constructor(private adminsignupService:AdminsignupService,private snack:MatSnackBar){}
  public admin={
    firstName:'',
    lastName:'',
    username:'',
    email:'',
    phone:'',
    city:'',
    pinCode:'',
    password:'',
  }

  ngOnInit(): void {}
  formSubmit(){
    console.log(this.admin);
    if(this.admin.username==''|| this.admin.username==null){
      //alert('user is required');
      this.snack.open("Username is required...",'',{duration:3000});
      return;
    }

    //add admin
    this.adminsignupService.addAdmin(this.admin).subscribe(
      (data:any)=>{
        //success
        console.log(data);
        //alert('ok')
        Swal.fire('Success','user is registered')

      },
      (error)=>{
        console.log(error);
        alert('somethin went wrong');

      }
    );

  }

}
