import { BookingComponent} from "./booking/booking.component";
import { CinemaComponent} from "./cinema/cinema.component";
import { CustomerComponent} from "./customer/customer.component";
import { LoginComponent} from "./login/login.component";
import { ScreeningComponent} from "./screening/screening.component";
import { MovieComponent} from "./movie/movie.component";
import { SeatComponent} from "./seat/seat.component";

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {RegisterComponent} from "./register/register.component";

const routes: Routes = [
  {path: '', redirectTo: "movie", pathMatch:"full"},
  {path: 'customer', component: CustomerComponent},
  {path: 'login', component: LoginComponent},
  {path: 'booking', component: BookingComponent},
  {path: 'cinema', component: CinemaComponent},
  {path: 'movie', component: MovieComponent},
  {path: 'screening', component: ScreeningComponent},
  {path: 'seat', component: SeatComponent},
  {path: 'register', component: RegisterComponent}
];

//const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
