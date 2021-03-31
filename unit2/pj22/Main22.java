package unit2.pj22;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



public class Main22 {

    public static void main(String args[]) {

        System.out.println("Name: Javed Ali\nUID:18BCS6705");
        Scanner scan = new Scanner(System.in);
        TreeSet<Cards> ts1 = new TreeSet<Cards>();
        String symbol;
        int number;
        int count = 0;
        do{
            System.out.println("Enter a Card");
            System.out.print("Symbol:");
            symbol = scan.next();
            System.out.print("Number:");
            number = scan.nextInt();
            Cards c1 = new Cards(number,symbol);
            ts1.add(c1);
            count++;
        }while(ts1.size()!=4);
        System.out.println("Four Symbols gathers in "+count+" Cards");
        Iterator<Cards> iter = ts1.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
