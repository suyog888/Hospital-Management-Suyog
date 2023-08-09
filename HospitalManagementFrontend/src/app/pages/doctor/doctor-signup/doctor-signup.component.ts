import { Component,OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { DoctorsignupService } from 'src/app/services/doctorsignup.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-doctor-signup',
  templateUrl: './doctor-signup.component.html',
  styleUrls: ['./doctor-signup.component.css']
})
export class DoctorSignupComponent implements OnInit   {
  constructor(private doctorsignupService:DoctorsignupService,private snack:MatSnackBar){}
  public doctor={
    doctorId:'',
      firstName:'',
      lastName:'',
      username:'',
      email:'',
      phone:'',
      city:'',
      pinCode:'',
      password:'',
      salary:'',
      qualification:'',
      dob:'',
      experience:'',
      specialty:'',
      bloodGroup:'',
      gender:''

    }



  ngOnInit(): void {
    
  }
  formSubmit(){
      alert('submit');
      console.log(this.doctor);
      if(this.doctor.username=='' || this.doctor.username==null){
        //alert('username required')
        this.snack.open("Username is required...",'',{duration:3000});
        return;
      
      
      }
      this.doctorsignupService.addDoctor(this.doctor).subscribe(
        (data)=>{
          //success
          console.log(data);
          //alert('ok')
          Swal.fire('Success','user is registered');
          
  
        },
        (error)=>{
          console.log(error);
          //alert('somethin went wrong');
  
        }
      );
     
    }
  

}
