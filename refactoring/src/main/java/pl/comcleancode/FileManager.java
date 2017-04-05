package pl.comcleancode;

import java.io.IOException;

/**
 * Created by miszel on 3/22/17.
 */
public interface FileManager {
    void writeToFile(String fileName, String fileContents) throws IOException;

}
