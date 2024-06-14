package interfaces.main;

import interfaces.implementation.ValidName;
import interfaces.study.Validator;

public class MainValidtor {
	public static void main(String[] args) {
		Validator valid=new ValidName();
		
		String name ="krissh";
		
		if (valid.isValid(name)) {
			System.out.println(name + "is valid property ");}
		else
			System.out.println(name +" is not valid property");
		}
	
	Validtor validNumber =new ValidName();
	
	String number ="8433557670"
	if (validNumber.isValid(number)){
		System.out.println(number + "is valid property ");}
	else
		System.out.println(number +" is not valid property");
	}
}


