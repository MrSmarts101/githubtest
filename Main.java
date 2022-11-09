import java.util.*;
public class Main {
    public static void main(String[] args) {
        //access other file

/*int grv = test3.giveRandomInteger();
System.out.println(grv);*/
        test3.giveRandomInteger();
        Scanner ky = new Scanner(System.in);
        int nct = 0;
        int sum = 0;
        System.out.println("Enter any 3 numbers");
        for(int i = 1; i < 4; i++){
            int answer = ky.nextInt();
            nct++;
            sum += answer;
        }
        System.out.println("Sum is: " +sum);
        System.out.println("Num of numbers possible: " +nct);
        double avg = sum/(double) nct;
        System.out.println("Average of " +nct+" numbers is: "+avg);
    }
}