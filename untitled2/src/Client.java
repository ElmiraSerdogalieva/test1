import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by апаив on 05.12.2016.
 */
public class Client {
    public static void main(String[] args){
        try{
            Socket s = new Socket("127.0.0.1", 1234);
            Thread threadIn = new Thread(new SocketInputStream(s)); // создание отдельного потока на считывание даных от сервера
            Thread threadOut = new Thread(new SocketOutputStream(s)); // создание отдельного потока на ввод даных из клавиатуры
            threadIn.start();
            threadOut.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
