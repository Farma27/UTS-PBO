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

    public void ambilNama(String nm) {
        nama = nm;
    }

    public void ambilUmur(int um) {
        umur = um;
    }

    public void ambilNoHP(String hp) {
        noHP = hp;
    }

    public String namanyaAdalah() {
        return nama;
    }

    public int umurnyaAdalah() {
        return umur;
    }

    public String noHPnyaAdalah() {
        return noHP;
    }
}