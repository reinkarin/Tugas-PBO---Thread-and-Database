import config.DatabaseConfig;
import model.Manga;
import thread.KomikThread;
import java.sql.Connection;

public class MainApp {
    public static void main(String[] args) {
        Connection conn = DatabaseConfig.getConnection();

        if (conn != null) {
            // Data komik yang ingin ditambahkan
            Manga k1 = new Manga("One Piece", "Eiichiro Oda", "Petualangan", 1997, "Jepang");
            Manga k2 = new Manga("Naruto", "Masashi Kishimoto", "Aksi", 1999, "Jepang");
            Manga k3 = new Manga("Doraemon", "Fujiko F. Fujio", "Komedi", 1970, "Jepang");
            Manga k4 = new Manga("Attack on Titan", "Hajime Isayama", "Fantasi", 2009, "Jepang");
            Manga k5 = new Manga("Spy x Family", "Tatsuya Endo", "Aksi Komedi", 2019, "Jepang");

            // Jalankan tiap thread
            Thread t1 = new KomikThread(conn, k1);
            Thread t2 = new KomikThread(conn, k2);
            Thread t3 = new KomikThread(conn, k3);
            Thread t4 = new KomikThread(conn, k4);
            Thread t5 = new KomikThread(conn, k5);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
        }
    }
}
