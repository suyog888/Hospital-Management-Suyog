import { Component ,OnInit } from '@angular/core';
import { DoctorInfoService } from 'src/app/services/doctor-info.service';
import Swal from 'sweetalert2';
declare var window:any;

@Component({
  selector: 'app-doctor-info',
  templateUrl: './doctor-info.component.html',
  styleUrls: ['./doctor-info.component.css']
})
export class DoctorInfoComponent implements OnInit {
  formModal:any;
  public doctor:any;
  ngOnInit(): void {
    this.formModal=new window.bootstrap.Modal(
      document.getElementById("exampleModal")
    );
      
  }
  constructor(private doctorInfoService:DoctorInfoService){
    this.getDoctorDetails();
  }
  getDoctorDetails(){
    this.doctorInfoService.getDoctorDetails().subscribe(
      (resp)=>{
      Swal.fire('detail display sucessful');
      console.log(resp);
      this.doctor=resp;
      },
    (error:any)=>{
    console.log(error);
    alert("something went wrong");
    }
    );
  }
  deletedoctorDetails(doctorId: number){
    this.doctorInfoService.deleteDoctor(doctorId).subscribe(
      (resp)=>{
        Swal.fire('detail delete sucessful');
        console.log(resp);
        this.doctor=resp;
        },
      (error:any)=>{
      console.log(error);
      alert("something went wrong");
      }
    );
  }

  openModal(){
    this.formModal.show();
  } 
  doSomething(){
    this.formModal.hide();
  }
 


  







  // updatedoctorDetails(doctorUsername:string){
  //   const updatedData={
  //     email:''


  //   }
   

  //   this.doctorInfoService.updateDoctor(doctorUsername,updatedData).subscribe(
  //     (resp)=>{
  //       Swal.fire('detail delete sucessful');
  //       console.log(resp);
  //       this.doctor=resp;
  //       },
  //     (error)=>{
  //     console.log(error);
  //     alert("something went wrong");
  //     }
  //   );
  // }
  
}