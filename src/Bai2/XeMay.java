package Bai2;

public class XeMay extends PhuongTienGiaoThong{
    private double congXuat;
    public XeMay(String ID, String hangSx, int namSx, double giaBan, String mauXe, double congXuat) {
        super(ID, hangSx, namSx, giaBan, mauXe);
        this.congXuat = congXuat;
    }

    public double getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(double congXuat) {
        this.congXuat = congXuat;
    }
}
