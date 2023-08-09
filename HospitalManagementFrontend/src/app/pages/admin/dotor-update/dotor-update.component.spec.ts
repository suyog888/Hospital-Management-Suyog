import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DotorUpdateComponent } from './dotor-update.component';

describe('DotorUpdateComponent', () => {
  let component: DotorUpdateComponent;
  let fixture: ComponentFixture<DotorUpdateComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DotorUpdateComponent]
    });
    fixture = TestBed.createComponent(DotorUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
