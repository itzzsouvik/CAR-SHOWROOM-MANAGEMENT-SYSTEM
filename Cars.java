import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;

    @Override
    public void getDetails(){
        System.out.println("Car name : " + car_name);
        System.out.println("Car color : " + car_color);
        System.out.println("Car fuel type : " + car_fuel_type);
        System.out.println("Car price : " + car_price);
    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== Enter Car Details ===============");
        System.out.println("Car name : ");
        car_name = sc.nextLine();
        System.out.println("Car color : ");
        car_color = sc.nextLine();
        System.out.println("Car fuel type : ");
        car_fuel_type = sc.nextLine();
        System.out.println("Car price : ");
        car_price = sc.nextInt();
        total_car++;
    }
    
}
