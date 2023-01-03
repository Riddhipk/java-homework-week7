package week_7_homework;
import java.util.Scanner;
public class Ans_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bp,HRA,TA,DA,PF,GP,NP;
        System.out.println("Enter basic salary:");
        bp = in.nextDouble();
        HRA = 10/100 * bp;
        TA = 9/100 * bp;
        DA = 8/100 * bp;
        PF = 20/100 * bp;
        GP = bp + HRA + TA + DA + PF;
        NP = GP-PF;
        System.out.println("Gross salary:" +HRA);
        System.out.println("NetPay:" +TA);
    }
}
