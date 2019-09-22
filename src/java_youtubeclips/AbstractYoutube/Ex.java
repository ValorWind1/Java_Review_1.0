package java_youtubeclips.AbstractYoutube;

public class Ex {
    public static void main(String[] args) {
        SuperHeroes sp1 = new Batman();
        SuperHeroes sp2 = new SuperMan();

        sp1.powerLvl(2300);
        sp1.themeSong();
        sp1.speacialMove();

        sp2.powerLvl(3000);
        sp2.speacialMove();
        sp2.themeSong();
    }

}
