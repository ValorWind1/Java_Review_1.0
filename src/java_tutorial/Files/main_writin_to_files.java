package java_tutorial.Files;

public class main_writin_to_files {
    public static void main(String[] args) {

        writin_to_files cf = new writin_to_files();
        cf.openFile();
        cf.addRecords();
        cf.closeFile();

    }
}
