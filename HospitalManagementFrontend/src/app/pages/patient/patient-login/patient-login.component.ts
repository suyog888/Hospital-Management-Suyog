import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import{PatientInterface}from '../patient-interface'
import Swal from 'sweetalert2';
import { MatSnackBar } from '@angular/material/snack-bar';
import baseurl from 'src/app/services/helper';


@Component({
  selector: 'app-patient-login',
  templateUrl: './patient-login.component.html',
  styleUrls: ['./patient-login.component.css']
})
export class PatientLoginComponent {
  username: string ="";
  password: string ="";
  record:string="";
  isResultLoaded = false;
  isUpdateFormActive = false;
  PatientArray:any[]=[];
  firstName: string ="";
  lastName:string="";
  phone:string="";
   


  constructor(private router:Router,private http:HttpClient,private snack:MatSnackBar){
    this.getPatientInfo();
  }
  getPatientInfo(){
    this.http.get(`${baseurl}/api/v1/patient/${this.record}`).subscribe(
      (resultData:any)=>
      {
        this.isResultLoaded=true;
        console.log("get",resultData);
        Swal.fire(resultData.firstName+" your appointment is "+resultData.status+" on this "+resultData.dateAndTime
        );
        

      }
    );
  }
  setUpdate(data:any){
    this.firstName=data.firstName;
    this.lastName=data.lastName;
    this.username=data.username;
  }
  updateRecords(){
    let bodyData={
      "firstName":this.firstName,
      "lastName":this.lastName,
    }
  }

  Login() {
    console.log(this.username);
    console.log(this.password);
 
    let bodyData:PatientInterface = {
      username: this.username,
      password: this.password,
    };
 
         this.http.post("http://localhost:8080/api/v1/patient/login", bodyData).subscribe(  (resultData: any) =>  {
        console.log(resultData);
 
        if (resultData.message == "username not exits")
        {
      
          alert("username not exits");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          this.router.navigateByUrl('/#exampleModal2');
         // Swal.fire(this.username,this.password);
          this.record=this.username;
          Swal.fire("fname",this.firstName);
          this.getPatientInfo();
        }
        else
        {
          alert("Incorrect Email and Password not match");
        }
      });
    }

}