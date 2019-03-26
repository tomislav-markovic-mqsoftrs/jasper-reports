package jasper.jasperreports.dataSource.parameters;

import java.util.ArrayList;
import java.util.List;

public class ParametersTemplate {
    public List<ParametersEntity> all() {
        List<ParametersEntity> paramList = new ArrayList<>();
        paramList.add(new ParametersEntity(ParametersEnum.REPORT_TITLE.name(), "java.lang.String"));
        return paramList;
    }
}
