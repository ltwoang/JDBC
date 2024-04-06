public class LaiXe {
    private int maLX;
    private static int nextMaLX = 10000;
    private String hoTen;
    private String diaChi;
    private String soDT;
    private String trinhDo;

    public LaiXe(String hoTen, String diaChi, String soDT, String trinhDo) {
        this.maLX = nextMaLX++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.trinhDo = trinhDo;
    }

    public int getMaLX() {
        return maLX;
    }

    public void setMaLX(int maLX) {
        this.maLX = maLX;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String toString() {
        return "Ma Lai Xe: " + maLX + ". " +
                "Ho Ten: " + hoTen + ". " +
                "Dia Chi: " + diaChi + ". " +
                "So Dien Thoai: " + soDT + ". " +
                "Trinh do: " + trinhDo + ". ";
    }
}
