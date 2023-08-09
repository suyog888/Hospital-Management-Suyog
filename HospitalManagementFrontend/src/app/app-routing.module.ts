import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminSignupComponent } from './pages/admin/admin-signup/admin-signup.component';
import { HomeComponent } from './pages/home/home.component';
import { AdminLoginComponent } from './pages/admin/admin-login/admin-login.component';
import { AdminDashboardComponent } from './pages/admin/admin-dashboard/admin-dashboard.component';
import { DoctorLoginComponent } from './pages/doctor/doctor-login/doctor-login.component';
import { DoctorDashboardComponent } from './pages/doctor/doctor-dashboard/doctor-dashboard.component';
import { DoctorSignupComponent } from './pages/doctor/doctor-signup/doctor-signup.component';
import { ProfileComponent } from './pages/admin/profile/profile.component';
import { WelcomeComponent } from './pages/admin/welcome/welcome.component';
import { DoctorInfoComponent } from './pages/admin/doctor-info/doctor-info.component';
import { PatientSignupComponent } from './pages/patient/patient-signup/patient-signup.component';
import { PatientLoginComponent } from './pages/patient/patient-login/patient-login.component';
import { PatientInfoComponent } from './pages/admin/patient-info/patient-info.component';
import { PatientDashboardComponent } from './pages/patient/patient-dashboard/patient-dashboard.component';
import { DotorUpdateComponent } from './pages/admin/dotor-update/dotor-update.component';
import { DoctorDataComponent } from './pages/admin/doctor-data/doctor-data.component';
import { DoctorWelcomeComponent } from './pages/doctor/doctor-welcome/doctor-welcome.component';
import { DoctorProfileComponent } from './pages/doctor/doctor-profile/doctor-profile.component';
import { PatientWelcomeComponent } from './pages/patient/patient-welcome/patient-welcome.component';
import { PatientProfileComponent } from './pages/patient/patient-profile/patient-profile.component';
import { HospitalServicesComponent } from './pages/hospital-services/hospital-services.component';
import { AboutComponent } from './pages/about/about.component';
import { NoticeComponent } from './pages/notice/notice.component';
import { NoticeBoardComponent } from './pages/notice-board/notice-board.component';
import { OnlinePaymentComponent } from './pages/online-payment/online-payment.component';


const routes: Routes = [
  {
    path:'login',
    component:AdminLoginComponent,
    
  },
  {
    path:'',
    component:HomeComponent,
   
  },
  {path:'signup',
  component:AdminSignupComponent,

}, 
{
  path:'admindashboard',
  component:AdminDashboardComponent,
  children:[
    {
      path:'',
      component:WelcomeComponent,
    },
    {
      path:'profile',
      component:ProfileComponent,
    },
    {
      path:'docinfo',
      component:DoctorInfoComponent,
    },
    {
      path:'patientinfo',
      component:PatientInfoComponent,
    },
    {path:'doctordata',
    component:DoctorDataComponent,
  }
  ]
},
{
  path:'doctorlogin',
  component:DoctorLoginComponent,

},
{
  path:'doctordashboard',
  component:DoctorDashboardComponent,
  children:[
    {
      path:'',
      component:DoctorWelcomeComponent,
    },
    {
      path:'doctorprofile',
      component:DoctorProfileComponent,
    },
    {
      path:'patientinfo',
      component:PatientInfoComponent,

    }
  ]
},

{
  path:'doctorsignup',
  component:DoctorSignupComponent,
},
{
  path:'patientsignup',
  component:PatientSignupComponent
},
{
  path:'patientlogin',
  component:PatientLoginComponent
},
{
  path:'patientDashboard',
  component:PatientDashboardComponent,
  children:[
    {
      path:'',
      component:PatientWelcomeComponent,
    },
    {
      path:'patientProfile',
      component:PatientProfileComponent,

    }
  ]
},
{
  path:'doctorUpdate',
  component:DotorUpdateComponent
},
{
  path:'patientlogin/:username',
  component:PatientProfileComponent
},
{
  path:'hospitalServices',
  component:HospitalServicesComponent,
},{
  path:'aboutus',
  component:AboutComponent
},
{
  path:'notice',
  component:NoticeComponent
},
{
  path:'noticeboard',
  component:NoticeBoardComponent
},
{path:'onlinepay',
component:OnlinePaymentComponent
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
