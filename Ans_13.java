package week_7_homework;

public class Ans_13 {
    public static void main(String[] args) {
        System.out.println("number divided by 3=");
        for (int i = 1; i <= 100; i++) {
            if (i% 3 == 0) {
                System.out.println(i +",");
            }
        }
        System.out.println("number divided by 5=");
        for (int i = 1; i<= 100; i++) {
            if (i% 5 ==0) {
                System.out.println(i + ",");
            }
        }
    }

}
