package jasper.jasperreports.generalWorkflow;

import jasper.jasperreports.dataSource.BeanData;
import jasper.jasperreports.generateJasper.GenerateJasper;
import jasper.jasperreports.report.DesignReportWorkflow;
import jasper.jasperreports.report.ReportEdit;
import jasper.jasperreports.report.ReportExport;
import jasper.jasperreports.report.ReportImport;
import jasper.jasperreports.template.DesignTemplateWorkflow;
import jasper.jasperreports.template.TemplateEdit;
import jasper.jasperreports.template.TemplateExport;
import jasper.jasperreports.template.TemplateImport;
import jasper.jasperreports.utils.Consts;
import jasper.jasperreports.workflow.UsualWorkflow;

public class GeneralWorkflow extends UsualWorkflow {
    @Override
    protected void input() {
        DesignTemplateWorkflow workflow = new DesignTemplateWorkflow(
                new TemplateImport(Consts.jrxmlFileImport),
                new TemplateEdit(),
                new TemplateExport(Consts.jrxmlFileExport, "UTF-8"));


        workflow.runWorkflow();
    }

    @Override
    protected void edit() {
        GenerateJasper generateJasper = new GenerateJasper();
        generateJasper.generate();

    }

    @Override
    protected void output() {
        DesignReportWorkflow workflow = new DesignReportWorkflow(new ReportImport(new BeanData()),
                new ReportEdit(),
                new ReportExport());
        workflow.runWorkflow();

    }
}
