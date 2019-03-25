package jasper.jasperreports.generateJasper;

import jasper.jasperreports.utils.Consts;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class GenerateJasper {
    public void generate(){
        try {
            JasperCompileManager.compileReportToFile(
                    Consts.jrxmlFileExport, // the path to the jrxml file to compile
                    Consts.jasperFile); // the path and name we want to save the compiled file to
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
