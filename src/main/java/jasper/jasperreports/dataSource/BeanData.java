package jasper.jasperreports.dataSource;

import java.util.ArrayList;
import java.util.List;

public class BeanData {

    public List<Object> createData() {
        List<Object> listItems = new ArrayList<>();
        ClientDTO payer = new ClientDTO();

        listItems.add(payer);

        return listItems;
    }
}
