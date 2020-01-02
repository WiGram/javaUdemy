package gram.william;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean winterPlay = (temperature >= 25 && temperature <= 35) && !summer;
        boolean summerPlay = (temperature >= 25 && temperature <= 45) && summer;
        return winterPlay || summerPlay;
    }
}
