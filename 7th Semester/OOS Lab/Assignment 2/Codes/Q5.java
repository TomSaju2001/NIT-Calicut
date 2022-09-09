import java.util.Objects;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inmate details: ");
        String details = input.nextLine();
        details=details.trim();
        if (details.equals("")) return;
        String[] arrDetails = details.split(" ");
        System.out.print("Enter the number of days: ");
        int days = input.nextInt();
        System.out.println(calculateMessBill(arrDetails, days));
        input.close();
    }

    public static int calculateMessBill(String[] arrDetails, int days) {
        //System.out.println(arrDetails[0] + " " + arrDetails[1] + " " + arrDetails[2]);
        double messDues=0;
        if (Objects.equals(arrDetails[1], "employee")) {
            if (Objects.equals(arrDetails[2], "veg")) {
                messDues = calculateDues(100, days, true);
            }else{
                messDues = calculateDues(120, days, true);
            }
        } else if (Objects.equals(arrDetails[1], "student")){
            if (Objects.equals(arrDetails[2], "veg")) {
                messDues = calculateDues(100, days, false);
            }else{
                messDues = calculateDues(120, days, false);
            }
        }
        return (int)messDues;
    }

    public static double calculateDues(int rate, int days, boolean employee){
        double total=rate*days;
        if(employee){
            total = total + (total*0.05);
        }
        return total;
    }
}