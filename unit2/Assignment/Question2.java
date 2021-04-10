package unit2.Assignment;

import java.util.ArrayList;

public class Question2 {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> saveEvenNumbers(int N) {
        list = new ArrayList<Integer>();

        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) list.add(i);
        }

        return list;
    }

    public ArrayList<Integer> printEvenNumbers() {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int item : list) {
            newList.add(item * 2);
            System.out.println(item * 2);
        }

        return newList;
    }

    public static void main(String[] args) {
        System.out.println("Name:Javed Ali\nUID:18BCS6705");
        Question2 asg = new Question2();
        asg.saveEvenNumbers(10);
        asg.printEvenNumbers();


    }
}
