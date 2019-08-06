/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmanagementsystem;
import java.util.Scanner;
/**
 *
 * @author Abuga Aroni
 */
public class RentalManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//input for the user to select what they would like to do with the program
Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);

System.out.println ("Welcome to the rental management system, what would you like to do today?");
System.out.println ("If you would like input a new entry into the system, input 'entry' below");
System.out.println ("If you would like to view record details, input 'view' below");
System.out.println ("If you would like to edit a record, input 'edit'");

// i is variable that will determine which if or while statement is executed below
String i = null;
i=input1.nextLine();

if ("entry".equals(i)) {
System.out.println ("If you would like add a new entry to the House records, press 1. "+ "Press 2 for the client records, 3 for Contracts, 4 for the Caretaker records, "
        + "5 for the Caretakers contracts, "
        + "and 6 for Guarantor details");

// x is the variable that will determine in what a class a next entry (object) will be created and made
int x = 0;
x=input2.nextInt();

if (x==1) {
Scanner h1 = new Scanner(System.in);
Scanner ah1 = new Scanner(System.in);
Scanner No1 = new Scanner(System.in);
Scanner t1 = new Scanner(System.in);

House Guarantor1 = new Guarantor ();
    System.out.println("You have opted to enter a new entry for a Guarantor" + "Please enter the first entry - Guarantors ID");
Guarantor1.setGuarantorID_No(g1.nextInt());
    System.out.println("Please enter the Guarantors first name");
Guarantor1.setFname(f1.nextLine());    
    System.out.println("Please enter their last name next");
Guarantor1.setLname(l1.nextLine());    
    System.out.println("Please enter their address next");    
Guarantor1.setAddress(a1.nextLine());            
    System.out.println("Lastly, please enter their phone number");    
Guarantor1.setPhoneNo(p1.nextInt());    

Guarantor1.showGdetails();}

//Inputing a new user into the guarator class
else if (x==6) {
Scanner g1 = new Scanner(System.in);
Scanner a1 = new Scanner(System.in);
Scanner f1 = new Scanner(System.in);
Scanner l1 = new Scanner(System.in);
Scanner p1 = new Scanner(System.in);

Guarantor Guarantor1 = new Guarantor ();
    System.out.println("You have opted to enter a new entry for a Guarantor" + "Please enter the first entry - Guarantors ID");
Guarantor1.setGuarantorID_No(g1.nextInt());
    System.out.println("Please enter the Guarantors first name");
Guarantor1.setFname(f1.nextLine());    
    System.out.println("Please enter their last name next");
Guarantor1.setLname(l1.nextLine());    
    System.out.println("Please enter their address next");    
Guarantor1.setAddress(a1.nextLine());            
    System.out.println("Lastly, please enter their phone number");    
Guarantor1.setPhoneNo(p1.nextInt());    

//showdetail we have inputed
Guarantor1.showGdetails();
}      
    }
    
}
}
