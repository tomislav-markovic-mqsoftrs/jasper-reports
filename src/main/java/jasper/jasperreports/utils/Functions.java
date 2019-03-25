package jasper.jasperreports.utils;

import java.io.File;

public class Functions {
    public static String fileNaming(String filePath) {
        File file = new File(filePath);
        if (file.isFile()) {
            filePath = filePath + "1";

        }
        return filePath;
    }


}
