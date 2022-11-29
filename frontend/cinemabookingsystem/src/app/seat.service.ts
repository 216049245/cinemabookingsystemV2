import { Seat } from './seat';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class SeatService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getSeats(): Observable<Seat[]>{
    return this.http.get<Seat[]>(`${this.apiServerUrl}/api/seat/all`);
  }

  public addSeat(seat: Seat): Observable<Seat>{
    return this.http.post<Seat>(`${this.apiServerUrl}/api/seat/add`, seat);
  }

  public updateSeat(seat: Seat): Observable<Seat>{
    return this.http.put<Seat>(`${this.apiServerUrl}/api/seat/update`, seat);
  }

  public deleteSeat(seatNumber: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/seat/delete/${seatNumber}`);
  }
}
