package java_tutorial.Files;

import java.io.*;
import java.lang.*;
import java.util.*;


public class writin_to_files {

    private Formatter x;

    public void openFile(){
        try{
            x= new Formatter("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\java_tutorial\\Files\\file2.txt");
        }
        catch(Exception e){
            System.out.println("Error time");
        }
    }

    public void addRecords(){

        x.format("%s%s%s","20 ","Dan ","Leyghton\n");
        x.format("%s%s%s","15 ","aubrey ","ken\n");
        x.format("%s%s%s","35 ","leu "," paskal\n");
        x.format("%s%s%s","50 ","thomas "," james ");


    }

    public void closeFile(){

        x.close();

    }


}
