package intermidiate_Java.io_files_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class file_input_stream {
    public static void main(String[] args) throws IOException {


        File inFile = new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\io_files_streams\\try1.txt");

        // setting up stream
        FileInputStream inStream = new FileInputStream(inFile);


        // setting up the array that we will read data from
        int filesize = (int)inFile.length();
        byte[] byteArray = new byte[filesize];

        // read data in and display them
        inStream.read(byteArray);
        for(int i = 0 ; i < filesize;i++){
            System.out.println(byteArray[i]);
        }
        inStream.close();
    }
}
