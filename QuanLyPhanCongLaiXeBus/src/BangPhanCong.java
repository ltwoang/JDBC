import java.util.ArrayList;
public class BangPhanCong {
    private LaiXe laiXe;
    private Tuyen tuyen;
    private int soLuot;

    public BangPhanCong(LaiXe laiXe, Tuyen tuyen, int soLuot) {
        this.laiXe = laiXe;
        this.tuyen = tuyen;
        this.soLuot = soLuot;
    }

    public LaiXe getLaiXe() {
        return laiXe;
    }

    public void setLaiXe(LaiXe laiXe) {
        this.laiXe = laiXe;
    }

    public Tuyen getTuyen() {
        return tuyen;
    }

    public void setTuyen(Tuyen tuyen) {
        this.tuyen = tuyen;
    }

    public int getSoLuot() {
        return soLuot;
    }

    public void setSoLuot(int soLuot) {
        this.soLuot = soLuot;
    }

    public String toString() {
        return "Bang phan cong " +
                "Lai Xe: " + laiXe +
                "Tuyen: " + tuyen +
                "So Luot: " + soLuot;
    }
}
