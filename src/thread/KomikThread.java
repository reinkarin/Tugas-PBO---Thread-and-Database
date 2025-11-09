package thread;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Manga;

public class KomikThread extends Thread {
    private Connection conn;
    private Manga manga;

    public KomikThread(Connection conn, Manga manga) {
        this.conn = conn;
        this.manga = manga;
    }

    @Override
    public void run() {
        String sql = "INSERT INTO komik (judul, pengarang, genre, tahun_rilis) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, manga.getJudul());
            ps.setString(2, manga.getPengarang());
            ps.setString(3, manga.getGenre());
            ps.setInt(4, manga.getTahunRilis());
            ps.executeUpdate();

            System.out.println("✅ Komik \"" + manga.getJudul() + "\" berhasil ditambahkan oleh thread: " + Thread.currentThread().getName());
        } catch (SQLException e) {
            System.out.println("❌ Gagal menambah data: " + e.getMessage());
        }
    }
}
