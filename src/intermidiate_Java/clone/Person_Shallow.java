package intermidiate_Java.clone;
// shallow copy :  We only copy the main object , and references the same that the main object references
// cit's a reflection any changes made will be reflected to the other

class CloningDemo implements Cloneable{

    int num;

    String player;

    CloningDemo(int n,String player){

        this.num=n;

        this.player=player;

    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String args[]){

        try{

            CloningDemo realMadrid=new CloningDemo(7,"Cristiano Ronaldo");
            CloningDemo juventus=(CloningDemo)realMadrid.clone();

            System.out.println(realMadrid.num+" "+realMadrid.player);

            System.out.println(juventus.num+" "+juventus.player);

        }catch(CloneNotSupportedException c){}

    }


}
