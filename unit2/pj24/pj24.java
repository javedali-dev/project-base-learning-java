package unit2.pj24;

import java.io.*;
import java.util.*;

public class pj24 {
    int menuChoice=0;
    Scanner objectScanner= new Scanner(System.in);
    List<Employee> objectEmployeeList= new LinkedList<Employee>();
    public static void main(String[] args){
        System.out.println("Name:Javed Ali\nUID:18BCS6705");
        pj24 objectManager= new pj24();
        objectManager.displayMenu();
        while(objectManager.menuChoice!=5) {
            objectManager.displayMenu();
        }
    }
    void displayMenu()
    {
        System.out.println("\nMain Menu");
        System.out.println("1.Add an employee");
        System.out.println("2.Display All");
        System.out.println("3.Exit");
        menuChoice=objectScanner.nextInt();
        try
        {
            switch(menuChoice)
            {
                case 1:
                    getEmployeeInformationFromConsole();
                    break;
                case 2:
                    displayFromList(objectEmployeeList);
                    break;

                case 3:
                    System.out.println("Exiting the program");
                    System.exit(0);
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Exception is----->"+e);
        }
    }


    void getEmployeeInformationFromConsole()
    {
        System.out.println("Enter Employee ID:");
        try{
            int id=objectScanner.nextInt();
            System.out.println("Enter Employee Name:");
            String name=objectScanner.nextLine();
            objectScanner.nextLine();
            System.out.println("Enter Employee Age:");
            int age=objectScanner.nextInt();
            System.out.println("Enter Employee Salary:");
            double salary= objectScanner.nextDouble();
            objectEmployeeList.add(new Employee(id, name, salary, age));
        }
        catch(InputMismatchException e)
        {
            System.out.println(""+e);
        }
    }
    String displayFromList(List<Employee> objectList)
    {
        String status="";
        try{
            Iterator objectIterator= objectList.iterator();
            while(objectIterator.hasNext())
            {
                System.out.println(""+objectIterator.next());

            }
            status="Displayed Successfully";
            return status;
        }
        catch(Exception e)
        {
            status="Failure";
            return status;
        }
    }
}
//}
