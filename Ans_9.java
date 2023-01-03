package week_7_homework;

import java.util.Scanner;

public class Ans_9 {
    public static void main(String[] args) {
        double sales = 0.0, comm= 0.0;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Sales");
        sales = ss.nextDouble();

        if(sales > 0 && sales <= 50000);
        comm = sales * 0.35;
        if(sales > 0 && sales <= 30000);
        comm = sales * 0.20;
        if(sales > 50000 && sales <= 30000);
        comm = sales * 0.10;

        comm = sales * 0.5;

        System.out.println("sales" + sales);
        System.out.println("Commission is" +comm);


    }
}
