import { TestBed } from '@angular/core/testing';

import { PatientSignupService } from './patient-signup.service';

describe('PatientSignupService', () => {
  let service: PatientSignupService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PatientSignupService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
