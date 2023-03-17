package com.glearning.itapp.service;
import java.util.Random;

import com.glearning.itapp.model.Employee;

public class CredentialServiceImp implements CredentialService {
	private static final String CHAR_UPPER = "ABCDEFGHIJKLN";
	private static final String CHAR_LOWER = "abcdefghijklmn";
	private static final String NUMBERS = "1234567890";
	private static final String SPECIAL_CHAR = "!@#$%^&*";
	private static final String PASSWORD_ALLOW_BASE =(CHAR_UPPER+CHAR_LOWER+
			                                             NUMBERS+SPECIAL_CHAR);
	private static final Random random = new Random();
	@Override
	public String generateCredentials(int maxLength){
		
			StringBuilder passwordBuilder = new StringBuilder(maxLength);
			passwordBuilder.append(CHAR_LOWER.charAt
					                        (random.nextInt(CHAR_LOWER.length())));
			passwordBuilder.append(CHAR_UPPER.charAt
	                                      (random.nextInt(CHAR_UPPER.length())));
			passwordBuilder.append(NUMBERS.charAt
	                                        (random.nextInt(NUMBERS.length())));
			passwordBuilder.append(SPECIAL_CHAR.charAt
	                                     (random.nextInt(SPECIAL_CHAR.length())));
			for(int i = 4;i < maxLength; i++) {
				passwordBuilder.append(PASSWORD_ALLOW_BASE.charAt
						               (random.nextInt(PASSWORD_ALLOW_BASE.length())));
			}
			char[] passwordChars = passwordBuilder.toString().toCharArray();
			for(int i = 0;i < passwordChars.length; i++) {
				int j = random.nextInt(passwordChars.length);
				char temp = passwordChars[j];
				passwordChars[i] = passwordChars[j];
				passwordChars[j] = temp;
			
				return new String(passwordChars); 
	}
			return null;
		}

	@Override
	public String generateEmailAddress(String firstName, String lastName,
			                             String department, String company) {
		
	String generatedEmail = firstName+lastName+"@"+department+"."
	                                                          +company+".Com";
	
		
		return generatedEmail;
	}

	@Override
	public void displayCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+"your generated credentials are as follows");
	System.out.println("Email\t\t"+employee.getEmail());
	System.out.println("Password\t\t"+employee.getPassword());
	}
	}	
		
	

    
	

	


