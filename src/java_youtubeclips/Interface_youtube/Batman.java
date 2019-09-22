package java_youtubeclips.Interface_youtube;

public class Batman implements SuperHeroes {


    @Override
    public void themeSong() {
        System.out.println("Dark Knight Rises");
    }

    @Override
    public void speacialMove() {
        System.out.println("I am Batman");

    }

    @Override
    public void powerLvl(int x) {
        System.out.println("power lvl is : "+x );

    }
}
