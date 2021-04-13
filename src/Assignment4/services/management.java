package Assignment4.services;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class management {

    public management() {
    }

    public boolean fileWriter(String path, String content) throws Exception {
        if (path != null) {
            try (FileWriter fw = new FileWriter(path);) {
                fw.write(content);
                return true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }

    public String fileReader(String path) throws IOException {
        if (path != null) {
            try (FileReader fr = new FileReader(path)) {
                int i;
                StringBuilder content = new StringBuilder();
                while ((i = fr.read()) != -1) {
                    content.append(((char) i));
                }
                ;
                return content.toString();
            } catch (Exception ex) {
                return ex.getMessage();
            }
        } else {
            return "Please input path!";
        }
    }
}