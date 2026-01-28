import java.lang.*;
import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_car=0;
    String manager_name;
 
    @Override
    public void getDetails(){
        System.out.println("Showroom name : " + showroom_name);
        System.out.println("Showroom address : " + showroom_address);
        System.out.println("Total employee : " + total_employee);
        System.out.println("Total car : " + total_car);
        System.out.println("Manager name : " + manager_name);
    }

    @Override
    public void setDetails(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("=============== Enter Showroom Details ===============");
        System.out.println("Showroom name : ");
        showroom_name = sc.nextLine();
        System.out.println("Showroom address : ");
        showroom_address = sc.nextLine();
        System.out.println("Total employee : ");
        total_employee = sc.nextInt();
        System.out.println("Total car : ");
        total_car = sc.nextInt();
        sc.nextLine();
        System.out.println("Manager name : ");
        manager_name = sc.nextLine();
    }
}
