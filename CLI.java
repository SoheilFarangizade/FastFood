package fastfood;

import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {
    President p1 = new President();
    Cacher c = new Cacher();

        Scanner s  = new Scanner(System.in);
        while (true){

            System.out.println(" 1 ) Add Food");
            System.out.println(" 2 ) Update food");
            System.out.println(" 3 ) Show Foods");
            System.out.println(" 4 ) Cacher");
            System.out.print("-------------------------");
            String text = s.next();
            switch (text){
                case "1":
                    p1.AddFood();
                    break;
                case "2":
                    p1.UpdateFood();
                    break;
                case "3":
                    p1.ShowFood();
                    break;
                case "4":
                    c.chach();
                    break;

            }
        }
    }
}
