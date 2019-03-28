package jasper.jasperreports.report;


import jasper.jasperreports.dataSource.parameters.ParametersData;
import jasper.jasperreports.dataSource.primaryDataSource.ClientResponce;
import jasper.jasperreports.utils.Consts;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ReportImport {

    private List getAll;

    private Object data;
    private ParametersData parametersData;

    public ReportImport(Object data, ParametersData parametersData) {
        this.getAll = new ClientResponce().getAll();
        this.data = data;
        this.parametersData = parametersData;
    }

    public JasperPrint importPrint(){
        Collection<Object> collection = new ArrayList<>(Arrays.asList(data));
        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource( getAll );

        JasperPrint jasperPrint = new JasperPrint();

        try {
            /* Using compiled version(.jasper) of Jasper report to generate PDF */
            jasperPrint = JasperFillManager.fillReport(Consts.jasperFile, parametersData.mapParameters(), itemsJRBean);
        } catch (JRException e) {
            e.printStackTrace();
        }

        return jasperPrint;
    }
}
