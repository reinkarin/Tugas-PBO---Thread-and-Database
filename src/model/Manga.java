package model;

// Subclass yang mewarisi Komik
public class Manga extends Komik {
    private String negaraAsal;

    public Manga(String judul, String pengarang, String genre, int tahunRilis, String negaraAsal) {
        super(judul, pengarang, genre, tahunRilis);
        this.negaraAsal = negaraAsal;
    }

    public String getNegaraAsal() {
        return negaraAsal;
    }
}
