package interviewquestions;

import java.util.Scanner;

public class OverloadingConcept {

    public static void main(String[] args) {

        OverloadingConcept oc = new OverloadingConcept();

        oc.area(10);
        oc.area(10,20);
        oc.area(10,20,30);

    }

    private void area(int radius) {

        float pi = 3.14142F;

        System.out.println("area of circe is= " +pi*radius*radius);
    }

    private void area(int l, int b) {

        System.out.println("area of rectangle is= " +l*b);
    }

    private void area(int a, int b, int h) {

        System.out.println("area of trapezoid is= " +((a+b)/2)*h);
    }

}
