package jasper.jasperreports.dataSource.parameters;


import java.util.HashMap;
import java.util.Map;

public class ParametersData {

    public Map<String, Object> mapParameters(){
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(ParametersEnum.REPORT_TITLE.name(), "ZAHTEV ZA KORIŠĆENJE/IZMENU RAČUNA/PAKET RAČUNA");

        return parameters;
    }
}
