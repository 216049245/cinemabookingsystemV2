import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})

export class LoginService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public login(email: string, password: string){
    const headers = new HttpHeaders({Authorization: 'Basic '+btoa(email+":"+password)})
    return this.http.get('${this.apiServerUrl)/customer' ,{headers, responseType: 'text' as 'json'});
  }
}
