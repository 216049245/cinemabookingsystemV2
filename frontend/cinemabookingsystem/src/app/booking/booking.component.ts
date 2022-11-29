import { Booking } from '../booking';
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit} from "@angular/core";
import { BookingService } from '../booking.service';
import { ModalService } from '../_modal';
import {Customer} from "../customer";
import {CustomerService} from "../customer.service";

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})

export class BookingComponent{

  public bookings: Booking[] = [];
  public customer: Customer[] = [];


  constructor(private bookingService: BookingService, private customerService: CustomerService,
              private modalService: ModalService) { }

  /*ngOnInit(): {
    /!*this.getAllBookings();
    this.getAllCustomers();*!/
  }*/

}


