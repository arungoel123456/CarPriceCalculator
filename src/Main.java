import com.demo.base.*;
import com.demo.decorators.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        while (true){
            Base car;
            System.out.println("Press 1 for Baleno");
            System.out.println("Press 2 for Swift");
            System.out.println("Press 3 for Desire");
            int baseCar= scanner.nextInt();
            if(baseCar==1){
                car= new Baleno();
            }
            else if(baseCar== 2){
                car= new Swift();
            }
            else if(baseCar== 3){
                car= new Desire();
            }
            else {
                System.out.println("please select valid number");
                continue;
            }

            System.out.println("Press 1 for Covers or press any other number");
            int cover= scanner.nextInt();
            if(cover==1){
                car= new Covers(car);
            }
            System.out.println("Press 1 for mats or press any other number");
            int mats= scanner.nextInt();
            if(mats==1){
                car= new Mats(car);
            }
            System.out.println(car.cost());

        }

    }
}