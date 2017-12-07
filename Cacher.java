package fastfood;

import java.util.Scanner;

public class Cacher {

    Scanner scanner = new Scanner(System.in);
    President p = new President();

    public void chach(){

        System.out.println("Enter name food");
        String name = scanner.next();
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        for (int i = 0; i <p.foodList.size() ; i++) {
            if (p.foodList.get(i).getName().equals(name)){
                double result = p.foodList.get(i).getPrice() * num;
                System.out.println(result);
            }
        }

    }
}
