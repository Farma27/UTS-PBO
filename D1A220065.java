import data_D1A220065.teman_FadhilahNuramadhan;
import java.util.Scanner;

public class D1A220065 {
    private String nm = "";
    private int um = 0;
    private String noHP = "";

    private static teman_FadhilahNuramadhan teman[] = new teman_FadhilahNuramadhan[7];

    public D1A220065() {
        teman[0] = new teman_FadhilahNuramadhan("Adi", 18, "081823456789");
        teman[1] = new teman_FadhilahNuramadhan("Budi", 19, "081823456788");
        teman[2] = new teman_FadhilahNuramadhan("Cepi", 20, "081823456787");
        teman[3] = new teman_FadhilahNuramadhan("Dudi", 21, "081823456786");
    }

    public void masukanData() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 4; i < 7; i++) {
            System.out.println("Data ke-" + (i + 1) + " :");
            System.out.print("Nama  : "); nm = scanner.nextLine();
            System.out.print("Umur  : "); um = scanner.nextInt(); scanner.nextLine();
            System.out.print("No HP : "); noHP = scanner.nextLine();

            teman[i] = new teman_FadhilahNuramadhan(nm, um, noHP);
        }
    }

    public void ubahData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih nomor urut data : "); int i = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Data yang dipilih adalah :");
        System.out.println("Nama   : " + teman[i - 1].ambilNama());
        System.out.println("Umur   : " + teman[i - 1].ambilUmur());
        System.out.println("No HP  : " + teman[i - 1].ambilnoHP());

        System.out.println("Pengeditan Data yang ke-" + i + " :");
        System.out.print("Nama  : "); nm = scanner.nextLine();
        System.out.print("Umur  : "); um = scanner.nextInt(); scanner.nextLine();
        System.out.print("No HP : "); noHP = scanner.nextLine();

        teman[i - 1].memberiNama(nm);
        teman[i - 1].memberiUmur(um);
        teman[i - 1].memberinoHP(noHP);
    }

    public void tampilDataKe(int i) {
        System.out.println("Data yang dipilih adalah :");
        System.out.println("Nama  : " + teman[i - 1].ambilNama());
        System.out.println("Umur  : " + teman[i - 1].ambilUmur());
        System.out.println("No HP : " + teman[i - 1].ambilnoHP());
    }

    public void tampilSemuaData() {
        System.out.println("Data awal yang sudah ada :");
        System.out.println("No\tNama\tUmur\tNomor HP");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + 
                "\t" + teman[i].ambilNama() + 
                "\t" + teman[i].ambilUmur() + 
                "\t" + teman[i].ambilnoHP()
            );
        }

        System.out.println("Data Setelah ditambah :");
        System.out.println("No\tNama\tUmur\tNomor HP");
        for (int j = 0; j < 7; j++) {
            System.out.println((j + 1) + 
                "\t" + teman[j].ambilNama() + 
                "\t" + teman[j].ambilUmur() + 
                "\t" + teman[j].ambilnoHP()
            );
        }
    }

    public static void main(String[] args) {
        D1A220065 e = new D1A220065();

        System.out.println("Data awal yang sudah ada :");
        System.out.println("No\tNama\tUmur\tNomor HP");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + 
                "\t" + teman[i].ambilNama() + 
                "\t" + teman[i].ambilUmur() + 
                "\t" + teman[i].ambilnoHP()
            );
        }

        e.masukanData();
        e.tampilSemuaData();
        
        e.ubahData();
        System.out.println("Data awal yang sudah ada :");
        System.out.println("No\tNama\tUmur\tNomor HP");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + 
                "\t" + teman[i].ambilNama() + 
                "\t" + teman[i].ambilUmur() + 
                "\t" + teman[i].ambilnoHP()
            );
        }
        System.out.println("Data Setelah dirubah :");
        System.out.println("No\tNama\tUmur\tNomor HP");
        for (int j = 0; j < 7; j++) {
            System.out.println((j + 1) + 
                "\t" + teman[j].ambilNama() + 
                "\t" + teman[j].ambilUmur() + 
                "\t" + teman[j].ambilnoHP()
            );
        }
    }
}
