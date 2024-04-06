public class Tuyen {
    private int maTuyen;
    private static int nextMaTuyen = 100;
    private double khoangCach;
    private int soDiemDung;

    public Tuyen(double khoangCach, int soDiemDung) {
        this.maTuyen = nextMaTuyen++;
        this.khoangCach = khoangCach;
        this.soDiemDung = soDiemDung;
    }

    public int getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(int maTuyen) {
        this.maTuyen = maTuyen;
    }


    public double getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(double khoangCach) {
        this.khoangCach = khoangCach;
    }

    public int getSoDiemDung() {
        return soDiemDung;
    }

    public void setSoDiemDung(int soDiemDung) {
        this.soDiemDung = soDiemDung;
    }

    @Override
    public String toString() {
        return
                "Ma tuyen: " + maTuyen + ". " +
                "Khoang cach: " + khoangCach + ". " +
                "So diem dung: " + soDiemDung + ". ";
    }
}
