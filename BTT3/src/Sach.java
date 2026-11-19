public class Sach {
    //Yêu cầu 1: Tạo một lớp có tên là Sach (Book) để biểu diễn thông tin về một cuốn sách.
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    public Sach(String ms, String td, String tg, int nxb, int sl){
        this.maSach=ms;
        this.tieuDe=td;
        this.tacGia=tg;
        this.namXuatBan=nxb;
        this.soLuong=sl;
    }

    //Yêu cầu 2: Tạo một phương thức hienThiThongTin() (displayInfo) trong lớp Sach để in ra tất cả thông tin chi tiết của một cuốn sách ra màn hình.
    public void hienThiThongTin(){
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de : " + tieuDe);
        System.out.println("Tac gia : " + tacGia);
        System.out.println("Nam xuat ban : " + namXuatBan);
        System.out.println("So luong : " + soLuong);
    }

}
