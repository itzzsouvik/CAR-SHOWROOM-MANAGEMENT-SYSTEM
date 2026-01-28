import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements utility {
    String employee_id;
    String employee_name;
    int employee_age;
    String employee_dept;

    @Override
    public void getDetails(){
        System.out.println("Employee id : " + employee_id);
        System.out.println("Employee name : " + employee_name);
        System.out.println("Employee age : " + employee_age);
        System.out.println("Employee dept : " + employee_dept);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        employee_id = String.valueOf(uuid);
        System.out.println("=============== Enter Employee Details ===============");
        System.out.println();
        System.out.println("Employee name : ");
        employee_name = sc.nextLine();
        System.out.println("Employee age : ");
        employee_age = sc.nextInt();
        System.out.println("Employee dept : ");
        employee_dept = sc.nextLine();
    }

}
