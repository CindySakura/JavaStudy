package test_File;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File f1 = new File("test_File/a.txt");
        boolean atxt = f1.createNewFile();
        System.out.println(atxt);
    }

}
