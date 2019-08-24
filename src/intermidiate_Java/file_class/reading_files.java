package intermidiate_Java.file_class;

import java.io.File;
import java.util.Scanner;

public class reading_files {

    private Scanner x ;

    public void openFile(){
        try{
            x= new Scanner(new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\file_class\\chinese.txt"));
        }catch(Exception e){
            System.out.println("error");
        }
    }

    public void readData(){
        while(x.hasNext()){  // loop through the niside of the file (iterate)
            System.out.println(x.nextLine()+"\n");

        }
    }

    public void closeFile(){
        x.close();
    }

    public static void main(String[] args) {
        reading_files robj = new reading_files();

        robj.openFile();
        robj.readData();
        robj.closeFile();
    }

}
