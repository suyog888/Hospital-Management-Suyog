import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doctor-login',
  templateUrl: './doctor-login.component.html',
  styleUrls: ['./doctor-login.component.css']
})
export class DoctorLoginComponent {
   username: string ="";
  password: string ="";
  constructor(private router:Router,private http:HttpClient){}
  Login() {
    console.log(this.username);
    console.log(this.password);
 
    let bodyData = {
      username: this.username,
      password: this.password,
    };
 
         this.http.post("http://localhost:8080/api/v1/doctor/login", bodyData).subscribe(  (resultData: any) =>  {
        console.log(resultData);
 
        if (resultData.message == "username not exits")
        {
      
          alert("username not exits");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          this.router.navigateByUrl('/doctordashboard');
        }
        else
        {
          alert("Incorrect Email and Password not match");
        }
      });
    }


}
