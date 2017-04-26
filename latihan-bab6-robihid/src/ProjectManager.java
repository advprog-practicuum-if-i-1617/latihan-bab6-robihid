
public class ProjectManager extends Karyawan {

    private int tunjangan;
    private int bonusPerBulan;
    private int bonusApresiasi;
    private int totalGaji;

    public ProjectManager(String nama, int masaKerja) {
        super(nama, masaKerja);
        tunjangan = 6000000;
        bonusPerBulan = 450000;
    }

    public int getBonusApresiasi() {
        if (super.getmasaKerja() >= 10) {
            bonusApresiasi = 700000;
        } else {
            bonusApresiasi = 225000;
        }
        return bonusApresiasi;
    }

    @Override
    public int getTotalGaji() {
        totalGaji = super.getTotalGaji() + tunjangan + bonusPerBulan + getBonusApresiasi();
        return totalGaji;
    }
}
