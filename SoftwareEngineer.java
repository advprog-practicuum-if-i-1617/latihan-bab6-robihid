
public class SoftwareEngineer extends Karyawan {

    private int tunjangan;
    private int bonusPerBulan;
    private int totalGaji;

    public SoftwareEngineer(String nama, int masaKerja) {
        super(nama, masaKerja);
        tunjangan = 5500000;
        bonusPerBulan = 300000;
    }

    @Override
    public int getTotalGaji() {
        totalGaji = super.getTotalGaji() + tunjangan + bonusPerBulan;
        return totalGaji;
    }

}
