import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by апаив on 05.12.2016.
 */
public class SocketThread implements Runnable{

    private Socket s = null;
    private Scanner in = null;
    private OutputStream out = null;
    private DataOutputStream dos = null;
    private String inMessage = null;
    private String outMessage = null;
    private ArrayList<Socket> listSocket = null;

    public SocketThread(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        try{
            out = s.getOutputStream();
            listSocket.add(s);
            in = new Scanner(s.getInputStream());
            while(true) {
                inMessage = in.nextLine();
                for (Socket socket : listSocket) {
                    dos = new DataOutputStream(out);
                    dos.writeUTF(inMessage);
                    out.flush();
                    s.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
