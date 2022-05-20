package hinhchunhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double width = sc.nextDouble();
        System.out.println("nhap chieu rong");
        double height = sc.nextDouble();
        HinhChuNhat HCN= new HinhChuNhat(width,height);
        System.out.println("hinh chu nhat \n"+HCN.HienThi());
        System.out.println("Chu Vi : "+HCN.getChuVi());
        System.out.println("Dien Tich : "+HCN.getDienTich());

    }
}
