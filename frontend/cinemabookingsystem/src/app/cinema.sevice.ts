import { Cinema } from './cinema';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CinemaService{
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getCinemas(): Observable<Cinema[]>{
    return this.http.get<Cinema[]>('${this.apiServerUrl}/cinema/all');
  }
  public addCinema(cinema: Cinema): Observable<Cinema[]>{
    return this.http.post<Cinema[]>('${this.apiServerUrl}/cinema/add', cinema);
  }

  public updateCinema(cinema: Cinema): Observable<Cinema[]>{
    return this.http.put<Cinema[]>('${this.apiServerUrl}/cinema/add', cinema);
  }

  public deleteCinema(cinemaID: Cinema): Observable<void>{
    return this.http.delete<void>('${this.apiServerUrl}/cinema/delete/${cinemaID}');
  }
}


