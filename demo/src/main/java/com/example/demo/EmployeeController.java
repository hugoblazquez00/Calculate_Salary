package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
public class EmployeeController {
    @GetMapping("/calculateSalaryPreTaxes")
	public Employee calculateSalaryPreTaxes(
		@RequestParam ("type") String type, 
		@RequestParam ("monthlySales") int monthlySales, 
		@RequestParam ("extraHours") int extraHours
	) {
		Employee employee = new Employee();
		
		employee.setType(type);
		employee.setMonthlySales(monthlySales);
		employee.setExtraHours(extraHours);
		employee.setBaseSalary();
		employee.setFinalSalary(employee.getBaseSalary());
		employee.setBonus();


		if (monthlySales > 1000 && monthlySales < 1500) {
			employee.setFinalSalary(employee.getFinalSalary() + 100);
		}
		else if(monthlySales > 1500){	
			employee.setFinalSalary(employee.getFinalSalary() + 200);
		}
		employee.setFinalSalary(employee.getFinalSalary() + (employee.getExtraHours() * employee.getBonus()));

		return  employee;
	}


	@GetMapping("/calculateSalaryPostTaxes")
	public Employee calculateSalaryPostTaxes(
		@RequestParam ("type") String type, 
		@RequestParam ("monthlySales") int monthlySales, 
		@RequestParam ("extraHours") int extraHours
	) {
		Employee employee = new Employee();
		
		employee.setType(type);
		employee.setMonthlySales(monthlySales);
		employee.setExtraHours(extraHours);
		employee.setBaseSalary();
		employee.setFinalSalary(employee.getBaseSalary());
		employee.setBonus();


		if (monthlySales > 1000 && monthlySales < 1500) {
			employee.setFinalSalary(employee.getFinalSalary() + 100);
		}
		else if(monthlySales > 1500){	
			employee.setFinalSalary(employee.getFinalSalary() + 200);
		}
		employee.setFinalSalary(employee.getFinalSalary() + (employee.getExtraHours() * employee.getBonus()));
		if(employee.getFinalSalary()> 1000 && employee.getFinalSalary() <=1500){
			employee.setFinalSalary(employee.getFinalSalary()*0.84);
		}else if(employee.getFinalSalary()>1500){
			employee.setFinalSalary(employee.getFinalSalary()*0.82);
		}
		return  employee;
	}

    
}
