import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorWelcomeComponent } from './doctor-welcome.component';

describe('DoctorWelcomeComponent', () => {
  let component: DoctorWelcomeComponent;
  let fixture: ComponentFixture<DoctorWelcomeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DoctorWelcomeComponent]
    });
    fixture = TestBed.createComponent(DoctorWelcomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
