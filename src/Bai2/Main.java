package Bai2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuanLyPhuongTienGiaoThong qlptgt = new QuanLyPhuongTienGiaoThong();

        // Thêm phương tiện vào danh sách
        qlptgt.themPhuongTien(new Oto("oto001", "Toyota", 2019, 150000, "đen", 5, "dầu"));
        qlptgt.themPhuongTien(new XeMay("xemay001", "Honda", 2020, 50000, "đỏ", 150));
        qlptgt.themPhuongTien(new XeTai("xetai001", "Isuzu", 2018, 200000, "trắng", 5000));

        // Hiển thị danh sách phương tiện
        System.out.println("Danh sách phương tiện:");
        qlptgt.hienThiDanhSach();

        // Sắp xếp các phương tiện theo giá bán
        qlptgt.sapXepTheoGiaBan();
        System.out.println("Danh sách phương tiện sau khi sắp xếp theo giá bán:");
        qlptgt.hienThiDanhSach();

        // Tìm phương tiện theo hãng sản xuất
        String hangSxCanTim = "Toyota";
        List<PhuongTienGiaoThong> ketQuaTimTheoHangSx = qlptgt.timPhuongTienTheoHangSx(hangSxCanTim);
        System.out.println("Các phương tiện của hãng " + hangSxCanTim + ":");
        for (PhuongTienGiaoThong ptgt : ketQuaTimTheoHangSx) {
            System.out.println("ID: " + ptgt.getID() + " - Màu xe: " + ptgt.getMauXe());
        }

        // Tìm phương tiện theo màu xe
        String mauXeCanTim = "đỏ";
        List<PhuongTienGiaoThong> ketQuaTimTheoMauXe = qlptgt.timPhuongTienTheoMauXe(mauXeCanTim);
        System.out.println("Các phương tiện có màu " + mauXeCanTim + ":");
        for (PhuongTienGiaoThong ptgt : ketQuaTimTheoMauXe) {
            System.out.println("ID: " + ptgt.getID() + " - Hãng sản xuất: " + ptgt.getHangSx());
        }

        qlptgt.thoatChuongTrinh();
    }
}
