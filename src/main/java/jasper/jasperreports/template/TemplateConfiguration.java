package jasper.jasperreports.template;


import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;


@AllArgsConstructor
public class TemplateConfiguration {
    private String importFilePath;
    private String exportFilePath;
    private String encoding;


    public TemplateImport tempImport(){
        return new TemplateImport(importFilePath);
    };

    public TemplateEdit tempEdit(){
        return new TemplateEdit();
    };

    public TemplateExport tempExport(){
        return new TemplateExport(exportFilePath, encoding);
    };



}
