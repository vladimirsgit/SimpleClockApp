import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        ClockHand myClock = new ClockHand();

        while(myClock.stop()){
            myClock.show();
            myClock.advance();

        }


    }
}