// Author: Trevor Hanson
// Date: 07-31-2019
// Task: Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.
// Create two Employee objects and display the yearly salary for each Employee. Your code must contain at least two comments.

public class AccountTest {

    public static void main(String[] args){

        Account emp1 = new Account( "John", " Smith", 5000.00 );
        Account emp2 = new Account( "Jane", " Doe", 8000.00 );

        // display employee 1's name and initial salary
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary() );

        // display employee 2's name and initial yearly salary
        System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary() );




    }
} // end of class AccountTest
