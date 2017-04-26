
public class Main {

    public static void main(String[] args) {
        Karyawan k = new Karyawan("Joni", 7);
        SoftwareEngineer se = new SoftwareEngineer("Joko", 7);
        ProjectManager pm = new ProjectManager("Budi", 12);
        System.out.println(k.getTotalGaji());
        System.out.println(se.getTotalGaji());
        System.out.println(pm.getTotalGaji());

    }

}
