package jasper.jasperreports.utils;



public class Consts {
    private static String sysString = System.getProperty("user.home");
    private static String folderPath = "/Toma/workspace/jasper-reports/reports/";
    private static String path = sysString + folderPath;
    public static String jrxmlFileImport = generatePath("zahtev1.jrxml");
    public static String jrxmlFileExport = generatePath("package_account.jrxml");;

    public static String jasperFile = generatePath("package_account.jasper");
    public static String pdfFile = generatePath("test1.pdf");

    public static String generatePath(String string) {
        return path + string;
    }




}
