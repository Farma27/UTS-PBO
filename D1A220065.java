import data_D1A220065.teman_FadhilahNuramadhan;
import java.util.Scanner;

public class D1A220065 {
    private String nm = "";
    private int um = 0;
    private String noHP = "";

    private static teman_FadhilahNuramadhan teman[] = new teman_FadhilahNuramadhan[4];

    public D1A220065() {
        teman[0] = new teman_FadhilahNuramadhan("Adi", 18, "081823456789");
        teman[1] = new teman_FadhilahNuramadhan("Budi", 19, "081823456788");
        teman[2] = new teman_FadhilahNuramadhan("Cepi", 20, "081823456787");
        teman[3] = new teman_FadhilahNuramadhan("Dudi", 21, "081823456786");

        // tampilSemuaData("Data awal yang sudah ada");
    }

    private static void masukanData() {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;
        String noHP;

        for (int i = 0; i < teman.length; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Nama : " ); nama = input.nextLine();
            System.out.print("Umur : " ); umur = input.nextInt();
            System.out.print("noHP : " ); noHP = input.nextLine();

            teman[i].ambilNama(nama);
            teman[i].ambilUmur(umur);
            teman[i].ambilNoHP(noHP);
        }
    }

    // method tampil data ke-i

    // method tampil semua data
}
