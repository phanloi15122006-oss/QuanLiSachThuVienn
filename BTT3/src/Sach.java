public class Sach {
    //Yêu cầu 1: Tất cả các thuộc tính của lớp Sach (ví dụ: maSach, tieuDe, tacGia, namXuatBan, soLuong) phải được khai báo với từ khóa private.
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    //Yêu cầu 2: Cung cấp đầy đủ các phương thức public getters (phương thức truy cập) và setters (phương thức sửa đổi) cho tất cả các thuộc tính của lớp Sach.
    public void setMaSach(String maSach){
        this.maSach=maSach;
    }
    public String getMaSach(){
        return maSach;
    }
    public void setTieuDe(String tieuDe){
        this.tieuDe=tieuDe;
    }
    public String getTieuDe(){
        return tieuDe;
    }
    public void setTacGia(String tacGia){
        this.tacGia=tacGia;
    }
    public String getTacGia(){
        return tacGia;
    }
    //Yêu cầu 3: Trong setNamXuatBan(int namXuatBan): Đảm bảo namXuatBan không lớn hơn năm hiện tại hoặc nhỏ hơn một giá trị hợp lý nào đó (ví dụ: if(namXuatBan > 0 && namXuatBan <= currentYear)).
    public void setNamXuatBan(int namXuatBan){
        int namHienTai=java.time.Year.now().getValue();
        if(namXuatBan>0 && namXuatBan<=namHienTai)
            this.namXuatBan = namXuatBan;
        else
            System.out.println("Nam xuat ban khong hop le");
    }
    public int getNamXuatBan(){
        return namXuatBan;
    }
    //Yêu cầu 3: Trong setSoLuong(int soLuong): Đảm bảo soLuong không âm (if(soLuong >= 0)).
    public void setSoLuong(int soLuong){
        if(soLuong>=0)
            this.soLuong=soLuong;
        else
            System.out.println("So luong khong hop le");
    }
    public int getSoLuong(){
        return soLuong;
    }
    //Yêu cầu 4: Thêm một constructor có tham số đầy đủ vào lớp Sach, cho phép khởi tạo tất cả các thuộc tính (maSach, tieuDe, tacGia, namXuatBan, soLuong) khi tạo một đối tượng Sach.
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }
}

