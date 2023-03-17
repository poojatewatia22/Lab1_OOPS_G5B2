package com.glearning.itapp.service;

import com.glearning.itapp.model.Employee;

public interface CredentialService {
 public String generateCredentials(int maxLength);
 
 public String generateEmailAddress(String firstName,String lastName,String department,String Company);

 public void displayCredentials(Employee employee);

}
