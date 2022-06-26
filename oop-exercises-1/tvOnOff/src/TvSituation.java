public class TvSituation {

    int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false; // when we use define the private, we only access this class.

    public TvSituation() {
        this.volumeLevel = setVolumeLevel(volumeLevel);

        System.out.println("Volume level is: " + this.volumeLevel);

    }

    public void turnOn() {

        on = true;

    }

    public void turnOff() {

        on = false;

    }

    public int setChannel(int channel) {

        if (on && channel <= 100) {

            this.channel = channel;
        }

        return channel;
    }

    public int setVolumeLevel(int volumeLevel) {

        if (on && volumeLevel >= 1 && volumeLevel <= 100) {

            this.volumeLevel = volumeLevel;

        }
        return volumeLevel;


    }

    public void channelUp() {

        if (on && channel <= 100) {

            channel++;
        }

    }

    public void channelDown() {

        if (on && channel >= 1) {

            channel++;
        }
    }

    public void volumeUp() {

        if (on && volumeLevel <= 100) {
            volumeLevel++;
        }
    }

    public void volumeDown() {

        if (on && volumeLevel >= 1) {

            volumeLevel--;
        }
    }

    public void showInfo() {

        System.out.println("TV Situations: " + on + " channel is: " + channel + " volume is: " + volumeLevel);

    }
}