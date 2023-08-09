import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorNoticeComponent } from './doctor-notice.component';

describe('DoctorNoticeComponent', () => {
  let component: DoctorNoticeComponent;
  let fixture: ComponentFixture<DoctorNoticeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DoctorNoticeComponent]
    });
    fixture = TestBed.createComponent(DoctorNoticeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
