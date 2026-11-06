import java.util.Scanner;

public class BTTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bai thuc hanh tuan 5
        int so, n, namxuatban, soluong, tongsoluong;
        float dongia, tonggiatri;
        tongsoluong = 0;
        tonggiatri = 0;
        String masach="", tensach="", tacgia;
        do{
            System.out.println("MENU");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Tinh tong so luong sach");
            System.out.println("3. Tinh tong gia tri sach");
            System.out.println("4. Thoat khoi menu");
            System.out.println("5.Tim sach theo ma");
            System.out.println("Nhap lua chon cua ban: ");
            so = sc.nextInt();
            sc.nextLine();
            switch(so) {
                case 1: {
                    //Bài 1: Nhập n sách bằng vòng lặp
                    System.out.print("Nhap bao nhieu loai sach: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Nhap thong tin sach thu " + i);
                        System.out.print("Nhap ma sach: ");
                        masach = sc.nextLine();
                        System.out.print("Nhap ten sach: ");
                        tensach = sc.nextLine();
                        System.out.print("Nhap tac gia: ");
                        tacgia = sc.nextLine();
                        System.out.print("Nhap nam xuat ban: ");
                        namxuatban = sc.nextInt();
                        System.out.print("Nhap don gia: ");
                        dongia = sc.nextFloat();
                        System.out.print("Nhap so luong: ");
                        soluong = sc.nextInt();
                        sc.nextLine();
                        //Bài 2: Tính tổng số lượng và tổng giá trị sách
                        tongsoluong = tongsoluong + soluong;
                        tonggiatri = tonggiatri + dongia * soluong;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Tong so luong sach: " + tongsoluong);
                    break;
                }
                case 3: {
                    System.out.println("Tong so gia tri sach: " + tonggiatri);
                    break;
                }
                case 4: {
                    //Bài 3: Menu lặp đến khi chọn Thoát
                    System.out.println("Thoat menu thanh cong");
                    break;
                }
                case 5:
                {
                    //Bài 4: Tìm sách theo mã
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    if (masach.equalsIgnoreCase(maCanTim)) {
                        System.out.println("Tim thay sach");
                        System.out.println("Ma sach: " + masach);
                        System.out.println("Ten sach: " + tensach);
                    }
                    else
                        System.out.println("Khong tim thay sach");
                    break;
                }
            }
        }while(so!=4);
    }
}
