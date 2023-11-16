package data_D1A220065;

public class teman_FadhilahNuramadhan {
    private String nama = "";
    private int umur = 0;
    private String noHP = "";

    public teman_FadhilahNuramadhan() {
        nama = "";
        umur = 0;
        noHP = "";
    }

    public teman_FadhilahNuramadhan(String nm, int um, String hp) {
        nama = nm;
        umur = um;
        noHP = hp;
    }

    public String ambilNama() {
        return nama;
    }

    public int ambilUmur() {
        return umur;
    }

    public String ambilnoHP() {
        return noHP;
    }

    public void memberiNama(String nm) {
        nama = nm;
    }

    public void memberiUmur(int um) {
        umur = um;
    }

    public void memberinoHP(String hp) {
        noHP = hp;
    }
}