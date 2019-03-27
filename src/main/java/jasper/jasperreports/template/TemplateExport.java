package jasper.jasperreports.template;

import lombok.NoArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


public class TemplateExport {
    String filePath;
    String encoding;

    public TemplateExport(){

    }

    public TemplateExport(String filePath){
        this(filePath, "UTF-8");
    }

    public TemplateExport(String filePath, String encoding) {
        this.filePath = filePath;
        this.encoding = encoding;
    }

    public void templateExportToFile(JasperDesign jasperDesign){
        if(filePath == null){
            System.out.println("Nothing is genereted to file");
            return;
        }

        try {
            System.out.println("output design");
            JRXmlWriter.writeReport(jasperDesign, filePath, encoding);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
