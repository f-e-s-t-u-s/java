import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String regNo;
            double payRate;
            int hrsWorked;

            System.out.print("Enter reg number: ");
            regNo = input.nextLine();

        System.out.println("Wage Calculator");
        System.out.println("----------------");
        System.out.print("Enter hourly pay rate: ");
        payRate = input.nextDouble();
        System.out.print("Enter hours worked : ");
        hrsWorked = input.nextInt();
        System.out.println();
        System.out.println("Wage Details:");
        System.out.println(regNo);
        System.out.println("Hourly Pay Rate:           $" + payRate);
        System.out.println("Hours Worked:              " + String.format("%.1f", (float)hrsWorked));
        System.out.println("Total Wages:               " + hrsWorked * payRate);

        }
}