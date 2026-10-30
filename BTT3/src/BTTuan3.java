import java.util.Scanner;

public class BTTuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bai 1
        System.out.print("Nhap ma sach: ");
        String masach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tensach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacgia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namxuatban = sc.nextInt();
        System.out.print("Nhap don gia: ");
        float dongia = sc.nextFloat();
        System.out.print("Nhap so luong: ");
        int soluong = sc.nextInt();
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("Don gia: " + dongia);
        System.out.println("So luong: " + soluong);
        //Bai 2
        double thanhtien = dongia * soluong;
        System.out.println("Thanh tien: " + thanhtien);
        //Bai 3
        double phivanchuyen = dongia * 0.05;
        System.out.println("Phi van chuyen: " + phivanchuyen);
        //Bai 4
        double tongtiennhap = thanhtien + phivanchuyen;
        System.out.println("Tong tien nhap: " + tongtiennhap);
    }
}

