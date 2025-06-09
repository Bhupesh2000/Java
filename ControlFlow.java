import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number(1 - 12): ");
        int month = scanner.nextInt();

        String monthName;
        int days;

        switch (month) {
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
            default:
                monthName = "Invalid month";
                days = 0;
                System.out.println(monthName);
                scanner.close();
                return; // Exit the program
        }
        
        if(month == 2) days = 28;
        else if(month == 4 || month == 6 || month == 9 || month == 11) days = 30;
        else days = 31;

        System.out.println("Month Name is " + monthName + ". It has " + days + " days");

        scanner.close();
    }    
}
