import { Component } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

import { ICustomerDetails } from '../customer-details.model';
import { CustomerDetailsService } from '../service/customer-details.service';

@Component({
  templateUrl: './customer-details-delete-dialog.component.html',
})
export class CustomerDetailsDeleteDialogComponent {
  customerDetails?: ICustomerDetails;

  constructor(protected customerDetailsService: CustomerDetailsService, public activeModal: NgbActiveModal) {}

  cancel(): void {
    this.activeModal.dismiss();
  }

  confirmDelete(id: number): void {
    this.customerDetailsService.delete(id).subscribe(() => {
      this.activeModal.close('deleted');
    });
  }
}
