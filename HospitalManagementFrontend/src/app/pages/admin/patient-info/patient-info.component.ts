import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import Swal from 'sweetalert2';
declare var window:any;

@Component({
  selector: 'app-patient-info',
  templateUrl: './patient-info.component.html',
  styleUrls: ['./patient-info.component.css']
})
export class PatientInfoComponent {

  formModal:any;

  PatientArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;
 
  
  firstName: string ="";
  lastName:string="";
  username: string ="";
  
  password:string="";
	dob:string="";
	email:string="";
	phone:string="";
	address:string="";
	insuranceProvider:string="";
	policyId:string="";
	reason:string="";
	dateAndTime:string="";
	history:string="";
	emergencyContact:string="";
	regiDate:string="";
	bloodGroup:string="";
	gender:string="";
  status:string=""

  currentPatientID = "";

  constructor(private http: HttpClient )
  {
    this.getAllPatient();
  }
  getAllPatient(){
    this.http.get("http://localhost:8080/api/v1/patient/getAllPatient")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.PatientArray = resultData;
    });

  }
  register()
  {
  
    let bodyData = {
      "firstName" : this.firstName,
      "lastName":this.lastName,
      "username":this.username,
    "password":this.password,
    "dob":this.dob,
    "email":this.email,
    "phone":this.phone,
    "address":this.address,
    "insuranceProvider":this.insuranceProvider,
    "policyId":this.policyId,
    "reason":this.reason,
    "dateAndTime":this.dateAndTime,
    "history":this.history,
    "emergencyContact":this.emergencyContact,
    "regiDate":this.regiDate,
    "bloodGroup":this.bloodGroup,
    "gender":this.gender,
     "status":this.status,
      
    };
    this.http.post("http://localhost:8080/api/v1/patient/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Patient Registered Successfully");
        this.getAllPatient();
        this.firstName='',
        this.lastName='',
        this.username='',
        
        this.password='';
        this.dob='';
        this.email='';
        this.phone='';
        this.address='';
        this.insuranceProvider='';
        this.policyId='';
        this.reason='';
        this.dateAndTime='';
        this.history='';
        this.emergencyContact='';
        this.regiDate='';
        this.bloodGroup='';
       


        this.gender='',
        this.status=''

    });
  }
  setUpdate(data:any){
    this.firstName=data.firstName;
    this.lastName=data.lastName;
    this.username=data.username;
    this.currentPatientID=data.patientId;
    this.password=data.password;
    this.dob=data.dob;
    this.email=data.email;
    this.phone=data.phone;
    this.address=data.address;
    this.insuranceProvider=data.insuranceProvider;
    this.policyId=data.policyId;
    this.reason=data.reason;
    this.dateAndTime=data.dateAndTime;
    this.history=data.history;
    this.emergencyContact=data.emergencyContact;
    this.regiDate=data.regiDate;
    this.bloodGroup=data.bloodGroup;
    this.status=data.status;
    



    
    this.gender=data.gender;
  }
  updateRecords(){
    let bodyData={
      "patientId":this.currentPatientID,
      "firstName":this.firstName,
      "lastName":this.lastName,
      "username":this.username,
      "password":this.password,
      "dob":this.dob,
      "email":this.email,
      "phone":this.phone,
      "address":this.address,
      "insuranceProvider":this.insuranceProvider,
      "policyId":this.policyId,
      "reason":this.reason,
      "dateAndTime":this.dateAndTime,
      "history":this.history,
      "emergencyContact":this.emergencyContact,
      "regiDate":this.regiDate,
      "bloodGroup":this.bloodGroup,

     

      "gender": this.gender,
      "status":this.status,
      
    };
    this.http.put("http://localhost:8080/api/v1/patient/update",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("patient updated Successfully");
        this.getAllPatient();
        this.firstName='';
        this.username='';
        this.lastName='';
        this.password='';
        this.dob='';
        this.email='';
        this.phone='';
        this.address='';
        this.insuranceProvider='';
        this.policyId='';
        this.reason='';
        this.dateAndTime='';
        this.history='';
        this.emergencyContact='';
        this.regiDate='';
        this.bloodGroup='';


        this.gender='';
        this.status='';
    });
  }
  save(){
    if(this.currentPatientID== ''){
      this.register();
    }
    else{
      this.updateRecords();
    }
  }
  setDelete(data:any){
    this.http.delete("http://localhost:8080/api/v1/patient/deletepatient"+ "/"+ data.patientId,{responseType: 'text'}).subscribe((resultData: any)=>
    {
      console.log(resultData);
      alert("patient deleted")
      this.getAllPatient();

      this.firstName='';
      this.lastName;
      this.username='';
      
      this.password='';
      this.dob='';
      this.email='';
      this.phone='';
      this.address='';
      this.insuranceProvider='';
      this.policyId='';
      this.reason='';
      this.dateAndTime='';
      this.history='';
      this.emergencyContact='';
      this.regiDate='';
      this.bloodGroup='';

      this.gender='',
      this.status=''
      
    });
  }


  openModal(){
    this.formModal.show();
  } 
  doSomething(){
    this.formModal.hide();
  }

}