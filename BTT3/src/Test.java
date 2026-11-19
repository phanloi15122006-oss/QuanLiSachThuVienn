import java.util.ArrayList;

//Yêu cầu 3: Xây dựng lớp Test để tạo đối tượng từ lớp Sach.
public class Test {
    public static void main(String[] args){
        Sach Sachs1 = new Sach(  "001",  "Lập trình cơ bản với C", "HTML", 1990,  4);
        Sach Sachs2 = new Sach("002", "Triết học Mác-LêNin", "Lê Phạm Đức Quang", 2007, 5);

        //Yêu cầu 4: Tạo và quản lý danh sách Sach bằng ArrayList
        ArrayList<Sach> Sach = new ArrayList<Sach>();
        Sach.add(Sachs1);
        Sach.add(Sachs2);
        for(int i=0; i<Sach.size(); i++){
            System.out.println("Thong tin sach thu " + (i + 1));
            Sach.get(i).hienThiThongTin();
        }
    }
}
