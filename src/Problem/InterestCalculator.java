package Problem;
import java.util.Scanner;

abstract class Account_class{
    double interestRate;
    double amount;
    abstract double calculateInterest();
}

class FDAccount_class extends Account_class{

    int noOfDays;
    int ageOfACHolder;
    public FDAccount_class(double amount, int noOfDays, int ageOfACHolder){
        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {
        if (noOfDays >= 7 && noOfDays <= 14){
            interestRate = ageOfACHolder >= 60 ? 5.00 : 4.50;
        } else if (noOfDays >= 15 && noOfDays <= 29) {
            interestRate = ageOfACHolder >= 60 ? 5.25 : 4.75;
        } else if (noOfDays >= 30 && noOfDays <= 45) {
            interestRate = ageOfACHolder >= 60 ? 6 : 5.5;
        } else if (noOfDays >= 45 && noOfDays <= 60) {
            interestRate = ageOfACHolder >= 60 ? 7.5 : 7.0;
        } else if (noOfDays >= 61 && noOfDays <= 184) {
            interestRate = ageOfACHolder >= 60 ? 8 : 7.5;
        } else if (noOfDays >= 185 && noOfDays <= 365) {
            interestRate = ageOfACHolder >= 60 ? 8.50 : 8.00;
        } else {
            throw new IllegalArgumentException("Invalid number of days.");
        }
        return (amount * interestRate) / 100;
    }
}

class SBAccount_class extends Account_class{
    int isIndian;
    SBAccount_class(double amount, int isIndian){
        this.amount = amount;
        this.isIndian = isIndian;
    }

    @Override
    double calculateInterest() {
        if(isIndian==1){
            interestRate = 4.0;
        }
        else {
            interestRate = 6.0;
        }
        return (interestRate*amount)/100;
    }
}


class RDAccount_class extends Account {
    int noOfMonths;
    double monthlyAmount;

    public RDAccount_class(double amount, int noOfMonths, double monthlyAmount) {
        this.amount = amount;
        this.noOfMonths = noOfMonths;
        this.monthlyAmount = monthlyAmount;
    }

    @Override
    double calculateInterest() {
        if (noOfMonths == 6) {
            interestRate = 7.50;
        } else if (noOfMonths == 9) {
            interestRate = 7.75;
        } else if (noOfMonths == 12) {
            interestRate = 8.00;
        } else if (noOfMonths == 15) {
            interestRate = 8.25;
        } else if (noOfMonths == 18) {
            interestRate = 8.50;
        } else if (noOfMonths == 21) {
            interestRate = 8.75;
        } else {
            throw new IllegalArgumentException("Invalid number of months.");
        }
        return ((amount * interestRate) / 100)+(((noOfMonths*monthlyAmount)*interestRate)/100);
    }

}


public class InterestCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opt;
        do{
            System.out.println("\nMAIN MENU\n---------");
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");
            System.out.print("Enter your option (1..4): ");
            opt = in.nextInt();

            switch (opt){
                case 1:
                    System.out.print("Enter the Average amount in your account: ");
                    double sbAmount = in.nextDouble();
                    System.out.println("Are you Indian(1) or NRI(2)");
                    int isInd = in.nextInt();
                    SBAccount_class sbAccount = new SBAccount_class(sbAmount, isInd);
                    sbAccount.amount = sbAmount;
                    double sbInterest = sbAccount.calculateInterest();
                    System.out.println("Interest gained: Rs. " + sbInterest);
                    break;
                case 2:
                    System.out.print("Enter the FD amount: ");
                    double fdAmount = in.nextDouble();
                    System.out.print("Enter the number of days: ");
                    int fdDays = in.nextInt();
                    System.out.print("Enter your age: ");
                    int fdAge = in.nextInt();
                    FDAccount_class fdAccount = new FDAccount_class(fdAmount, fdDays, fdAge);
                    try {
                        double fdInterest = fdAccount.calculateInterest();
                        System.out.println("Interest gained is: Rs. " + fdInterest);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Number of days. Please enter non-negative values");
                    }
                    break;
                case 3:
                    System.out.print("Enter the RD amount: ");
                    double rdAmount = in.nextDouble();
                    System.out.print("Enter the number of months(6,9,12,15,18,21): ");
                    int rdMonths = in.nextInt();
                    System.out.print("Enter the monthly amount: ");
                    double rdMonthlyAmount = in.nextDouble();
                    RDAccount_class rdAccount = new RDAccount_class(rdAmount, rdMonths, rdMonthlyAmount);
                    try {
                        double rdInterest = rdAccount.calculateInterest();
                        System.out.println("Interest gained is: Rs. " + rdInterest);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Number of months. Please enter valid values");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }while (opt != 4);
    in.close();
    }


}
