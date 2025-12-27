import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 23431;

        try {
            Socket socket = new Socket(serverAddress, port);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true
            );

            // Kullanıcıdan metin al
            Scanner scanner = new Scanner(System.in);
            System.out.print("Metin giriniz: ");
            String mesaj = scanner.nextLine();

            // Sunucuya gönder
            out.println(mesaj);

            // Sunucudan gelen sonucu al
            String cevap = in.readLine();
            System.out.println("Sunucudan gelen cevap: " + cevap);

            // Kapat
            in.close();
            out.close();
            socket.close();
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
