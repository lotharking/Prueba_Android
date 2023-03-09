import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarbeginComponent } from './navbarbegin.component';

describe('NavbarbeginComponent', () => {
  let component: NavbarbeginComponent;
  let fixture: ComponentFixture<NavbarbeginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NavbarbeginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NavbarbeginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
