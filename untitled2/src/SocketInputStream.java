import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by апаив on 05.12.2016.
 */

// Поток считывает входные данные
public class SocketInputStream implements Runnable {

    private Socket socket = null;
    private Scanner sc = null;
    //private String inMessage = null;
    private String outMessage = null;
    private InputStream in = null;
    private OutputStream out = null;
    private DataInputStream dis = null;
    private DataOutputStream dos = null;

    public SocketInputStream(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            out = socket.getOutputStream();
            while(true){
                dos = new DataOutputStream(out);
                outMessage = sc.nextLine();
                System.out.println("New message: " + outMessage);
                dos.writeUTF(outMessage);
                dos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
