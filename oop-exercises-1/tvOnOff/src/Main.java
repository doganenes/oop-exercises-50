public class Main {

    public static void main(String[] args) {

        TvSituation tv = new TvSituation();

        tv.turnOn();
        tv.volumeUp();
        tv.setChannel(46);

        tv.showInfo();

        System.out.println("-------------------------");
        System.out.println("This channel number is: " + tv.setChannel(56));

        System.out.println("This volume level is: " + tv.setVolumeLevel(44));

        TvSituation tv2 = new TvSituation();


        tv.channelDown();
        tv.channelDown();
        System.out.println("This channel number is: " + tv.channel);

        System.out.println();
        System.out.println();
        tv2.showInfo();
        tv.showInfo();
    }

}