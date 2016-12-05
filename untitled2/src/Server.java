/**
 * Created by апаив on 05.12.2016.
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            while (true) {
                Socket client = null;
                while (client == null) {
                    client = serverSocket.accept(); // ждём клиента
                }
                SocketThread clientThread = new SocketThread(client); //Создаем новый поток, которому передаем сокет
                Thread t = new Thread(clientThread);
            }
        } catch (SocketException e) {
            System.err.println("Socket exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("I/O exception");
            e.printStackTrace();
        }
    }
}

