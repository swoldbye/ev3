package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientConnector{

    private Socket socket;

    private PrintWriter out;
    private BufferedReader in;

    public void connect() throws IOException {
        socket = new Socket(ConnectionSettings.IP, ConnectionSettings.PORT);
        System.out.println("Connected");
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        Listen listen = new Listen(in);
        Write writer = new Write(out);

        listen.start();
        //writer.start();
    }
}
