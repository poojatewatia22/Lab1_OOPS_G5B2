package com.glearning.itapp.client;
import java.util.Scanner;

import com.glearning.itapp.model.Employee;
import com.glearning.itapp.service.CredentialServiceImp;
public class  Main{
	public static void main(String[] args) {
		
		Employee employee = new Employee("pooja","Tewatia");
		employee.setCompany("tcs");
		CredentialServiceImp credentialService = new CredentialServiceImp();
		System.out.println("please Enter the details");
		System.out.println("1.technical");
		System.out.println("2.admin");
		System.out.println("3.human resource");
		System.out.println("4.legal");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		
		switch(option) {
		case 1:
			String generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
			
			employee.getLastName().toLowerCase(), "technical", employee.getCompany().toLowerCase());
			
			String generatedPassword = credentialService.generateCredentials(20);
			
			employee.setEmail(generatedEmail);
			
			employee.setPassword(generatedPassword);
			
			credentialService.displayCredentials(employee);
			
			break;
		case 2:
			String generatedEmail1 = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					
					employee.getLastName().toLowerCase(), "admin", employee.getCompany().toLowerCase());
					
					String generatedPassword1 = credentialService.generateCredentials(20);
					
					employee.setEmail(generatedEmail1);
					
					employee.setPassword(generatedPassword1);
					
					credentialService.displayCredentials(employee);
					
					break;
		case 3:
			String generatedEmail2 = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					
					employee.getLastName().toLowerCase(), "Human Resource", employee.getCompany().toLowerCase());
					
					String generatedPassword2 = credentialService.generateCredentials(20);
					
					employee.setEmail(generatedEmail2);
					
					employee.setPassword(generatedPassword2);
					
					credentialService.displayCredentials(employee);
					
					break;
		case 4:
			
			String generatedEmail3 = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
			
			employee.getLastName().toLowerCase(), "legal", employee.getCompany().toLowerCase());
			
			String generatedPassword3 = credentialService.generateCredentials(20);
			
			employee.setEmail(generatedEmail3);
			
			
			employee.setPassword(generatedPassword3);
			
			credentialService.displayCredentials(employee);
			
			break;
		
		default: 
			System.out.println("Enter a vaid option");}
	}


}