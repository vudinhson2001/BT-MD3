package hinhchunhat;

public class HinhChuNhat {
    double height, width;

    public HinhChuNhat(double wd, double hg) {
        this.width = wd;
        this.height = hg;
    }

    public double getDienTich() {
        return this.width * this.height;
    }

    public double getChuVi() {
        return (this.width + this.height) * 2;
    }

    public String HienThi() {
        return "Hinh Chu Nhat{" + "width = " + width + ", height=" + height + "}";
    }
}
