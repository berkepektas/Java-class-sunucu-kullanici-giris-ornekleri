import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        int port = 23431;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Sunucu başlatildi. İstemci bekleniyor...");

            // Tek istemci kabul edilir
            Socket clientSocket = serverSocket.accept();
            System.out.println("İstemci bağlandi.");

            // Okuma ve yazma akışları
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true
            );

            // İstemciden gelen metni oku
            String mesaj = in.readLine();
            System.out.println("Gelen mesaj: " + mesaj);

            // Kelime sayısını hesapla
            int kelimeSayisi = 0;
            if (mesaj != null && !mesaj.trim().isEmpty()) {
                kelimeSayisi = mesaj.trim().split("\\s+").length;
            }

            // Sonucu istemciye gönder
            out.println("Kelime Sayisi: " + kelimeSayisi);

            // Bağlantıları kapat
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

            System.out.println("Sunucu kapatildi.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
