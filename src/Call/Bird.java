package Call;

import javax.sound.midi.Soundbank;

public class Bird {
    int speed = 30;
    Bird(){
        System.out.println("Bird DC");
    }
    Bird(int speed) {
        this.speed = speed;
        System.out.println("Bird PC "+speed);
    }
}

class Pigon extends Bird{
    int speed = 50;
    Pigon(){
        super(5);
        System.out.println("Pigon DC");
    }
    Pigon(int speed){
        super(5);
        this.speed = speed;
        System.out.println("Pigon PC "+speed);
    }
}