package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.eNums.eTitle;
import com.cisc181.core.PersonException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

public class Staff_Test1 extends Person {
	

	@Test
	public void test() throws ParseException{
		Date DOB1 = new SimpleDateFormat("yyyy-MM-dd").parse("1956-10-11");
		Date DOB2 = new SimpleDateFormat("yyyy-MM-dd").parse("1987-1-15");;
		Date DOB3 = new SimpleDateFormat("yyyy-MM-dd").parse("1986-10-31");
		Date DOB4 = new SimpleDateFormat("yyyy-MM-dd").parse("1695-2-12");
		Date DOB5 = new SimpleDateFormat("yyyy-MM-dd").parse("1986-1-1");
		Date hireDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-19");
		Date hireDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("2006-2-19");
		Date hireDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("2011-5-29");
		Date hireDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("2009-10-22");
		Date hireDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("2002-6-5");

		Staff staff1 = new Staff("person1_FirstName","person1_MiddleName","person1_LAstName", DOB1, "183 XXX Way, Newark, DE", "302-959-6953","person1@gmail.com","Mon 3 PM", 2, 2000, hireDate1, eTitle.Title1 );
		Staff staff2 = new Staff("person2_FirstName","person2_MiddleName","person2_LAstName", DOB2, "165 XXX Way, Elkton, MD", "302-552-2395","person2@gmail.com","Tue 5 PM", 1, 2600, hireDate2, eTitle.Title2 );
		Staff staff3 = new Staff("person3_FirstName","person3_MiddleName","person3_LAstName", DOB3, "984 XXX Way, Newark, DE", "302-2236-592","person3@gmail.com","Wen 9 AM", 3, 1800, hireDate3, eTitle.Title3 );
		Staff staff4 = new Staff("person4_FirstName","person4_MiddleName","person4_LAstName", DOB4, "651 XXX Way, Elkton, MD", "302-623-4822","person4@gmail.com","Thu 3 PM", 2, 2100, hireDate4, eTitle.Title3 );
		Staff staff5 = new Staff("person5_FirstName","person5_MiddleName","person5_LAstName", DOB5, "845 XXX Way, Elkton, MD", "362-999-6628","person5@gmail.com","Fri 2 PM", 1, 1600, hireDate5, eTitle.Title2 );
		
		ArrayList<Staff> mylist = new ArrayList<Staff>();
		mylist.add(staff1);
		mylist.add(staff2);
		mylist.add(staff3);
		mylist.add(staff4);
		mylist.add(staff5);
		
		setDOB(staff1.getDOB());
		boolean testage1 = PersonException.checkage();
		assertTrue(testage1 == true);
		setDOB(staff2.getDOB());
		boolean testage2 = PersonException.checkage();
		assertTrue(testage2 == true);
		setDOB(staff3.getDOB());
		boolean testage3 = PersonException.checkage();
		assertTrue(testage3 == true);
		setDOB(staff4.getDOB());
		boolean testage4 = PersonException.checkage();
		assertTrue(testage4 == false);
		setDOB(staff5.getDOB());
		boolean testage5 = PersonException.checkage();
		assertTrue(testage5 == true);
		
		setPhone(staff1.getPhone());
		boolean testphone1 = PersonException.checkphonenumber();
		assertTrue(testphone1 == true);
		setPhone(staff2.getPhone());
		boolean testphone2 = PersonException.checkphonenumber();
		assertTrue(testphone2 == true);
		setPhone(staff3.getPhone());
		boolean testphone3 = PersonException.checkphonenumber();
		assertTrue(testphone3 == false);
		setPhone(staff4.getPhone());
		boolean testphone4 = PersonException.checkphonenumber();
		assertTrue(testphone4 == true);
		setPhone(staff5.getPhone());
		boolean testphone5 = PersonException.checkphonenumber();
		assertTrue(testphone5 == true);
		
	}




	private void assertEqual(int i, double average_salary, double d) {
		Employee staff1 = null;
		Employee staff2 = null;
		Employee staff3 = null;
		Employee staff4 = null;
		Employee staff5 = null;
		
		double average_salary1 = (staff1.getSalary() + staff2.getSalary() +staff3.getSalary() + staff4.getSalary() + staff5.getSalary()) / 5;
		assertEqual(2020, average_salary1, 0.1);
		
	}
	
			
	

}
