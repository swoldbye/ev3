package server;

import controllers.CommunicationsTranslator;

import java.io.BufferedReader;
import java.io.IOException;

public class Listen extends Thread {

    BufferedReader in;


    public Listen(BufferedReader in){
        this.in = in;
    }

    @Override
    public void run() {
        CommunicationsTranslator comT = new CommunicationsTranslator();
        String input;

        try{
            while((input = in.readLine()) != null){
                System.out.println(input);
                comT.translate(input);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
