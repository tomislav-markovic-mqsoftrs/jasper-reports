package jasper.jasperreports.report;



import jasper.jasperreports.dataSource.parameters.ParametersData;
import jasper.jasperreports.dataSource.primaryDataSource.ClientResponce;

import java.util.ArrayList;
import java.util.Collection;


public class ReportConfiguration {


    public ReportImport reportImport(){

        return new ReportImport(
                new ClientResponce().getFromID(),
                new ParametersData());
    }

    public ReportEdit reportEdit(){
        return new ReportEdit();
    }


    public ReportExport reportExport(){
        return new ReportExport();
    }

}
