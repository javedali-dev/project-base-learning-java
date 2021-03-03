package unit1.pj3;

import java.util.Scanner;

class CustomException extends Exception{
    CustomException(String s){
        super(s);
    }
}

abstract class Account{
    double interestRate,amount;
    abstract double calculateInterest(double amount) throws CustomException ;
}
class FDAccount extends Account{
    int noOfDays,ageOfACHolder;
    double general, seniorCitizen;
    double calculateInterest(double amount) throws CustomException{
    this.amount=amount;
    Scanner scan = new Scanner(System.in);
    System.out.println("Number of Day:");
    noOfDays = scan.nextInt();
    if(noOfDays<0){
        throw new CustomException("No of day should not be negative!");
    }
    else {
        System.out.println("Age:");
        ageOfACHolder = scan.nextInt();
        if (ageOfACHolder<0){
            throw new CustomException("Age should not be negative!");
        }
        else{
            if (amount<10000000){
                if (noOfDays>=7 && noOfDays<=14){
                    general = 4.50;
                    seniorCitizen = 6.00;
                }
                else if(noOfDays>=15 && noOfDays<=29){
                    general = 4.75;
                    seniorCitizen = 5.25;
                }
                else if(noOfDays>=30 && noOfDays<=45){
                 general = 5.50;
                 seniorCitizen = 6.00;
                }
                else if(noOfDays>=45 && noOfDays<=60){
                    general = 7.0;
                    seniorCitizen = 8.0;
                }
                else if(noOfDays>=61 && noOfDays<=184){
                    general = 7.0;
                    seniorCitizen = 8.0;
                }
                else if(noOfDays>=185 && noOfDays<=365){
                    general = 7.0;
                    seniorCitizen = 8.0;
                }
            }
            else{
                if(noOfDays>=7 && noOfDays<=14){
                    interestRate = 6.50;
                }
                else if(noOfDays>=15 && noOfDays<=29){
                    interestRate = 6.750;
                }
                else if(noOfDays>=30 && noOfDays<=45){
                    interestRate = 6.75;
                }
                else if(noOfDays>=45 && noOfDays<=60){
                    interestRate = 8;
                }
                else if(noOfDays>=61 && noOfDays<=184){
                    interestRate = 8.50;
                }
                else if(noOfDays>=185 && noOfDays<=365){
                    interestRate = 10.00;
                }
            }
        }
    }
    interestRate = (ageOfACHolder<50)?general:seniorCitizen;
    double interest;
    interest =amount*interestRate;
    return interest;
    }
}
class SBAccount extends Account{
    double interest;
    double calculateInterest(double amount) throws CustomException{
        this.amount = amount;
        System.out.println("Select Account Type: \n1. Normal\n2. NRI");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        switch(choice){
            case 1: interestRate = 0.04;
                break;
            case 2: interestRate = 0.06;
                break;
            default: System.out.println("Wrong Choice!!");
        }
        return amount * interestRate;
    }
}

class RDAccount extends Account{
    double interest, monthlyAmount, general, seniorCitizen;
    int noOfMonths, age;
    double calculateInterest(double amount) throws CustomException{
        this.amount = amount;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number Of Months: ");
        noOfMonths = s.nextInt();
        if(noOfMonths<0){
            throw new CustomException("Months should Not be negative");
        }
        else{
            System.out.println("Enter Age: ");
            age = s.nextInt();
            if(age<0){
                throw new CustomException("Age should not be negative");
            }
            else{
                if(noOfMonths == 6){
                    general = 5.50;
                    seniorCitizen = 6.00;
                }
                else if(noOfMonths == 9){
                    general = 4.75;
                    seniorCitizen = 5.25;
                }
                else if(noOfMonths == 12){
                    general = 5.50;
                    seniorCitizen = 6.00;
                }
                else if(noOfMonths == 15){
                    general = 7.00;
                    seniorCitizen = 7.50;
                }
                else if(noOfMonths == 18){
                    general = 7.50;
                    seniorCitizen = 8.00;
                }
                else if(noOfMonths == 21){
                    general = 8.00;
                    seniorCitizen = 8.50;
                }
            }
        }

        interestRate = (age<50)?general : seniorCitizen;
        return interest = amount * interestRate;
    }

}


public class Bank {
    public static void main(String[] args) {

        int  whileflag = 4, choice;
        double amount;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Select an Option: \n1. Interest Calculator-SB\n2. Interest Calculator-FD\n"
                    + "3. Interest Calculator-RD\n4. Exit\n");
            choice = s.nextInt();

            switch(choice){
                case 1: SBAccount sbaccount = new SBAccount();
                    System.out.println("Enter Amount: ");
                    amount = s.nextInt();
                    try{
                        System.out.println("Interest: " +sbaccount.calculateInterest(amount));
                    }
                    catch (Exception m){
                        System.out.println("Exception occured: "+m);
                    }
                    break;

                case 2: FDAccount fbaccount = new FDAccount();
                    System.out.println("Enter Amount: ");
                    amount = s.nextInt();
                    try{
                        System.out.println("Interest: " +fbaccount.calculateInterest(amount)/100);
                    }
                    catch (Exception m){
                        System.out.println("Exception: "+m);
                    }
                    break;

                case 3: RDAccount rdaccount = new RDAccount();
                    System.out.println("Enter Amount: ");
                    amount = s.nextInt();
                    try{
                        System.out.println("Interest: " +rdaccount.calculateInterest(amount)/100);
                    }
                    catch (Exception m){
                        System.out.println("Exception: "+m);
                    }
                    break;

                case 4: System.exit(whileflag);

                default:
                    System.out.println("Wrong Choice: ");
            }

            whileflag--;
        }while(whileflag!=0);

    }

}


