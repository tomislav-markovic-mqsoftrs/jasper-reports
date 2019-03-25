package jasper.jasperreports.dataSource;

import jasper.jasperreports.beans.TestBeanPayer;

import java.util.ArrayList;
import java.util.List;

public class BeanData {

    public List<Object> createData() {
        List<Object> listItems = new ArrayList<>();
        TestBeanPayer payer = new TestBeanPayer(12l,
                true,
                12l,
                "Komerc",
                "21",
                "22",
                "param",
                "payroll",
                "charges",
                "Beograd",
                "Ulica");

        TestBeanPayer payer1 = new TestBeanPayer(32l,
                false,
                32l,
                "Tomica",
                "111",
                "4343",
                "paramica",
                "roll",
                "ges",
                "Novi sad",
                "Ulicica");

        listItems.add(payer);
        listItems.add(payer1);
        return listItems;
    }
}
