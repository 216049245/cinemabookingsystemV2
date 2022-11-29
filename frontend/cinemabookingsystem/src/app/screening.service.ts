import { Screening } from './screening';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class ScreeningService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getScreening(): Observable<Screening[]>{
    return this.http.get<Screening[]>(`${this.apiServerUrl}/api/screening/all`);
  }

  public addScreening(screening: Screening): Observable<Screening>{
    return this.http.post<Screening>(`${this.apiServerUrl}/api/screening/add`, screening);
  }

  public updateScreening(screening: Screening): Observable<Screening>{
    return this.http.put<Screening>(`${this.apiServerUrl}/api/screening/update`, screening);
  }

  public deleteScreening(screeningID: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/seat/delete/${screeningID}`);
  }
}
