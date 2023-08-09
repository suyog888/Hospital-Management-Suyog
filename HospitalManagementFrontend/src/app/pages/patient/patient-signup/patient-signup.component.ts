import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { PatientSignupService } from 'src/app/services/patient-signup.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-patient-signup',
  templateUrl: './patient-signup.component.html',
  styleUrls: ['./patient-signup.component.css']
})
export class PatientSignupComponent implements OnInit {
  constructor(private patientSignupService:PatientSignupService,private snack:MatSnackBar){}
  public patient={
    firstName:'',
    lastName:'',
    username:'',
    email:'',
    phone:'',
    city:'',
    pinCode:'',
    password:'',
    dateAndTime:'',
    status:'pending',
  }
   ngOnInit(): void {}
  formSubmit(){
    console.log(this.patient);
    if(this.patient.username==''|| this.patient.username==null){
      //alert('user is required');
      this.snack.open("Username is required...",'',{duration:3000});
      return;
    }

    //add admin
    this.patientSignupService.addPatient(this.patient).subscribe(
      (data:any)=>{
        //success
        console.log(data);
        //alert('ok')
        Swal.fire('Success','Patient is registered')

      },
      (error)=>{
        console.log(error);
        alert('somethin went wrong');

      }
    );

  }


}