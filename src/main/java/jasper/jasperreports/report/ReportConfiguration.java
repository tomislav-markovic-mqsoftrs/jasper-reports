package jasper.jasperreports.report;


import jasper.jasperreports.dataSource.BeanData;
import jasper.jasperreports.dataSource.parameters.ParametersData;



public class ReportConfiguration {


    public ReportImport reportImport(){
        return new ReportImport(new BeanData(), new ParametersData());
    }

    public ReportEdit reportEdit(){
        return new ReportEdit();
    }


    public ReportExport reportExport(){
        return new ReportExport();
    }

}
