//package EmailAppPackage;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class EmailApp{
	
private String firstName;
private String lastName;
private String mailId;
private String password;
private float mailBoxCap;
private String altEmailId;
private String domain;
private final String COMPANY_NAME = "mongoose";
private final int PASS_LENGTH = 12;


public EmailApp(){

}

public EmailApp(String firstName, String lastName, String mailId, String password, float mailBoxCap,  String altEmailId){
 this.firstName = firstName;
 this.lastName = lastName;
 this.mailId = mailId;
 this.password = password;
 this.mailBoxCap = mailBoxCap;
 this.altEmailId = altEmailId;
}

public void setFirstName(String firstName){
 this.firstName = firstName;
}

public void setLastName(String lastName){
 this.lastName = lastName;
}

public void setMailID(String mailId){
 this.mailId = mailId;
}

public void setPassword(String password){
 this.password = password;
}

public void setMailBoxCap(float mailBoxCap){
 this.mailBoxCap = mailBoxCap;
}

public void setAltMailID(String altEmailId){
 this.altEmailId = altEmailId;
}

public void setDomain(String domain){
 this.domain = domain;
}

public String getFirstName(){
 return this.firstName;
}

public String getLastName(){
 return this.lastName;
}

public String getMailID(){
 return this.mailId;
}

public String getPassword(){
 return this.password;
}

public float getMailBoxCap(){
 return this.mailBoxCap;
}

public String getAltMailID(){
 return this.altEmailId;
}

public String getDomain(){
 return this.domain;
}

public void formMailID(){
	this.mailId = this.firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain + "." + COMPANY_NAME + ".com";
}

public void listDepts(){
	System.out.println("1. HR");
	System.out.println("2. Operations");
	System.out.println("3. Finance");
	System.out.println("4. Logistics");
	
} 

public void formPassword(){
 String passString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
 int length = passString.length();
 this.password ="";
 Random rdm = new Random();
 int num;

 for(int i=0; i<PASS_LENGTH; i++){
 	num = Math.abs(rdm.nextInt());
 	this.password+=passString.charAt((num%length));
 }

}
public void setMailIDbyDept(){
	Scanner obj = new Scanner(System.in);

	if (this.firstName == null){
		System.out.println("Enter the first name:");
		this.firstName = obj.next();
	}

	if (this.lastName == null ){
		System.out.println("Enter the Second name:");
		this.lastName = obj.next();
	}

	if (this.domain == null ){
		System.out.println("Select the domain from the below list:");
		listDepts();
		int i = obj.nextInt();
		switch(i){
		 case 1: 
		  this.domain = "hr";
		  break;
		 case 2:
		  this.domain = "ops";
		  break;
		 case 3:
		  this.domain = "fin";
		  break;
		 case 4:
		  this.domain = "lgs";
		  break;
		 default:
		  this.domain = "general";
     }

     formMailID();
     System.out.println("Email Id for the employee is: " + this.mailId);
     if(this.password == null)
     	formPassword();
     System.out.println("Password for the mail Id is: " + getPassword());
	}
}

}