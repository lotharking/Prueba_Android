import { TestBed } from '@angular/core/testing';

import { UpdateProductsServiceService } from './update-products-service.service';

describe('UpdateProductsServiceService', () => {
  let service: UpdateProductsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UpdateProductsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
