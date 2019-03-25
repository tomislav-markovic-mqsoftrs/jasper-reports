package jasper.jasperreports.template;

import jasper.jasperreports.beans.TestBeanPayer;
import jasper.jasperreports.utils.Functions;
import jasper.jasperreports.utils.JrdFieldBean;
import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplateEdit {

    public JasperDesign edit(JasperDesign jasperDesign){
        TestBeanPayer payer = new TestBeanPayer();


        Class test = payer.getClass();
        Field[] fields = test.getDeclaredFields();
        List<JrdFieldBean> myFields = new ArrayList<>();


        for(Field field : fields){



            myFields.add(new JrdFieldBean(field.getName(), Functions.fieldType(field.getType())));

        }


        int x = 0;
        int y = 0;
        JRDesignBand columnHeader = new JRDesignBand();
        for(JrdFieldBean f: myFields){


            System.out.println(f.getType());


            JRDesignStaticText staticText = new JRDesignStaticText();
            staticText.setText(f.getName());
            staticText.setWidth(100);
            staticText.setHeight(20);
            staticText.setX(x);
            staticText.setY(y);

            x+=120;

            JRDesignParameter parameter = new JRDesignParameter();
            parameter.setName(f.getName());
            parameter.setValueClassName(f.getType());

            JRDesignExpression expression = new JRDesignExpression();
            expression.addFieldChunk(f.getName());

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
            fil.setValueClassName(f.getType());
            fil.setName(f.getName());

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
