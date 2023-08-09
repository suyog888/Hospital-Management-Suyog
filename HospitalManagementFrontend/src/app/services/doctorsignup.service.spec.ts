import { TestBed } from '@angular/core/testing';

import { DoctorsignupService } from './doctorsignup.service';

describe('DoctorsignupService', () => {
  let service: DoctorsignupService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DoctorsignupService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
