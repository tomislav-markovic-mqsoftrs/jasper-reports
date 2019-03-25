package jasper.jasperreports.beans;

import jasper.jasperreports.utils.Consts;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public void runTest(){

        try {

            JasperCompileManager.compileReportToFile(
                    Consts.jrxmlFileExport, // the path to the jrxml file to compile
                    Consts.jasperFile); // the path and name we want to save the compiled file to


//            /* User home directory location */
//            String userHomeDirectory = System.getProperty("user.home");
//            /* Output file location */
//            String outputFile = userHomeDirectory + File.separatorChar + "JasperTableExample.pdf";

            /* List to hold Items */
            List<TestBeanPayer> listItems = new ArrayList<TestBeanPayer>();

            /* Create Items */
            TestBeanPayer payer = new TestBeanPayer("Pera",
                    "121112212",
                    "31322133",
                    "param",
                    "313231312",
                    "2131313",
                    "Beograd",
                    "Beogradska 32");

            listItems.add(payer);

            /* Convert List to JRBeanCollectionDataSource */
            JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);

            /* Map to hold Jasper report Parameters */
            Map<String, Object> parameters = new HashMap<String, Object>();


            /* Using compiled version(.jasper) of Jasper report to generate PDF */
            JasperPrint jasperPrint = JasperFillManager.fillReport(Consts.jasperFile, parameters, itemsJRBean);

            /* outputStream to create PDF */
            OutputStream outputStream = new FileOutputStream(new File(Consts.pdfFile));
            /* Write content to PDF file */
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

            System.out.println("File Generated");
        } catch (JRException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }




    }
}
