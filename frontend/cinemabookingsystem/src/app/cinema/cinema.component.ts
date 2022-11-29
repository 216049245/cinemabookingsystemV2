//import { CinemaService } from '../cinema.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cinema',
  templateUrl: './cinema.component.html',
  styleUrls: ['./cinema.component.css']
})

export class CinemaComponent implements OnInit
{

  cinemaID: number = 0;
  cinemaName: string = "";
  cinemaLocation: string = "";

 // constructor(private cinemaService: CinemaService, private router: Router) {}

  ngOnInit(){

  }
}
 /*Location is a service available in Angular 2+ apps that makes it easy to interact with the current URL path.*/
