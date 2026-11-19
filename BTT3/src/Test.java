import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        Sach sach1 = new Sach("001", "Lap trinh co ban voi C", "HTML", 2020, 5);
        Sach sach2 = new Sach("002", "Triet hoc Mac-Lenin", "Lê Phạm Đức Quang", 1990, 3);
        ArrayList<Sach> danhSachSach = new ArrayList<Sach>();
        danhSachSach.add(sach1);
        danhSachSach.add(sach2);
        for(int i = 0; i < danhSachSach.size(); i++){
            System.out.println("Thong tin sach thu " + (i + 1));
            System.out.println("Ma sach: " + danhSachSach.get(i).getMaSach());
            System.out.println("Tieu de: " + danhSachSach.get(i).getTieuDe());
            System.out.println("Tac gia: " + danhSachSach.get(i).getTacGia());
            System.out.println("Nam xuat ban: " + danhSachSach.get(i).getNamXuatBan());
            System.out.println("So luong: " + danhSachSach.get(i).getSoLuong());
        }
    }
}
