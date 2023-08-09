import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent {
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
 
         this.http.post("http://localhost:8080/api/v1/admin/login", bodyData).subscribe(  (resultData: any) =>  {
        console.log(resultData);
 
        if (resultData.message == "username not exits")
        {
      
          alert("username not exits");
    
 
        }
        else if(resultData.message == "Login Success")
         {
          this.router.navigateByUrl('/admindashboard');
          console.log(bodyData );
        }
        else
        {
          alert("Incorrect Email and Password not match");
        }
      });
    }

}
