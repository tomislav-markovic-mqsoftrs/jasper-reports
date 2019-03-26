package jasper.jasperreports.template;

import jasper.jasperreports.workflow.UsualWorkflow;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.design.JasperDesign;


@Getter
@Setter
public class DesignTemplateWorkflow extends UsualWorkflow {
    private TemplateImport myTemplateImport;
    private TemplateEdit myTemplateEdit;
    private TemplateExport myTemplateExport;
    private JasperDesign jasperDesign;

    public DesignTemplateWorkflow(TemplateImport templateImport, TemplateEdit templateEdit, TemplateExport templateExport) {
        myTemplateImport = templateImport;
        myTemplateEdit = templateEdit;
        myTemplateExport = templateExport;
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
