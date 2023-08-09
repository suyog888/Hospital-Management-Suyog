import { HttpClient } from '@angular/common/http';
import { Component,OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
//import {PatientInterface} from '../patient-interface';
import { PatientLoginComponent } from '../patient-login/patient-login.component';
import { MatSnackBar } from '@angular/material/snack-bar';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-patient-profile',
  templateUrl: './patient-profile.component.html',
  styleUrls: ['./patient-profile.component.css']
})
export class PatientProfileComponent implements OnInit {
  //record: PatientInterface={username:'any',password:'any'};


  //constructor(private route: ActivatedRoute, private http: HttpClient,private patientLogin:PatientLoginComponent,private snacl:MatSnackBar) {}


   login(){
    Swal.fire();
   
  }
  

  ngOnInit(): void {
  //   // this.route.params.subscribe((params) => {
  //   //   const username = params['username'];
  //   //   this.fetchRecordByUsername(username);
  //   // });
   }

  // fetchRecordByUsername(username: string): void {
  //   this.http.get(`http://localhost:8080/api/v1/patient/${username}`).subscribe(
  //     (response) => {
  //      // this.record = response;
  //       console.log(response);
  //     },
  //     (error) => {
  //       console.error('Error fetching record:', error);
  //     }
  //   );
  // }
 

}
