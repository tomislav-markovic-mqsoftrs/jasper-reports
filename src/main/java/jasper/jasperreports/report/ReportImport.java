package jasper.jasperreports.report;


import jasper.jasperreports.dataSource.accounts.AccountDTO;
import jasper.jasperreports.dataSource.accounts.ChosenAccountsResponse;
import jasper.jasperreports.dataSource.dataFactory.DataFactoryDTO;
import jasper.jasperreports.dataSource.dataFactory.DataFactoryResponse;
import jasper.jasperreports.dataSource.parameters.ParametersData;
import jasper.jasperreports.dataSource.primaryDataSource.ClientResponce;
import jasper.jasperreports.utils.Consts;
import lombok.Getter;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRXmlDataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

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




        /* Convert List to JRBeanCollectionDataSource */
//        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(new DataFactoryResponse().getAll());
//        List<Tomica> dataTomica = new ArrayList<>(Arrays.asList(new Tomica()));
//        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(dataTomica);
        JasperPrint jasperPrint = new JasperPrint();

        try {

            JRXmlDataSource dataSource = new JRXmlDataSource("/home/toma/Toma/workspace/jasper-reports/reports/dataBase.xml", "/response/client");


//            JRXmlDataSource dataSource = new JRXmlDataSource("/home/toma/Toma/workspace/jasper-reports/reports/dataBase.xml");
            /* Using compiled version(.jasper) of Jasper report to generate PDF */
            jasperPrint = JasperFillManager.fillReport(Consts.jasperFile, new HashMap<>(), dataSource);
        } catch (JRException e) {
            e.printStackTrace();
        }

        return jasperPrint;
    }
}
