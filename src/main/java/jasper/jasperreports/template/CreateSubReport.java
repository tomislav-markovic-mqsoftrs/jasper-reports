package jasper.jasperreports.template;

import net.sf.jasperreports.engine.design.JRDesignBand;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignSubreport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.SplitTypeEnum;

public class CreateSubReport {
    public static JRDesignBand create(JasperDesign jasperDesign){

        //TODO trevba refaktorisati!!!!!!


        JRDesignBand band = new JRDesignBand();
        band.setHeight(250);
        band.setSplitType(SplitTypeEnum.STRETCH);
        JRDesignSubreport jSubreport = new JRDesignSubreport(jasperDesign);
        jSubreport.setUsingCache(false);
        jSubreport.setRemoveLineWhenBlank(true);
        jSubreport.setPrintRepeatedValues(false);
        JRDesignExpression expression = new JRDesignExpression();
        expression.setText("new net.sf.jasperreports.engine.data.JRBeanCollectionDataSource($F{time})");
        jSubreport.setDataSourceExpression(expression);expression = new JRDesignExpression();
        expression.setText("\"/path/to/sub.jasper\"");jSubreport.setExpression(expression);
        band.addElement(jSubreport);
        return band;
    }
}
