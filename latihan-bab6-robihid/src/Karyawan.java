
public class Karyawan {

    private String nama;
    private int masaKerja;
    private int gajiPokok;
    private int bonusPerBulan;
    private int totalGaji;

    public Karyawan(String nama, int masaKerja) {
        this.nama = nama;
        this.masaKerja = masaKerja;
        gajiPokok = 2500000;
    }

    public int getBonusPerBulan() {
        if (masaKerja > 5) {
            bonusPerBulan = 250000;
        } else {
            bonusPerBulan = 0;
        }
        return bonusPerBulan;
    }

    public int getmasaKerja() {
        return masaKerja;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getTotalGaji() {
        totalGaji = getGajiPokok() + getBonusPerBulan();
        return totalGaji;
    }
}
