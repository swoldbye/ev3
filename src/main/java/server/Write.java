package server;

import java.io.PrintWriter;


public class Write extends Thread{

    PrintWriter out;


    public Write(PrintWriter out){
        this.out = out;

    }

    @Override
    public void run() {

    }
}
