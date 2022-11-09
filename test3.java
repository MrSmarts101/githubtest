import java.lang.*;
import java.util.*;
public class test3 {
    public static void main(String[] args) {
       giveRandomInteger();

    }

    /*public static int giveRandomInteger() {
        Scanner ky = new Scanner(System.in);
        for (int i = 0; i >= -1; i--) {
            System.out.println("Do you want a random integer");
            String ans = ky.nextLine();
            if (ans.toLowerCase().equals("yes")) {
                int randit = (int) (Math.random() * 10) + 0;
                System.out.println("Here you go!");

                return randit;
            }
            if (ans.toLowerCase().equals("no")) {
                System.out.println("Thank you for your time! :)");
                break;
            }
            System.out.println("Want to try again? ");
            String ans2 = ky.nextLine();
            if (ans2.toLowerCase().equals("yes")) {
                i++;
            }
            if (ans2.toLowerCase().equals("no")) {
                System.out.println("Thank you for your time! :)");
                break;
            }
        }
        return -1;
    }*/
    public static void giveRandomInteger() {
        Scanner ky = new Scanner(System.in);
        for (int i = 0; i >= -1; i--) {
            System.out.println("Do you want a random integer");
            String ans = ky.nextLine();
            if (ans.toLowerCase().equals("yes")) {
                int randit = (int) (Math.random() * 10) + 0;
                System.out.println("Here you go!");
                System.out.println("Your number is: " + randit);
            }
            if (ans.toLowerCase().equals("no")) {
                System.out.println("Thank you for your time! :)");
                break;
            }
            System.out.println("Want to try again? ");
            String ans2 = ky.nextLine();
            if (ans2.toLowerCase().equals("yes")) {
                i++;
            }
            if (ans2.toLowerCase().equals("no")) {
                System.out.println("Thank you for your time! :)");
                break;
            }
        }

    }
}
