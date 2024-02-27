package Problem;
import java.util.Scanner;


abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterest();
}

class FDAccount extends Account {
    int noOfDays;
    int ageOfACHolder;

    public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {
        if (noOfDays >= 7 && noOfDays <= 14) {
            interestRate = ageOfACHolder >= 60 ? 5.00 : 4.50;
        } else if (noOfDays >= 15 && noOfDays <= 29) {
            interestRate = ageOfACHolder >= 60 ? 5.25 : 4.75;
        } else if (noOfDays >= 30 && noOfDays <= 45) {
            interestRate = ageOfACHolder >= 60 ? 6.00 : 5.50;
        } else if (noOfDays >= 45 && noOfDays <= 60) {
            interestRate = ageOfACHolder >= 60 ? 7.50 : 7.00;
        } else if (noOfDays >= 61 && noOfDays <= 184) {
            interestRate = ageOfACHolder >= 60 ? 8.00 : 7.50;
        } else if (noOfDays >= 185 && noOfDays <= 365) {
            interestRate = ageOfACHolder >= 60 ? 8.50 : 8.00;
        } else {
            throw new IllegalArgumentException("Invalid number of days.");
        }
        return (amount * interestRate) / 100;
    }
}

class SBAccount extends Account {
    @Override
    double calculateInterest() {
        interestRate = 4.0;
        return (amount * interestRate) / 100;
    }
}

class RDAccount extends Account {
    int noOfMonths;
    double monthlyAmount;

    public RDAccount(double amount, int noOfMonths, double monthlyAmount) {
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
        return (amount * interestRate) / 100;
    }
}

public class InterestCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMAIN MENU\n---------");
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");
            System.out.print("Enter your option (1..4): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the Average amount in your account: ");
                    double sbAmount = scanner.nextDouble();
                    SBAccount sbAccount = new SBAccount();
                    sbAccount.amount = sbAmount;
                    double sbInterest = sbAccount.calculateInterest();
                    System.out.println("Interest gained: Rs. " + sbInterest);
                    break;
                case 2:
                    System.out.print("Enter the FD amount: ");
                    double fdAmount = scanner.nextDouble();
                    System.out.print("Enter the number of days: ");
                    int fdDays = scanner.nextInt();
                    System.out.print("Enter your age: ");
                    int fdAge = scanner.nextInt();
                    FDAccount fdAccount = new FDAccount(fdAmount, fdDays, fdAge);
                    try {
                        double fdInterest = fdAccount.calculateInterest();
                        System.out.println("Interest gained is: Rs. " + fdInterest);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Number of days. Please enter non-negative values");
                    }
                    break;
                case 3:
                    System.out.print("Enter the RD amount: ");
                    double rdAmount = scanner.nextDouble();
                    System.out.print("Enter the number of months: ");
                    int rdMonths = scanner.nextInt();
                    System.out.print("Enter the monthly amount: ");
                    double rdMonthlyAmount = scanner.nextDouble();
                    RDAccount rdAccount = new RDAccount(rdAmount, rdMonths, rdMonthlyAmount);
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

        } while (option != 4);

        scanner.close();
    }
}