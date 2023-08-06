package Bai2;

public class Oto extends PhuongTienGiaoThong{
    private int soChoNgoi;
    private String kieuDongCo;
    public Oto(String ID,
               String hangSx,
               int namSx,
               double giaBan,
               String mauXe,
               int soChoNgoi,
               String kieuDongCo) {
        super(ID, hangSx, namSx, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
}
