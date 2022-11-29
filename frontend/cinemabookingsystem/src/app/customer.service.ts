import { Customer } from './customer';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CustomerService{
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getCustomers(): Observable<Customer[]>{
    console.log(this.http.get<Customer[]>(`${this.apiServerUrl}/customer/findAllCustomers`));
    return this.http.get<Customer[]>(`${this.apiServerUrl}/customer/findAllCustomers`);
  }
  public addCustomer(customer: Customer): Observable<Customer[]>{
    return this.http.post<Customer[]>(`${this.apiServerUrl}/customer/add`, customer);
  }

  public updateCustomer(customer: Customer): Observable<Customer[]>{
    return this.http.put<Customer[]>('${this.apiServerUrl}/customer/add', customer);
  }

  public deleteCustomer(custID: Customer): Observable<void>{
    return this.http.delete<void>('${this.apiServerUrl}/customer/delete/${custID}');
  }
}

