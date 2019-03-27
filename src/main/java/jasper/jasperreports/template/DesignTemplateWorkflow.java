package jasper.jasperreports.template;

import jasper.jasperreports.workflow.UsualWorkflow;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.design.JasperDesign;


@Getter
@Setter
public class DesignTemplateWorkflow extends UsualWorkflow {
    private TemplateConfiguration templateConfiguration;

    private TemplateImport myTemplateImport;
    private TemplateEdit myTemplateEdit;
    private TemplateExport myTemplateExport;
    private JasperDesign jasperDesign;

    public DesignTemplateWorkflow(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        myTemplateImport = templateConfiguration.tempImport();
        myTemplateEdit = templateConfiguration.tempEdit();
        myTemplateExport = templateConfiguration.tempExport();
    }

    @Override
    protected void input() {
        JasperDesign myDesign = myTemplateImport.importJasperDesign();
        setJasperDesign(myDesign);
    }

    @Override
    protected void edit() {
        setJasperDesign(myTemplateEdit.edit(jasperDesign));
    }

    @Override
    protected void output() {
        myTemplateExport.templateExportToFile(jasperDesign);

    }
}
