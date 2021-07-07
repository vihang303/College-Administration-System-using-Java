package vihang;

import java.util.Scanner;

public class Email {
	 private String firstname;
	    private String lastname;
	    private String password;
	    private String department;
	    private String email;
	    private String deptname;
	    private String alternateEmail;
	    private String collegename="sggs.ac.in";
	    
	    Scanner in = new Scanner(System.in);

	    //Constructor
	    public Email(String firstname , String lastname){
	        this.firstname = firstname;
	        this.lastname = lastname;
	        //print name
	        System.out.print("Enter existing email : ");
	        alternateEmail = in.nextLine();
	        
	        this.department = Askdepartment();
	        //print dept
	        this.password = SetPassword();
	        //print password
	        email = firstname.toLowerCase() + lastname.toLowerCase()+ "."  + department + "@" + collegename;
	        	    }

	    
	    //Generate password
	    private String SetPassword(){
	    	String set = "ACabcdeFIJKfghi123456789!@#$&LmNoPQRStuvWXYZ";
	    	char[] password = new char[8];
	    	for(int i=0;i<8;i++) {
	    		int random = (int) (Math.random()*set.length());
	    		password[i] = set.charAt(random);
	    	}
	    	return new String (password);
	    	
	    }
	    
	    
	    //Askdept
	    private String Askdepartment(){
	        System.out.println("1.EXTC\n2.CSE\n3.IT\n4.Civil\n5.Mechanical ");
	        System.out.println("Enter the Department:");
	        Scanner in = new Scanner(System.in);
	        int choice = in.nextInt();
	        switch(choice){
	            case 1:
	            	deptname = "Electronics and Telecommunication";
	                return ("bec") ;
	            
	            case 2:
	            	deptname = "Computer Science";
	                return ("bcs") ;

	            case 3:
	            	deptname = "Information Technology";
	                return ("bit");

	            case 4:
	            	deptname = "Civil";
	                return ("bce");

	            case 5:
	            	deptname = "Mechanical";
	                return ("bme");

	            default:
	                return ""; 
	        }
	            
	    }
	    
	    public String getINFO() {
	    	return new String("\nNew Student Sucessfully Added \nName : " + firstname + " " + lastname +
	    			"\nDepartment = " + deptname + "\nEmail-id : " + email + "\nPassword = " + password );
	    }

}
