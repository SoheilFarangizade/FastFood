package fastfood;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class President {

    static List<Food> foodList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void AddFood(){

        System.out.println("Enter Name");
        String name = scanner.next();
        System.out.println("Enter Material");
        String material = scanner.next();
        System.out.println("Enter Size");
        String size = scanner.next();
        System.out.println("Enter Price");
        double price = scanner.nextInt();

        Food  f = new Food(name,material,size,price);
        foodList.add(f);
    }

    public void UpdateFood(){
        System.out.println("Enter Name Food");
        String name = scanner.next();

        for (int i = 0; i <foodList.size() ; i++) {
            if (foodList.get(i).getName().equals(name)){
                System.out.println("Enter new Price ");
                double newprice = scanner.nextInt();
                foodList.get(i).setPrice(newprice);
                System.out.println("Enter new material " );
                String mat = scanner.next();
                foodList.get(i).setMaterial(mat);
            }
        }
    }


    public void ShowFood(){
        for (Food f:foodList
             ) {
            System.out.println(f.toString());
        }
    }

}
