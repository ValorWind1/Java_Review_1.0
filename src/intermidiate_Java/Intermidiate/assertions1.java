package intermidiate_Java.Intermidiate;


public class assertions1 {
    //assert or state for sure certain conditions in our code
    // Run , Edit configurations , vm options , -ea

    public static void main(String[] args) {

        int [] array1 = {2,3,4,5};
//        System.out.println(sumArray(array1));


        example2(3);

    }

//    public static int sumArray(int [] n){
////        assert n.length>0;
//
//        assert n.length>0 && n[0] > 1 ;
//
//        int total = 0 ;
//        for(int i = 0 ; i < n.length;i++){
//            total += n[i];
//        }
//        return total;
//    }

    public static int example2 ( int n){


        assert n < 10:"not valid";
        return n;
    }
}
