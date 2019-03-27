package jasper.jasperreports.template;

import jasper.jasperreports.dataSource.other.PrimaryClient;
import jasper.jasperreports.template.elements.FieldList;
import jasper.jasperreports.template.elements.JrdFieldBean;
import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.*;

import java.lang.reflect.Field;
import java.util.List;

public class TemplateEdit {


    private JRDesignStaticText designStaticText(String text, int width, int height, int x, int y) {
        JRDesignStaticText staticText = new JRDesignStaticText();
        staticText.setText(text);
        staticText.setWidth(width);
        staticText.setHeight(height);
        staticText.setX(x);
        staticText.setY(y);

        return staticText;
    }

    private JRDesignParameter designParameter(String name, String type) {
        JRDesignParameter parameter = new JRDesignParameter();
        parameter.setName(name);
        parameter.setValueClassName(type);
        return parameter;
    }

    private JRDesignExpression designExpression(String name) {
        JRDesignExpression expression = new JRDesignExpression();
        expression.addFieldChunk(name);
        return expression;
    }

    private JRDesignTextField designTextField(JRDesignExpression expression, int width, int height, int x, int y) {
        JRDesignTextField textField = new JRDesignTextField();
        textField.setWidth(width);
        textField.setHeight(height);
        textField.setX(x);
        textField.setY(y);
        return textField;
    }

    private JRDesignField designField(String name, String type) {
        JRDesignField field = new JRDesignField();
        field.setName(name);
        field.setValueClassName(type);
        return field;
    }


    public JRDesignBand designFieldsBand(JRBand designBand, Field[] fields, int fieldsHeight, int fieldsWidth, int spaceBetweanFields, int fieldsInRow, JasperDesign jasperDesign) {
        JRDesignBand band = designBand == null ? new JRDesignBand() : (JRDesignBand) designBand;
        int startY = band.getHeight();
        int bandHeight = band.getHeight() + spaceBetweanFields + (fieldsHeight + spaceBetweanFields) * fieldsInRow;
        band.setHeight(bandHeight);

        List<JrdFieldBean> myFields = FieldList.getAll(fields);


        int x = 0;
        int y = startY;
        int row = 0;

        for (JrdFieldBean f : myFields) {
            JRDesignStaticText staticText = designStaticText(f.getName(), fieldsWidth, fieldsHeight, x, y);
            JRDesignExpression expression = designExpression(f.getName());
            x += fieldsWidth + spaceBetweanFields;
            JRDesignTextField textField = designTextField(expression, fieldsWidth, fieldsHeight, x, y);
            JRDesignField field = designField(f.getName(), f.getType());
            x-=fieldsWidth + spaceBetweanFields;
            band.addElement(staticText);
            band.addElement(textField);
            y += 2 * spaceBetweanFields;
            row +=1;
            if(row == fieldsInRow){
                y = startY;
                x +=2 * (fieldsWidth + spaceBetweanFields) + spaceBetweanFields;
            }



            try {
                jasperDesign.addField(field);
            } catch (JRException e) {
                e.printStackTrace();
            }
        }


        return band;
    }


    public JasperDesign edit(JasperDesign jasperDesign) {
        PrimaryClient payer = new PrimaryClient();
        Class test = payer.getClass();

        JRDesignBand band = designFieldsBand(jasperDesign.getColumnHeader(), test.getDeclaredFields(), 20, 100, 20, 5, jasperDesign);


        jasperDesign.setPageHeight(jasperDesign.getPageHeight() + band.getHeight() + 50);
        jasperDesign.setColumnHeader(band);


        System.out.println("edit design");


        return jasperDesign;
    }
}
