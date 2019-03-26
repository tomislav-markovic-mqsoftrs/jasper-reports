package jasper.jasperreports.template;

import jasper.jasperreports.dataSource.ClientDTO;
import jasper.jasperreports.utils.Functions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TemplateEdit {

    public JasperDesign edit(JasperDesign jasperDesign) {
        ClientDTO payer = new ClientDTO();
        Class test = payer.getClass();


        @Getter
        @AllArgsConstructor
        class JrdFieldBean {
            String name;
            String type;
        }

        Field[] fields = test.getDeclaredFields();
        List<JrdFieldBean> myFields = new ArrayList<>();

        for (Field field : fields) {
            myFields.add(new JrdFieldBean(field.getName(), Functions.fieldType(field.getType())));
        }
        int x = 0;
        int y = 0;
        int numb = 0;
        JRDesignBand columnHeader = new JRDesignBand();
        for (JrdFieldBean f : myFields) {

            System.out.println(f.getType());

            JRDesignStaticText staticText = new JRDesignStaticText();
            staticText.setText(f.getName());
            staticText.setWidth(100);
            staticText.setHeight(20);
            staticText.setX(x);
            staticText.setY(y);

            x += 120;

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
            x -=120;


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


        jasperDesign.setPageHeight(jasperDesign.getPageHeight() + columnHeader.getHeight() + 50);
        jasperDesign.setColumnHeader(columnHeader);


        System.out.println("edit design");


        return jasperDesign;
    }
}
