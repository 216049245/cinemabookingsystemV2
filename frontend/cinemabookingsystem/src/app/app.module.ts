import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BookingComponent} from "./booking/booking.component";
import {LoginComponent} from "./login/login.component";
import {CinemaComponent} from "./cinema/cinema.component";
import {SeatComponent} from "./seat/seat.component";
import {HttpClientModule} from "@angular/common/http";
import { RegisterComponent } from './register/register.component';
import {CustomerComponent} from "./customer/customer.component";

@NgModule({
  declarations: [
    AppComponent,
    BookingComponent,
    CustomerComponent,
    LoginComponent,
    CinemaComponent,
    SeatComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
