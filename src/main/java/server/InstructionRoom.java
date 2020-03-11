package server;

import java.io.DataInputStream;
import java.io.IOException;

public class InstructionRoom implements Runnable {

    DataInputStream dIn;

    public InstructionRoom(DataInputStream dataInputStream){
        this.dIn = dataInputStream;
    }

    @Override
    public void run() {
        try{
            while(true){
                String str = dIn.readUTF();
                System.out.println(str);
                if(str.equals("0")){
                    break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
