package basics;

import java.util.*;

public class Excercise1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();
        float m5 = sc.nextFloat();

        float total = m1+m2+m3+m4+m5;
        float percentage = (total/500.0f) *100;

        System.out.println("Total percentage is  "+percentage);
    }
}
