package intermidiate_Java.interface01;

public class ex {
    public static void main(String[] args) {

        Wrestler w1 = new Kane();
        Wrestler w2 = new StoneCold();

        w1.finisher();
        w1.thememusic();
        w1.payment(9);

        w2.thememusic();
        w2.payment(8);
        w2.finisher();

    }
}
