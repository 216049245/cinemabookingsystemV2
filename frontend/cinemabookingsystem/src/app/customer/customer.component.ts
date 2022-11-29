import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-user',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  // static validateUser(): boolean {
  //   throw new Error('Method not implemented.');
  // }

  public customers: Customer[] = [];

  constructor(private customerService: CustomerService) { }

  ngOnInit() {
    this.getCustomers();

  }

  public getCustomers(): void {
    this.customerService.getCustomers().subscribe((response: Customer[]) => {
        this.customers = response;
      }, (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
