import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientWelcomeComponent } from './patient-welcome.component';

describe('PatientWelcomeComponent', () => {
  let component: PatientWelcomeComponent;
  let fixture: ComponentFixture<PatientWelcomeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PatientWelcomeComponent]
    });
    fixture = TestBed.createComponent(PatientWelcomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
