package jasper.jasperreports.generateJasper;

import jasper.jasperreports.utils.Consts;
import jasper.jasperreports.utils.Dependencies;
import jasper.jasperreports.utils.DependenciesDTO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class GenerateJasper {
    public void generateDependencies(){
        for(DependenciesDTO d: new Dependencies().allSubReportsToJasper()) {
            try {
                JasperCompileManager.compileReportToFile(
                        d.getJrxml(), // the path to the jrxml file to compile
                        d.getJasper()); // the path and name we want to save the compiled file to
            } catch (JRException e) {
                e.printStackTrace();
            }
        }




    }

    public void generate(){
        generateDependencies();
        try {
            JasperCompileManager.compileReportToFile(
                    Consts.jrxmlFileExport, // the path to the jrxml file to compile
                    Consts.jasperFile); // the path and name we want to save the compiled file to
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
