package jasper.jasperreports.template;

import lombok.AllArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@AllArgsConstructor
public class TemplateImport {
    String filePath;


    private JasperDesign importJrxmlFile(){
        try {
            return JRXmlLoader.load(filePath);
        } catch (JRException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JasperDesign importJasperDesign() {
        if(filePath == null){
            System.out.println("Create new Jasper Design");
            return new JasperDesign();
        }
        System.out.println("input design from file");
        return importJrxmlFile();
    }
}
