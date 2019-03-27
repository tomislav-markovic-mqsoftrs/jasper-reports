package jasper.jasperreports.report;

import jasper.jasperreports.workflow.UsualWorkflow;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.JasperPrint;


@Getter
@Setter
public class DesignReportWorkflow extends UsualWorkflow {
    private ReportConfiguration reportConfiguration;
    private ReportImport myReportImport;
    private ReportEdit myReportEdit;
    private ReportExport myReportExport;

    private JasperPrint jasperPrint;

    public DesignReportWorkflow(ReportConfiguration reportConfiguration) {
        this.reportConfiguration = reportConfiguration;
        this.myReportImport = reportConfiguration.reportImport();
        this.myReportEdit = reportConfiguration.reportEdit();
        this.myReportExport = reportConfiguration.reportExport();
    }

    @Override
    protected void input() {
        setJasperPrint(myReportImport.importPrint());
    }

    @Override
    protected void edit() {
        System.out.println("Doing nothing!");

    }

    @Override
    protected void output() {
        myReportExport.exportReport(getJasperPrint());
    }
}
