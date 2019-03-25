package jasper.jasperreports.report;

import jasper.jasperreports.utils.Consts;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ReportExport {

    public void exportReport(JasperPrint jasperPrint) {

        try {
            /* outputStream to create PDF */
            OutputStream outputStream = new FileOutputStream(new File(Consts.pdfFile));
            /* Write content to PDF file */
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

            System.out.println("File Generated");
        } catch (JRException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
