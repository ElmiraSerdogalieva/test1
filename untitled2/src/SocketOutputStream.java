import java.io.*;
import java.net.Socket;
import java.util.Scanner;


/**
 * Created by апаив on 05.12.2016.
 */

//Поток читает ввод с клавиатуры и отправляет на сервер
public class SocketOutputStream implements Runnable {

    private Socket socket = null;
    private String inMessage = null;
    private String outMessage = null;
    private InputStream in = null;
    private DataInputStream dis = null;
    private DataOutputStream dos = null;

    public SocketOutputStream(Socket socket) throws IOException {
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            in = socket.getInputStream();
            //Scanner sc = new Scanner(System.in);
            while (true) {
                //outMessage = sc.nextLine();
                dis = new DataInputStream(in);
                String inMessage = dis.readUTF();
                System.out.println();
                //System.out.println(outMessage);
                dos.writeUTF(inMessage);
                dos.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}