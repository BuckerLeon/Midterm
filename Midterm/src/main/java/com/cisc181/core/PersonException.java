package com.cisc181.core;



import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PersonException extends Exception{
	
	private static Date DOB;
	private static String phone_number;
	
	public PersonException(){
		super("Yor DOB or phone number is not valid. Please check it.");
	}
	
	
	public PersonException(Date DOB){
		this.DOB = DOB;
	}
	
	public Date get_DOB(){
		return DOB;
	}
	
	public static int getage(){
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		
		int age = 0;
		birthDate.setTime(DOB);
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		return age;
	}
	
	public static boolean checkage(){
		int a = getage();
		try{
			if(a > 100){
				throw new PersonException();
			}
		}catch(PersonException e){
			System.out.println("The age is wrong, it should not over 100");
			return false;
		}
		return true;
	}
	
	public PersonException(String phone_number){
		this.phone_number = phone_number;
	}
	public void set_phone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public static String get_phone_number(){
		return phone_number;
	}
	
	public static boolean checkphonenumber(){
		String PN = get_phone_number();
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(PN);
		try{
			if(matcher.matches()){
				System.out.println("Your phone nubmer is valid." + PN);
			}else{
				throw new PersonException();
			}
		}catch(PersonException e){
			System.out.println("Your phone number is not valid." + PN);
			return false;
		}
		return true;
	}
	
	
}