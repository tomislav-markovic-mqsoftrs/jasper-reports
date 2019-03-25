package jasper.jasperreports.report;

import jasper.jasperreports.beans.TestBeanPayer;
import jasper.jasperreports.dataSource.BeanData;
import jasper.jasperreports.utils.Consts;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportImport {

    private BeanData beanData;

    public ReportImport(BeanData beanData) {
        this.beanData = beanData;
    }

    public JasperPrint importPrint(){


        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource( beanData.createData() );

        /* Map to hold Jasper report Parameters */
        Map<String, Object> parameters = new HashMap<String, Object>();
        JasperPrint jasperPrint = new JasperPrint();


        try {
            /* Using compiled version(.jasper) of Jasper report to generate PDF */
            jasperPrint = JasperFillManager.fillReport(Consts.jasperFile, parameters, itemsJRBean);
        } catch (JRException e) {
            e.printStackTrace();
        }

        return jasperPrint;
    }
}
