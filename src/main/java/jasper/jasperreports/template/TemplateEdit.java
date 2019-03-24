package jasper.jasperreports.template;

import jasper.jasperreports.beans.TestBeanPayer;
import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplateEdit {

    public JasperDesign edit(JasperDesign jasperDesign){
        TestBeanPayer payer = new TestBeanPayer("Pera",
                "121112212",
                "31322133",
                "param",
                "313231312",
                "2131313",
                "Beograd",
                "Beogradska 32");


        Class test = payer.getClass();
        Field[] fields = test.getDeclaredFields();
        List<List<String>> myFields = new ArrayList<>();


        for(Field field : fields){
            myFields.add(new ArrayList<String>(Arrays.asList(field.getName(), "java.lang.String")));
        }


        int x = 0;
        int y = 0;
        JRDesignBand columnHeader = new JRDesignBand();
        for(List<String> f: myFields){
            JRDesignStaticText staticText = new JRDesignStaticText();
            staticText.setText(f.get(0));
            staticText.setWidth(100);
            staticText.setHeight(20);
            staticText.setX(x);
            staticText.setY(y);

            x+=120;

            JRDesignParameter parameter = new JRDesignParameter();
            parameter.setName(f.get(0));
            parameter.setValueClassName(f.get(1));

            JRDesignExpression expression = new JRDesignExpression();
            expression.addFieldChunk(f.get(0) );

            JRDesignTextField field = new JRDesignTextField();

            field.setExpression(expression);
            field.setWidth(100);
            field.setHeight(20);
            field.setX(x);
            field.setY(y);



            y += 25;
            x = 0;

            columnHeader.addElement(staticText);
            columnHeader.addElement(field);

            JRDesignField fil = new JRDesignField();
            fil.setValueClassName(f.get(1));
            fil.setName(f.get(0));

            try {
                jasperDesign.addField(fil);
            } catch (JRException e) {
                e.printStackTrace();
            }

        }

        columnHeader.setHeight(columnHeader.getHeight() + y + 20);



////
////        ///SAMO TEst
////        JRBand pageHeader = (JRDesignBand) jasperDesign.getPageHeader();
////        JRDesignStaticText title = new JRDesignStaticText();
////        title.setText("NASLOVVVVV");
////        title.setX(150);
////        title.setY(0);
////        title.setHeight(50);
////        title.setWidth(100);
////        ((JRDesignBand) pageHeader).addElement(title);
////
////        jasperDesign.setColumnHeader(pageHeader);


        jasperDesign.setPageHeight(jasperDesign.getPageHeight() + columnHeader.getHeight() + 50);
        jasperDesign.setColumnHeader(columnHeader);


        System.out.println("edit design");



        return jasperDesign;
    }
}
