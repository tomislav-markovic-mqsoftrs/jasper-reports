package jasper.jasperreports.report;

import jasper.jasperreports.beans.TestBeanPayer;
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



    public JasperPrint importPrint(){
        /* List to hold Items */
        List<TestBeanPayer> listItems = new ArrayList<TestBeanPayer>();

        /* Create Items */
        TestBeanPayer payer = new TestBeanPayer("Pera",
                "121112212",
                "31322133",
                "param",
                "313231312",
                "2131313",
                "Beograd",
                "Beogradska 32");

        listItems.add(payer);

        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);

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
