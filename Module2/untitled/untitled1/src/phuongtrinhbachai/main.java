package phuongtrinhbachai;

import java.util.Scanner;

public class main { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a , b , c : ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    PTB2 quadraticEquation = new PTB2(a, b, c);

    System.out.println("Ban da nhap a = " + quadraticEquation.getA() + " b = " + quadraticEquation.getB() + " c = " + quadraticEquation.getC());
    if (quadraticEquation.getDelta() > 0) {
        System.out.print("Phuong trnh co 2 nghiem : " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
    } else if (quadraticEquation.getDelta() == 0) {
        System.out.print("Phuong trinh co nghiem duy nhat " + (-b / 2 * a));
    } else {
        System.out.print("Phuong trinh vo nghiem .");
    }

}
}
