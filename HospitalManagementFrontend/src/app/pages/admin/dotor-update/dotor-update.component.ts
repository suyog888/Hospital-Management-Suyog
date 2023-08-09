import { Component,OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { DoctorsignupService } from 'src/app/services/doctorsignup.service';
import Swal from 'sweetalert2';



@Component({
  selector: 'app-dotor-update',
  templateUrl: './dotor-update.component.html',
  styleUrls: ['./dotor-update.component.css']
})
export class DotorUpdateComponent implements  OnInit   {
  public doctor3:any;

  constructor(private doctorsignupService:DoctorsignupService,private snack:MatSnackBar,){

    

  }
  public doctor1={
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
    public doctor2={
      doctorId:'',
        username:'',
        password:'',
        gender:''
  
      }



  ngOnInit(): void {
    
  }
  formSubmit(){
      alert('submit');
      console.log(this.doctor1);
      if(this.doctor1.username=='' || this.doctor1.username==null){
        //alert('username required')
        this.snack.open("Username is required...",'',{duration:3000});
        return;
      
      
      }
      this.doctorsignupService.addDoctor(this.doctor1).subscribe(
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


