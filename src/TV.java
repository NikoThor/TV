public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on;

    public TV() {

    }

    public void turnOn() {
        on = true
        ;
    }

    public void turnOff() {
        on = false;
    }

    public void channelUp() {
        if (channel <= 120) {
            channel++;
        } else {
            channel = 1;
        }
    }
        public void channelDown(){
            if (channel >= 120) {
                channel--;
            } else {
                channel = 1;
            }
        }
        public void volumeUp () {
            if (volumeLevel < 7) {
                volumeLevel++;
            } else
                volumeLevel = 7;
        }
        public void volumeDown () {
            if (volumeLevel>1){
                volumeLevel--;
        } else {
                volumeLevel = 1;
            }
    }
}