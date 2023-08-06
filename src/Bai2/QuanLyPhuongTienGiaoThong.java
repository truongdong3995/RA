package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyPhuongTienGiaoThong {
    private List<PhuongTienGiaoThong> danhSachPhuongTien;

    public QuanLyPhuongTienGiaoThong() {
        danhSachPhuongTien = new ArrayList<>();
    }

    public void themPhuongTien(PhuongTienGiaoThong phuongTien) {
        danhSachPhuongTien.add(phuongTien);
    }

    public void xoaPhuongTienTheoID(String ID) {
        danhSachPhuongTien.removeIf(phuongTien -> phuongTien.getID().equals(ID));
    }

    public void sapXepTheoGiaBan() {
        Collections.sort(danhSachPhuongTien, Comparator.comparingDouble(PhuongTienGiaoThong::getGiaBan));
    }

    public List<PhuongTienGiaoThong> timPhuongTienTheoHangSx(String hangSx) {
        List<PhuongTienGiaoThong> ketQua = new ArrayList<>();
        for (PhuongTienGiaoThong ptgt : danhSachPhuongTien) {
            if (ptgt.getHangSx().equalsIgnoreCase(hangSx)) {
                ketQua.add(ptgt);
            }
        }
        return ketQua;
    }

    public List<PhuongTienGiaoThong> timPhuongTienTheoMauXe(String mauXe) {
        List<PhuongTienGiaoThong> ketQua = new ArrayList<>();
        for (PhuongTienGiaoThong ptgt : danhSachPhuongTien) {
            if (ptgt.getMauXe().equalsIgnoreCase(mauXe)) {
                ketQua.add(ptgt);
            }
        }
        return ketQua;
    }

    public void hienThiDanhSach() {
        for (PhuongTienGiaoThong ptgt : danhSachPhuongTien) {
            System.out.println("ID: " + ptgt.getID());
            System.out.println("Hãng sản xuất: " + ptgt.getHangSx());
            System.out.println("Năm sản xuất: " + ptgt.getNamSx());
            System.out.println("Giá bán: " + ptgt.getGiaBan());
            System.out.println("Màu xe: " + ptgt.getMauXe());
            if (ptgt instanceof Oto) {
                Oto oto = (Oto) ptgt;
                System.out.println("Số chỗ ngồi: " + oto.getSoChoNgoi());
                System.out.println("Kiểu động cơ: " + oto.getKieuDongCo());
            } else if (ptgt instanceof XeMay) {
                XeMay xeMay = (XeMay) ptgt;
                System.out.println("Công suất: " + xeMay.getCongXuat());
            } else if (ptgt instanceof XeTai) {
                XeTai xeTai = (XeTai) ptgt;
                System.out.println("Trọng tải: " + xeTai.getTrongTai());
            }
            System.out.println("==============================");
        }
    }

    public void thoatChuongTrinh() {
        System.out.println("Chương trình kết thúc.");
        System.exit(0);
    }
}
