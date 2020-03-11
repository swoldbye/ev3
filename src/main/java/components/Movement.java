package components;

import ev3dev.actuators.lego.motors.NXTRegulatedMotor;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;
import lejos.hardware.port.*;


public class Movement implements components.Movement_Interface {

    public static RegulatedMotor A = new NXTRegulatedMotor(MotorPort.A);
    public static RegulatedMotor B = new NXTRegulatedMotor(MotorPort.B);
    public static RegulatedMotor C = new NXTRegulatedMotor(MotorPort.C);
    public static RegulatedMotor D = new NXTRegulatedMotor(MotorPort.D);

    public void spinOnAxis(int degrees) {
        A.setSpeed(120);
        B.setSpeed(120);
        double deg = (double)degrees * 1.9;

        if(degrees >= 0){  //if counter-clockwise.
            A.rotate((int)deg, true);
            B.rotate((int)deg*-1, true);
        }else{              //else clockwise.
            A.rotate((int)deg*-1, true);
            B.rotate((int)deg, true);
        }
    }

    public void forwardByDist(int cm) {
        double cmPerDeg = 0.06;
        double deg = cm/cmPerDeg;
        A.setSpeed(300);
        B.setSpeed(300);
        if(cm >= 0){    //if forward.
            A.rotate((int)deg, true);
            B.rotate((int)deg, true);

        }else{              //else backward.
            A.rotate((int)deg, true);
            B.rotate((int)deg, true);
        }
    }

    public void backwardByDist(int meters) {
        A.setSpeed(meters);
        B.setSpeed(meters);
        A. backward();
        B.backward();
        System.out.println(meters);
        Delay.msDelay(2000);
        A.stop();
        B.stop();
    }

    public void stop() {
        A.stop();
        B.stop();
    }
}
