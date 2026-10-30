import java.util.Scanner;

public class BTTuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bai thuc hanh tuan 3
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

        //Bai thuc hanh tuan 4
        //Bài 1: Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ
        if(dongia > 0)
            System.out.println("Don gia hop le");
        else
            System.out.println("Don gia khong hop le");
        if(soluong >= 0)
            System.out.println("So luong hop le");
        else
            System.out.println("So luong khong hop le");
        if(namxuatban >= 1 && namxuatban <= 2026)
            System.out.println("Nam xuat ban hop le");
        else
            System.out.println("Nam xuat ban khong hop le");
         //Bài 2: Phân loại giá: thấp, trung bình, cao, đặc biệt. Giá < 50.000 → Sách giá thấp, 50.000–100.000 → Sách giá trung bình, 100.000–200.000 → Sách giá cao,  >200.000 → Sách giá đặc biệt
        if (dongia < 50000)
            System.out.println("Sach gia thap");
        else if (dongia < 100000)
            System.out.println("Sach gia trung binh");
        else if (dongia <= 200000)
            System.out.println("Sach gia cao");
        else
            System.out.println("Sach gia dac biet");
        //Bài 3:Phân loại tồn kho: hết, sắp hết, còn ít, còn nhiều. 0 → Hết sách, 1–5 → Sắp hết, 6–20 → Còn ít, >20 → Còn nhiều
        if (soluong == 0)
            System.out.println("Het sach");
        else if (soluong <= 5)
            System.out.println("Sap het");
        else if (soluong <= 20)
            System.out.println("Con it");
        else
            System.out.println("Con nhieu");
        //Bài 4: Dùng switch chọn loại sách. Ví dụ 1. Sách giáo khoa 2. Sách tham khảo 3. Sách chuyên ngành 4. Sách khác
        int loaisach = sc.nextInt();
        switch(loaisach){
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            default:
                System.out.println("Sach khac");
        }
    }
}

