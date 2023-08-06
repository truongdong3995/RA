package Bai2;

public class XeTai extends PhuongTienGiaoThong{
    private double trongTai;

    public XeTai(String ID, String hangSx, int namSx, double giaBan, String mauXe, double trongTai) {
        super(ID, hangSx, namSx, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
}
