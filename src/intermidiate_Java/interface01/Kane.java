package intermidiate_Java.interface01;

public class Kane implements Wrestler {


    @Override
    public void thememusic() {
        System.out.println("highway to hell");
    }

    @Override
    public void finisher() {
        System.out.println("kk byeeeee");
    }

    @Override
    public void payment(int h) {
        System.out.println("payment total:"+ h*5);
    }
}
