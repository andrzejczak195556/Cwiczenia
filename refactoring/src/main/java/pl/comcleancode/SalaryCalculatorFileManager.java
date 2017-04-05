package pl.comcleancode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by miszel on 3/22/17.
 */
public class SalaryCalculatorFileManager implements FileManager {
    @Override
    public void writeToFile(String fileName, String fileContents) throws IOException {
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);

        try{
            fw.write(fileContents);
        }finally {
            fw.close();
        }

    }
}
