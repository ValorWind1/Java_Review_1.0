package intermidiate_Java.io_files_streams;

import java.io.*;

public class High_level_io {
    public static void main(String[] args) throws IOException {

        // writing
        // output
        File outFile = new File("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\io_files_streams\\high.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        DataOutputStream outDataStream = new DataOutputStream(outFileStream);

        outDataStream.writeBoolean(true);
        outDataStream.writeInt(5);
        outDataStream.writeDouble(5.4);
        outDataStream.writeChar('7');


        // reading
        // input

        DataInputStream din = new DataInputStream(new FileInputStream("C:\\Users\\skyjd\\IdeaProjects\\Java_Review\\src\\intermidiate_Java\\io_files_streams\\high.data"));
        Boolean a = din.readBoolean();
        int b = din.readInt();
        double c=din.readDouble();
        char d =din.readChar();
        System.out.println("Values: "+a+" "+b+" "+c+" "+d);


    }
}
