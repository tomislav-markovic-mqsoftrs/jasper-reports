package jasper.jasperreports.report;

import jasper.jasperreports.workflow.UsualWorkflow;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.JasperPrint;


@Getter
@Setter
public class DesignReportWorkflow extends UsualWorkflow {
    private ReportImport myReportImport;
    private ReportEdit myReportEdit;
    private ReportExport myReportExport;

    private JasperPrint jasperPrint;

    public DesignReportWorkflow(ReportImport myReportImport, ReportEdit myReportEdit, ReportExport myReportExport) {
        this.myReportImport = myReportImport;
        this.myReportEdit = myReportEdit;
        this.myReportExport = myReportExport;
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
