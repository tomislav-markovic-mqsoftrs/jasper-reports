package jasper.jasperreports.dataSource.parameters;


import jasper.jasperreports.dataSource.additionalTable.AdditionalTableDTO;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParametersData {

    public Map<String, Object> mapParameters(){
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(ParametersEnum.REPORT_TITLE.name(), "ZAHTEV ZA KORIŠĆENJE/IZMENU RAČUNA/PAKET RAČUNA");


        /* List to hold Items */
        List<AdditionalTableDTO> listItems = new ArrayList<>();
        listItems.add(new AdditionalTableDTO("Slavisa", "Pivo"));

        parameters.put(ParametersEnum.ADDITIONAL_TABLE.name(), listItems);

        return parameters;
    }
}
