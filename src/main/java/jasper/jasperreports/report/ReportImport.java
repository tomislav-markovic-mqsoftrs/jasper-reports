package jasper.jasperreports.report;

import jasper.jasperreports.dataSource.BeanData;
import jasper.jasperreports.dataSource.parameters.ParametersData;
import jasper.jasperreports.utils.Consts;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReportImport {

    private BeanData beanData;
    private ParametersData parametersData;

    public ReportImport(BeanData beanData, ParametersData parametersData) {
        this.beanData = beanData;
        this.parametersData = parametersData;
    }

    public JasperPrint importPrint(){


        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource( beanData.createData() );




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
