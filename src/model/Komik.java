package model;

public class Komik {
    protected String judul;
    protected String pengarang;
    protected String genre;
    protected int tahunRilis;

    public Komik(String judul, String pengarang, String genre, int tahunRilis) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }

    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }
    public String getGenre() { return genre; }
    public int getTahunRilis() { return tahunRilis; }
}
