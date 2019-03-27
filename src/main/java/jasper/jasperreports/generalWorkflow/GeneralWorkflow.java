package jasper.jasperreports.generalWorkflow;

import jasper.jasperreports.generateJasper.GenerateJasper;
import jasper.jasperreports.report.*;
import jasper.jasperreports.template.*;
import jasper.jasperreports.utils.Consts;
import jasper.jasperreports.workflow.UsualWorkflow;

public class GeneralWorkflow extends UsualWorkflow {
    @Override
    protected void input() {
        TemplateConfiguration config = new TemplateConfiguration(
                Consts.jrxmlFileImport,
                Consts.jrxmlFileExport,
                "UTF-8");

        DesignTemplateWorkflow workflow = new DesignTemplateWorkflow(config);

        workflow.runWorkflow();
    }

    @Override
    protected void edit() {
        GenerateJasper generateJasper = new GenerateJasper();
        generateJasper.generate();

    }

    @Override
    protected void output() {
        ReportConfiguration config = new ReportConfiguration();

        DesignReportWorkflow workflow = new DesignReportWorkflow(config);

        workflow.runWorkflow();

    }
}
