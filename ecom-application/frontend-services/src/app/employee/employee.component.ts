import { Employee } from '../employee.model';
import { EmployeeService } from '../employee.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

   employee: Employee = new Employee();
  addEmployee(form)  {
    console.log(form.value);
  }
   
  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
  }
 createEmployee(): void {
    this.employeeService.createEmployee(this.employee)
        .subscribe( data => {
          alert("User created successfully.");
        });

  };

}
