package intermidiate_Java.abstract_Class;

public class ex {
    public static void main(String[] args) {
        Wrestler w1 = new Kane();
        Wrestler w2 = new StoneCold();

        w1.themeMusic();
        w1.finisher();
        w1.paymentForWork(7);

        w2.themeMusic();
        w2.finisher();
        w2.paymentForWork(5);
    }
}
