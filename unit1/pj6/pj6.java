package unit1.pj6;

import java.util.ArrayList;
import java.util.Scanner;

public class pj6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int choice;
        ArrayList<String> Container = new ArrayList<String>();
        do
        {

            System.out.println("1.Insert");
            System.out.println("2.Search");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println();
            System.out.println("Enter your choice");
            choice=scan.nextInt();

            switch(choice)
            {

                case 1:
                    System.out.println("Enter the item to be inserted");
                    String item1=scan.next();
                    Container.add(item1);
                    System.out.println("Inserted Successfully");
                    break;

                case 2:
                    System.out.println("Enter the item to be search:");
                    String item2=scan.next();
                    if(Container.contains(item2))
                    {
                        System.out.println("Item found in the list");
                    }
                    else
                    {
                        System.out.println("Item not found in the list");
                    }
                    break;

                case 3:
                    System.out.println("Enter the item to delete");
                    String item3=scan.next();

                    if(Container.contains(item3))
                    {
                        Container.remove(item3);
                        System.out.println("Deleted Successfully");
                    }
                    else
                    {
                        System.out.println("Item not present in the list");
                    }


                    break;


                case 4:
                    System.out.println("The item in the list are");

                    for(int i=0;i<Container.size();i++)
                    {
                        System.out.println(Container.get(i));
                    }

                    break;

            }

        }while(choice!=5);


        System.out.println("Exit....................");
    }

}
