import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { AdminSignupComponent } from './pages/admin/admin-signup/admin-signup.component';
import { AdminDashboardComponent } from './pages/admin/admin-dashboard/admin-dashboard.component';
import { AdminLoginComponent } from './pages/admin/admin-login/admin-login.component';
import {MatCardModule} from '@angular/material/card';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import { HomeComponent } from './pages/home/home.component';
import {MatButtonModule} from '@angular/material/button';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import { ReactiveFormsModule } from '@angular/forms';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
 

import { DoctorDashboardComponent } from './pages/doctor/doctor-dashboard/doctor-dashboard.component';
import { DoctorLoginComponent } from './pages/doctor/doctor-login/doctor-login.component';
import { DoctorSignupComponent } from './pages/doctor/doctor-signup/doctor-signup.component';
import { SidebarComponent } from './pages/admin/sidebar/sidebar.component';
import {MatListModule} from '@angular/material/list';
import { ProfileComponent } from './pages/admin/profile/profile.component';
import { WelcomeComponent } from './pages/admin/welcome/welcome.component';
import { DoctorInfoComponent } from './pages/admin/doctor-info/doctor-info.component';
import {MatTableModule} from '@angular/material/table';
import { PatientSignupComponent } from './pages/patient/patient-signup/patient-signup.component';
import { PatientLoginComponent } from './pages/patient/patient-login/patient-login.component';
import { PatientInfoComponent } from './pages/admin/patient-info/patient-info.component';
import { PatientDashboardComponent } from './pages/patient/patient-dashboard/patient-dashboard.component';
import { DotorUpdateComponent } from './pages/admin/dotor-update/dotor-update.component';
import { TestComponent } from './pages/test/test.component';
import { DoctorDataComponent } from './pages/admin/doctor-data/doctor-data.component';
import { DoctorSidebarComponent } from './pages/doctor/doctor-sidebar/doctor-sidebar.component';
import { DoctorProfileComponent } from './pages/doctor/doctor-profile/doctor-profile.component';
import { DoctorWelcomeComponent } from './pages/doctor/doctor-welcome/doctor-welcome.component';
import { PatientSidebarComponent } from './pages/patient/patient-sidebar/patient-sidebar.component';
import { PatientWelcomeComponent } from './pages/patient/patient-welcome/patient-welcome.component';
import { PatientProfileComponent } from './pages/patient/patient-profile/patient-profile.component';
import { HospitalServicesComponent } from './pages/hospital-services/hospital-services.component';
import { AboutComponent } from './pages/about/about.component';
import { NoticeComponent } from './pages/notice/notice.component';
import { NoticeBoardComponent } from './pages/notice-board/notice-board.component';
import { DoctorNoticeComponent } from './pages/doctor-notice/doctor-notice.component';
import { OnlinePaymentComponent } from './pages/online-payment/online-payment.component';







@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    AdminSignupComponent,
  
    AdminDashboardComponent,
    AdminLoginComponent,
    HomeComponent,
    DoctorDashboardComponent,
    DoctorLoginComponent,
    DoctorSignupComponent,
    SidebarComponent,
    
    ProfileComponent,
    WelcomeComponent,
    DoctorInfoComponent,
    PatientSignupComponent,
    PatientLoginComponent,
    PatientInfoComponent,
    PatientDashboardComponent,
    
    DotorUpdateComponent,
         TestComponent,
         DoctorDataComponent,
         DoctorSidebarComponent,
         DoctorProfileComponent,
         DoctorWelcomeComponent,
         PatientSidebarComponent,
         PatientWelcomeComponent,
         PatientProfileComponent,
         HospitalServicesComponent,
         AboutComponent,
         NoticeComponent,
         NoticeBoardComponent,
         DoctorNoticeComponent,
         OnlinePaymentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    FormsModule,
    HttpClientModule,
    MatSnackBarModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    MatTableModule,
    ReactiveFormsModule,
    MatProgressSpinnerModule
   ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
