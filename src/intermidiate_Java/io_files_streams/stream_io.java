package intermidiate_Java.io_files_streams;


import java.io.*;
import java.net.URL;

public class stream_io {

    // java file class doesn't represent the file it represent the path

    public static void main(String[] args) throws IOException  {

        File path = new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\io_files_streams\\hello.txt");
        System.out.println("we got a file : "+ path );

        System.out.println("does it exists ? "+path.exists());
        System.out.println("is it a directory : ? "+path.isDirectory());

        // stream is a pipe basically,input and output
        // input = read pipes
        // output = output pipes
        // streams are limited , inputstreams : lets you read one byte out of time
        // so we use bufferreader

        /**
         * create file
         */
//        String contentsToWrite = "Hello World";
//        OutputStream outStream = new FileOutputStream(path);
//        outStream.write(contentsToWrite.getBytes());
//        outStream.close();

        /**
         * read file
         */
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
//        String firstLine = br.readLine();
//        br.close();
//        System.out.println("Read a line: "+firstLine);


        /**
         * open url an optain outputstream and read it one byte out of time
         */
        URL url = new URL("http://www.gutenberg.org/cache/epub/2265/pg2265.txt");
        InputStream stream = url.openStream();
        //bufferreader that wil lread from the internet
        BufferedReader br1 = new BufferedReader(new InputStreamReader(stream));
        String line = br1.readLine();
        while (line != null){
            System.out.println(line);
            line = br1.readLine();

        }
        System.out.println("Done reading");

    }
}
