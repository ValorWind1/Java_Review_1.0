package intermidiate_Java.io_files_streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_out_stream {
    public static void main(String[] args) throws IOException {
        /**
         * FILE OUTPUT
         */

        File outFilenani = new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\io_files_streams\\file_out_stream.txt");

        //opening the stream
        FileOutputStream outStream = new FileOutputStream(outFilenani);

        // saving array to file
        byte [] byteArray = {10,20,30,40,50,60,70,80};

        // writing the data to the stream
        outStream.write(byteArray);

        // output done, so close the stream
        outStream.close();





    }
}
