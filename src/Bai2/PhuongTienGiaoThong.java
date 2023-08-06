package Bai2;

public class PhuongTienGiaoThong {
    protected String ID;
    protected String hangSx;
    protected int namSx;
    protected double giaBan;
    protected String mauXe;

    public PhuongTienGiaoThong(String ID, String hangSx, int namSx, double giaBan, String mauXe) {
        this.ID = ID;
        this.hangSx = hangSx;
        this.namSx = namSx;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }
}
