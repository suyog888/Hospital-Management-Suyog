import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
declare var window:any;

@Component({
  selector: 'app-doctor-data',
  templateUrl: './doctor-data.component.html',
  styleUrls: ['./doctor-data.component.css']
})
export class DoctorDataComponent  {
  formModal:any;

  DoctorArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 
  
  firstName: string ="";
  lastName:string="";
  username: string ="";
  email:string="";
  phone:string="";
  city:string="";
  pincode:string="";
  password:string="";
  salary:string="";
  qualification:string="";
  dob:string="";
  experience:string="";
  specialty:string="";
  bloodGroup:string="";
  gender:string="";

 
  currentDoctorID = "";

  constructor(private http: HttpClient )
  {
    this.getAllDoctor();
  }
  getAllDoctor(){
    this.http.get("http://localhost:8080/api/v1/doctor/getAllDoctor")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.DoctorArray = resultData;
    });

  }
  register()
  {
  
    let bodyData = {
      "firstName" : this.firstName,
      "lastName":this.lastName,
      "username" : this.username,
      "email": this.email,
      "phone": this.phone,
      "city": this.city,
      "pincode": this.pincode,
      "password": this.password,
      "salary": this.salary,
      "qualification": this.qualification,
      "dob": this.dob,
      "experience": this.experience,
      "specialty": this.specialty,
      "bloodGroup": this.bloodGroup,
      "gender": this.gender

      
    };
    this.http.post("http://localhost:8080/api/v1/doctor/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("doctor Registered Successfully");
        this.getAllDoctor();
        this.firstName='',
        this.lastName='',
        this.username='',
        this.email='',
        this.phone='',  
        this.city='',
        this.pincode='',
        this.password='',
        this.salary='',
        this.qualification='',   
        this.dob='',
        this.experience='',
        this.specialty='',
        this.bloodGroup='',
        this.gender=''

    });
  }
  setUpdate(data:any){
    this.firstName=data.firstName;
    this.lastName=data.lastName;
    this.username=data.username;
    this.currentDoctorID=data.doctorId;
    this.email=data.email;
    this.phone=data.phone; 
    this.city=data.city;
    this.pincode=data.pincode;
    this.password=data.password;
    this.salary=data.salary;
    this.qualification=data.qualification;
    this.dob=data.dob;
    this.experience=data.experience;
    this.specialty=data.specialty;
    this.bloodGroup=data.bloodGroup;
    this.gender=data.gender;
  }
  updateRecords(){
    let bodyData={
      "doctorId":this.currentDoctorID,
      "firstName":this.firstName,
      "lastName":this.lastName,
      "username":this.username,
      "email": this.email,
      "phone": this.phone,
      "city": this.city,
      "pincode": this.pincode,
      "password": this.password,
      "salary": this.salary,
      "qualification": this.qualification,
      "dob": this.dob,
      "experience": this.experience,
      "specialty": this.specialty,
      "bloodGroup": this.bloodGroup,
      "gender": this.gender
      
    };
    this.http.put("http://localhost:8080/api/v1/doctor/update",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("doctor updated Successfully");
        this.getAllDoctor();
        this.firstName='';
        this.username='';
        this.lastName='';
        this.email='';
        this.phone='';  
        this.city='';
        this.pincode='';
        this.password='';
        this.salary='';
        this.qualification='';   
        this.dob='';
        this.experience='';
        this.specialty='';
        this.bloodGroup='';
        this.gender=''
    });
  }
  save(){
    if(this.currentDoctorID== ''){
      this.register();
    }
    else{
      this.updateRecords();
    }
  }
  setDelete(data:any){
    this.http.delete("http://localhost:8080/api/v1/doctor/deletedoctor"+ "/"+ data.doctorId,{responseType: 'text'}).subscribe((resultData: any)=>
    {
      console.log(resultData);
      alert("doctor deleted")
      this.getAllDoctor();

      this.firstName='';
      this.lastName;
      this.username='';
      this.email='';
      this.phone='';  
      this.city='';
      this.pincode='';
      this.password='';
      this.salary='';
      this.qualification='';   
      this.dob='';
      this.experience='';
      this.specialty='';
      this.bloodGroup='';
      this.gender=''
      
    });
  }


  openModal(){
    this.formModal.show();
  } 
  doSomething(){
    this.formModal.hide();
  }

}
