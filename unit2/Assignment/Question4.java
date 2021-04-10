package unit2.Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        System.out.println("Name:Javed Ali\nUID:18BCS6705");
        FileInputStream inputStream;
        FileOutputStream outputStream;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input file name:");
        String inputFileName = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter Output file name:");
        String outputFileName = scanner.nextLine();
//        scanner.nextLine();
        try{
            File infile = new File(inputFileName);
            File outfile = new File(outputFileName);
            inputStream =new  FileInputStream(infile);
            outputStream =new  FileOutputStream(infile);


            byte[] buffer = new byte[1024];
            int length;
            while((length=inputStream.read(buffer))>0){
                outputStream.write(buffer,0,length);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied successfully!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
