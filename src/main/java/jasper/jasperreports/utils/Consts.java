package jasper.jasperreports.utils;

public class Consts {
    private static String sysString = System.getProperty("user.home");
    private static String folderPath = "/Toma/workspace/jasper-reports/reports/";
    private static String path = sysString + folderPath;
    private static String generatePath(String string){
        return path + string;
    }


    public static String jrxmlFileImport = generatePath("zahtev1.jrxml");
    public static String jrxmlFileExport = generatePath("zahtev.jrxml");

    public static String jasperFile = generatePath("test1.jasper");

    public static String pdfFile = generatePath("test1.pdf");


}
