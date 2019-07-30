package intermidiate_Java.interface01;

public class StoneCold implements Wrestler {
    @Override
    public void thememusic() {
        System.out.println("Stone cold  Intro");
    }

    @Override
    public void finisher() {
        System.out.println("Winter Time bby");
    }

    @Override
    public void payment(int h) {
        System.out.println("total payment will be "+h*5);

    }
}
