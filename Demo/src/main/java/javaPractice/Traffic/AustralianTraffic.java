
package javaPractice.Traffic;

import org.apache.hc.core5.http.io.SessionOutputBuffer;

public class AustralianTraffic implements CentralisedTraffic,ContinentTraffic {
    public static void main(String[] args) {
        CentralisedTraffic traffic = new AustralianTraffic();
        traffic.green();
        traffic.red();
        traffic.yellow();
        AustralianTraffic at = new AustralianTraffic();
        at.drive();
        ContinentTraffic ct= new AustralianTraffic();
        ct.walk();

    }

    @Override
    public void red() {
        System.out.println("Stop");
    }

    @Override
    public void yellow() {
        System.out.println("wait");

    }

    @Override
    public void green() {
        System.out.println("go");
    }

    public void drive() {
        System.out.println("drive on Right Side");
    }

    @Override
    public void walk() {
        System.out.println("walk on right side");
    }
}