package jasper.jasperreports.dynamicJasper;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.core.layout.LayoutManager;
import ar.com.fdvs.dj.domain.DynamicReport;
import ar.com.fdvs.dj.util.SortUtils;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseDjReportTest {



    public JasperPrint jp;
    public JasperReport jr;
    public final Map<String, Object> params = new HashMap<String, Object>();
    public DynamicReport dr;

    public abstract DynamicReport buildReport() throws Exception;



    public LayoutManager getLayoutManager() {
        return new ClassicLayoutManager();
    }

    public void exportReport() throws Exception {
        exportToJRXML();
    }

    public void exportToJRXML() throws Exception {


        if (this.jr != null) {
            DynamicJasperHelper.generateJRXML(this.jr, "UTF-8", System.getProperty("user.dir") +   this.getClass().getSimpleName() + ".jrxml");

        } else {
            DynamicJasperHelper.generateJRXML(this.dr, this.getLayoutManager(), this.params, "UTF-8", System.getProperty("user.dir") +  this.getClass().getSimpleName() + ".jrxml");
        }
    }


    /**
     * @return JRDataSource
     */
    public JRDataSource getDataSource() {
        Collection dummyCollection = TestRepositoryProducts.getDummyCollection();
        dummyCollection = SortUtils.sortCollection(dummyCollection, dr.getColumns());

        //here contains dummy hardcoded objects...
        return new JRBeanCollectionDataSource(dummyCollection);
    }

    public Collection getDummyCollectionSorted(List columnlist) {
        Collection dummyCollection = TestRepositoryProducts.getDummyCollection();
        return SortUtils.sortCollection(dummyCollection, columnlist);

    }

    public DynamicReport getDynamicReport() {
        return dr;
    }



    public int getYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}