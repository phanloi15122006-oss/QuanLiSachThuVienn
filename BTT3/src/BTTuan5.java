import java.util.Scanner;
import java.util.ArrayList;

public class BTTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bai thuc hanh tuan 5
        int so, n, namxuatban, soluong, tongsoluong;
        float dongia, tonggiatri;
        tongsoluong = 0;
        tonggiatri = 0;
        String masach="", tensach="", tacgia;
//        do{
//            System.out.println("MENU");
//            System.out.println("1. Nhap danh sach sach");
//            System.out.println("2. Tinh tong so luong sach");
//            System.out.println("3. Tinh tong gia tri sach");
//            System.out.println("4. Thoat khoi menu");
//            System.out.println("5.Tim sach theo ma");
//            System.out.println("Nhap lua chon cua ban: ");
//            so = sc.nextInt();
//            sc.nextLine();
//            switch(so) {
//                case 1: {
//                    //Bài 1: Nhập n sách bằng vòng lặp
//                    System.out.print("Nhap bao nhieu loai sach: ");
//                    n = sc.nextInt();
//                    sc.nextLine();
//                    for (int i = 1; i <= n; i++) {
//                        System.out.println("Nhap thong tin sach thu " + i);
//                        System.out.print("Nhap ma sach: ");
//                        masach = sc.nextLine();
//                        System.out.print("Nhap ten sach: ");
//                        tensach = sc.nextLine();
//                        System.out.print("Nhap tac gia: ");
//                        tacgia = sc.nextLine();
//                        System.out.print("Nhap nam xuat ban: ");
//                        namxuatban = sc.nextInt();
//                        System.out.print("Nhap don gia: ");
//                        dongia = sc.nextFloat();
//                        System.out.print("Nhap so luong: ");
//                        soluong = sc.nextInt();
//                        sc.nextLine();
//                        //Bài 2: Tính tổng số lượng và tổng giá trị sách
//                        tongsoluong = tongsoluong + soluong;
//                        tonggiatri = tonggiatri + dongia * soluong;
//                    }
//                    break;
//                }
//                case 2:
//                    System.out.println("Tong so luong sach: " + tongsoluong);
//                    break;
//                case 3:
//                    System.out.println("Tong so gia tri sach: " + tonggiatri);
//                    break;
//                case 4:
//                    //Bài 3: Menu lặp đến khi chọn Thoát
//                    System.out.println("Thoat menu thanh cong");
//                    break;
//                case 5:
//                {
//                    //Bài 4: Tìm sách theo mã
//                    System.out.print("Nhap ma sach can tim: ");
//                    String maCanTim = sc.nextLine();
//                    if (masach.equalsIgnoreCase(maCanTim)) {
//                        System.out.println("Tim thay sach");
//                        System.out.println("Ma sach: " + masach);
//                        System.out.println("Ten sach: " + tensach);
//                    }
//                    else
//                        System.out.println("Khong tim thay sach");
//                    break;
//                }
//            }
//        }while(so!=4);
        //Bai thuc hanh tuan 6
        //Bài 1: Tạo mảng: int[] soLuong; cho phép nhập số lượng của 5 cuốn sách. Sau đó: Hiển thị số lượng, tính tổng, tìm số lượng lớn nhất.
        int[] soLuong = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap so luong sach thu " + (i + 1));
            soLuong[i] = sc.nextInt();
        }
        int tong = 0;
        int max = soLuong[0];
        for (int i = 0; i < 5; i++) {
            System.out.println("So luong cua sach thu " + (i + 1) + " la " + soLuong[i]);
            tong = tong + soLuong[i];
            if (soLuong[i] > max)
                max = soLuong[i];
        }
        System.out.println("Tong so luong sach la " + tong);
        System.out.println("So luong sach lon nhat la " + max);
        //Bài 2: Sử dụng ArrayList<String> để lưu mã sách. Thực hiện: thêm, hiển thị, tìm, xóa mã sách
        ArrayList<String> danhSachMa = new ArrayList<>();
        System.out.print("Nhap bao nhieu ma sach can them ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ma sach thu " + (i+1));
            String ma = sc.nextLine();
            danhSachMa.add(ma);
        }
        for (int i = 0; i < danhSachMa.size(); i++)
            System.out.println(danhSachMa.get(i));
        System.out.println("Nhap ma sach can tim: ");
        String maTim = sc.nextLine();
        if (danhSachMa.contains(maTim))
            System.out.println("Tim thay ma sach");
        else
            System.out.println("Khong tim thay ma sach");
        System.out.println("Nhap ma sach can xoa: ");
        String maXoa = sc.nextLine();
        if (danhSachMa.contains(maXoa))
        {
            while (danhSachMa.contains(maXoa))
                danhSachMa.remove(maXoa);
            System.out.println("Xoa thanh cong");
            System.out.println("Ket qua sau khi xoa thanh cong la ");
            for (int i = 0; i < danhSachMa.size(); i++)
                System.out.println(danhSachMa.get(i));
        }
        else
            System.out.println("Ma sach khong ton tai!");
        //Bài 3: Xây dựng: ArrayList<String> danhSachSach; Mỗi phần tử đại diện cho thông tin của một cuốn sách. Thực hiện: Thêm sách, Hiển thị sách, Tìm sách, Xóa sách, Sửa sách
        ArrayList<String> danhsachSach = new ArrayList<>();
        System.out.print("Nhap so luong sach can them: ");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1));
            System.out.print("Nhap ma sach ");
            masach = sc.nextLine();
            System.out.print("Nhap ten sach ");
            tensach = sc.nextLine();
            System.out.print("Nhap tac gia ");
            tacgia = sc.nextLine();
            System.out.print("Nhap nam xuat ban ");
            namxuatban = sc.nextInt();
            System.out.print("Nhap don gia ");
            dongia = sc.nextFloat();
            System.out.print("Nhap so luong ");
            soluong = sc.nextInt();
            sc.nextLine();
            String sach = masach + "|" + tensach + "|" + tacgia + "|" + namxuatban + "|" + dongia + "|" + soluong;
            danhsachSach.add(sach);
        }
        for (int i = 0; i < danhsachSach.size(); i++) {
            String[] thongTin = danhsachSach.get(i).split("\\|");
            System.out.println("Ma sach: " + thongTin[0]);
            System.out.println("Ten sach: " + thongTin[1]);
            System.out.println("Tac gia: " + thongTin[2]);
            System.out.println("Nam xuat ban: " + thongTin[3]);
            System.out.println("Don gia: " + thongTin[4]);
            System.out.println("So luong: " + thongTin[5]);
        }
        System.out.print("Nhap ma sach can tim ");
        String matim = sc.nextLine();
        boolean timThay = false;
        for (int i = 0; i < danhsachSach.size(); i++) {
            String[] thongTin = danhsachSach.get(i).split("\\|");
            if (thongTin[0].equalsIgnoreCase(matim)) {
                System.out.println("Tim thay sach");
                System.out.println("Ma sach: " + thongTin[0]);
                System.out.println("Ten sach: " + thongTin[1]);
                System.out.println("Tac gia: " + thongTin[2]);
                System.out.println("Nam xuat ban: " + thongTin[3]);
                System.out.println("Don gia: " + thongTin[4]);
                System.out.println("So luong: " + thongTin[5]);
                timThay = true;
            }
        }
        if (!timThay)
            System.out.println("Khong tim thay sach");
        System.out.print("Nhap ma sach can xoa ");
        String maxoa = sc.nextLine();
        boolean xoaThanhCong = false;
        for (int i = 0; i < danhsachSach.size(); i++) {
            String[] thongTin = danhsachSach.get(i).split("\\|");
            if (thongTin[0].equalsIgnoreCase(maxoa)) {
                danhsachSach.remove(i);
                i--;
                xoaThanhCong = true;
            }
        }
        if (xoaThanhCong)
            System.out.println("Xoa sach thanh cong");
        else
            System.out.println("Ma sach khong ton tai");
        System.out.println("Danh sach sau khi xoa ");
        for (int i = 0; i < danhsachSach.size(); i++) {
            String[] thongTin = danhsachSach.get(i).split("\\|");
            System.out.println("Ma sach: " + thongTin[0]);
            System.out.println("Ten sach: " + thongTin[1]);
            System.out.println("Tac gia: " + thongTin[2]);
            System.out.println("Nam xuat ban: " + thongTin[3]);
            System.out.println("Don gia: " + thongTin[4]);
            System.out.println("So luong: " + thongTin[5]);
        }
        System.out.print("Nhap ma sach can sua ");
        String masua = sc.nextLine();
        boolean suaThanhCong = false;
        for (int i = 0; i < danhsachSach.size(); i++) {
            String[] thongTin = danhsachSach.get(i).split("\\|");
            if (thongTin[0].equalsIgnoreCase(masua)) {
                System.out.print("Nhap ten sach moi ");
                String tenM = sc.nextLine();
                System.out.print("Nhap tac gia moi ");
                String tacgiaM = sc.nextLine();
                System.out.print("Nhap nam xuat ban moi ");
                int namM = sc.nextInt();
                System.out.print("Nhap don gia moi ");
                float giaM = sc.nextFloat();
                System.out.print("Nhap so luong moi ");
                int soLuongM = sc.nextInt();
                sc.nextLine();
                String sachM = thongTin[0] + "|" + tenM + "|" + tacgiaM + "|" + namM + "|" + giaM + "|" + soLuongM;
                danhsachSach.set(i, sachM);
                suaThanhCong = true;
            }
        }
        if (suaThanhCong)
            System.out.println("Sua sach thanh cong");
        else
            System.out.println("Ma sach khong ton tai");
        System.out.println("Danh sach sau khi sua ");
        for (int i = 0; i < danhsachSach.size(); i++) {
            String[] thongTin = danhsachSach.get(i).split("\\|");
            System.out.println("Ma sach: " + thongTin[0]);
            System.out.println("Ten sach: " + thongTin[1]);
            System.out.println("Tac gia: " + thongTin[2]);
            System.out.println("Nam xuat ban: " + thongTin[3]);
            System.out.println("Don gia: " + thongTin[4]);
            System.out.println("So luong: " + thongTin[5]);
        }
        //Bài 4: Xây dựng menu hoàn chỉnh: 1. Thêm sách 2. Hiển thị sách 3. Tìm sách 4. Xóa sách 5. Sửa sách 6. Tính tổng số lượng 7. Tính tổng giá trị 8. Thoát
        int So;
        ArrayList<String> danhSachMaSach = new ArrayList<>();
        ArrayList<String> danhSachTenSach = new ArrayList<>();
        ArrayList<String> danhSachTacGia = new ArrayList<>();
        ArrayList<Integer> danhSachNamXuatBan = new ArrayList<>();
        ArrayList<Integer> danhSachSoLuong = new ArrayList<>();
        ArrayList<Float> danhSachDonGia = new ArrayList<>();
        do {
            System.out.println("MENU");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong sach");
            System.out.println("7. Tinh tong gia tri sach");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon cua ban ");
            So = sc.nextInt();
            sc.nextLine();
            switch (So) {
                case 1: {
                    System.out.print("Nhap bao nhieu sach them ");
                    int soLuongSachNhap = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < soLuongSachNhap; i++) {
                        System.out.println("Nhap thong tin sach thu " + (i + 1));
                        System.out.print("Nhap ma sach ");
                        String maSachMoi = sc.nextLine();
                        System.out.print("Nhap ten sach ");
                        String tenSachMoi = sc.nextLine();
                        System.out.print("Nhap ten tac gia ");
                        String tenTacGiaMoi = sc.nextLine();
                        System.out.print("Nhap nam xuat ban ");
                        int namXuatBanMoi = sc.nextInt();
                        System.out.print("Nhap don gia ");
                        float donGiaMoi = sc.nextFloat();
                        System.out.print("Nhap so luong ");
                        int soLuongMoi = sc.nextInt();
                        sc.nextLine();
                        danhSachMaSach.add(maSachMoi);
                        danhSachTenSach.add(tenSachMoi);
                        danhSachTacGia.add(tenTacGiaMoi);
                        danhSachNamXuatBan.add(namXuatBanMoi);
                        danhSachDonGia.add(donGiaMoi);
                        danhSachSoLuong.add(soLuongMoi);
                    }
                    break;
                }
                case 2: {
                        for (int i = 0; i < danhSachMaSach.size(); i++) {
                            System.out.println("Thong tin sach thu " + (i + 1));
                            System.out.println("Ma sach: " + danhSachMaSach.get(i));
                            System.out.println("Ten sach: " + danhSachTenSach.get(i));
                            System.out.println("Tac gia: " + danhSachTacGia.get(i));
                            System.out.println("Nam xuat ban: " + danhSachNamXuatBan.get(i));
                            System.out.println("Don gia: " + danhSachDonGia.get(i));
                            System.out.println("So luong: " + danhSachSoLuong.get(i));
                        }
                    break;
                }
                case 3: {
                    System.out.print("Nhap ma sach can tim: ");
                    String maSachCanTim = sc.nextLine();
                    boolean timThaySach = false;
                    for (int i = 0; i < danhSachMaSach.size(); i++) {
                        if (danhSachMaSach.get(i).equalsIgnoreCase(maSachCanTim)) {
                            System.out.println("Ma sach: " + danhSachMaSach.get(i));
                            System.out.println("Ten sach: " + danhSachTenSach.get(i));
                            System.out.println("Tac gia: " + danhSachTacGia.get(i));
                            System.out.println("Nam xuat ban: " + danhSachNamXuatBan.get(i));
                            System.out.println("Don gia: " + danhSachDonGia.get(i));
                            System.out.println("So luong: " + danhSachSoLuong.get(i));
                            timThaySach = true;
                        }
                    }
                    if (!timThaySach)
                        System.out.println("Khong tim thay sach!");
                    break;
                }

                case 4: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String maSachCanXoa = sc.nextLine();
                    boolean xoaSachThanhCong = false;
                    for (int i = 0; i < danhSachMaSach.size(); i++) {
                        if (danhSachMaSach.get(i).equalsIgnoreCase(maSachCanXoa)) {
                            danhSachMaSach.remove(i);
                            danhSachTenSach.remove(i);
                            danhSachTacGia.remove(i);
                            danhSachNamXuatBan.remove(i);
                            danhSachDonGia.remove(i);
                            danhSachSoLuong.remove(i);
                            i--;
                            xoaSachThanhCong = true;
                        }
                    }
                    if (xoaSachThanhCong)
                        System.out.println("Xoa sach thanh cong!");
                    else
                        System.out.println("Ma sach khong ton tai!");
                    break;
                }
                case 5: {
                    System.out.print("Nhap ma sach can sua: ");
                    String maSachCanSua = sc.nextLine();
                    boolean suaSachThanhCong = false;
                    for (int i = 0; i < danhSachMaSach.size(); i++) {
                        if (danhSachMaSach.get(i).equalsIgnoreCase(maSachCanSua)) {
                            suaSachThanhCong = true;
                            break;
                        }
                    }
                    if (suaSachThanhCong) {
                        System.out.print("Nhap ten sach moi ");
                        String tenSachMoi = sc.nextLine();
                        System.out.print("Nhap ten tac gia moi ");
                        String tenTacGiaMoi = sc.nextLine();
                        System.out.print("Nhap nam xuat ban moi ");
                        int namXuatBanMoi = sc.nextInt();
                        System.out.print("Nhap don gia moi ");
                        float donGiaMoi = sc.nextFloat();
                        System.out.print("Nhap so luong moi ");
                        int soLuongMoi = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0; i < danhSachMaSach.size(); i++) {
                            if (danhSachMaSach.get(i).equalsIgnoreCase(maSachCanSua)) {
                                danhSachTenSach.set(i, tenSachMoi);
                                danhSachTacGia.set(i, tenTacGiaMoi);
                                danhSachNamXuatBan.set(i, namXuatBanMoi);
                                danhSachDonGia.set(i, donGiaMoi);
                                danhSachSoLuong.set(i, soLuongMoi);
                            }
                        }
                        System.out.println("Sua sach thanh cong!");
                    }
                    else
                        System.out.println("Ma sach khong ton tai!");
                    break;
                }

                case 6: {
                    for (int i = 0; i < danhSachSoLuong.size(); i++) {
                        tongsoluong =tongsoluong + danhSachSoLuong.get(i);
                    }
                    System.out.println("Tong so luong sach: " + tongsoluong);
                    break;
                }
                case 7: {
                    for (int i = 0; i < danhSachMaSach.size(); i++) {
                        tonggiatri += danhSachDonGia.get(i) * danhSachSoLuong.get(i);
                    }
                    System.out.println("Tong gia tri sach: " + tonggiatri);
                    break;
                }
                case 8:
                    System.out.println("Thoat thanh cong");
                    break;
            }
        } while (So != 8);
    }
}
