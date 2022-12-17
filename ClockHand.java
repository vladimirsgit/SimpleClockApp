public class ClockHand {
   private int hours;
   private int minutes;
   private int seconds;

    public void advance(){
        this.seconds+=1;
        if(this.seconds == 60) {
            this.seconds = 0;
            this.minutes +=1;
            if(this.minutes == 60){
                this.minutes = 0;
                this.hours+=1;
                if(this.hours == 24)
                    this.hours = 0;
            }
        }

    }

    public boolean stop(){
        if(hours == 23 && minutes == 59 && seconds == 59) {
            System.out.println(hours + ":" + minutes + ":59");
            return false;
        }
        else return true;
    }

    public void show(){
        if(this.hours < 10) System.out.print("0" + this.hours + ":");
        else System.out.print(this.hours + ":");
        if(this.minutes < 10) System.out.print("0" + this.minutes + ":");
        else System.out.print(this.minutes + ":");
        if(this.seconds < 10) System.out.println("0" + this.seconds);
        else System.out.println(this.seconds);

    }
}