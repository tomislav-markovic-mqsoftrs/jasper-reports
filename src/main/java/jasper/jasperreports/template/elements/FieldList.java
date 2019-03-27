package jasper.jasperreports.template.elements;

import jasper.jasperreports.utils.Functions;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FieldList {


    public static List<JrdFieldBean> getAll(Field[] fields){
        List<JrdFieldBean> myFields = new ArrayList<>();
        for (Field field : fields) {
            myFields.add(new JrdFieldBean(field.getName(), Functions.fieldType(field.getType())));
        }
        return myFields;
    }
}
