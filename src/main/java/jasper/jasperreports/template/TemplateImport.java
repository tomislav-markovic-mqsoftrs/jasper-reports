package jasper.jasperreports.template;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import java.io.File;
import java.lang.reflect.Field;

@NoArgsConstructor
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
        File file = new File(filePath);
        if(!file.isFile()){
            System.out.println("Create new Jasper Design");
            JasperDesign jasperDesign = new JasperDesign();
            JRDesignQuery query = new JRDesignQuery();



            jasperDesign.setName("test1");
            jasperDesign.setQuery(query);
            return jasperDesign;
        }
        System.out.println("input design from file");
        return importJrxmlFile();
    }
}
