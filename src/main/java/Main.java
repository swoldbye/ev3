import server.ClientConnector;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try{
            ClientConnector clientConnector = new ClientConnector();
            clientConnector.connect();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
