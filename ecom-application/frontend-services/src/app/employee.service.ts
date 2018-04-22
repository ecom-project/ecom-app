import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class EmployeeService {

  constructor(private http:HttpClient) { }
   private userUrl = 'http://localhost:8080/api/v1/employee/save';
  
    public createEmployee(employee) {
    return this.http.post(this.userUrl, employee);
  }


}
