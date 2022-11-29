import { Booking } from './booking';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BookingService{
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getBooking(): Observable<Booking[]>{
    return this.http.get<Booking[]>('${this.apiServerUrl}/booking/all');
  }
  public addBooking(booking: Booking): Observable<Booking[]>{
    return this.http.post<Booking[]>('${this.apiServerUrl}/booking/add', booking);
  }

  public updateBooking(booking: Booking): Observable<Booking[]>{
    return this.http.put<Booking[]>('${this.apiServerUrl}/booking/add', booking);
  }

  public deleteBooking(bookingNumber: Booking): Observable<void>{
    return this.http.delete<void>('${this.apiServerUrl}/booking/delete/${bookingNumber}');
  }
}
