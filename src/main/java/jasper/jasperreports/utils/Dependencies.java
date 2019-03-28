package jasper.jasperreports.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Dependencies {
    public  String clientJrxml = Consts.generatePath("client.jrxml");
    public String clientJasper = Consts.generatePath("client.jasper");
    public  String cardMarkingJrxml = Consts.generatePath("card_making.jrxml");
    public  String cardMarkingJasper = Consts.generatePath("card_making.jasper");



    public  List<DependenciesDTO> allSubReportsToJasper() {
        List<DependenciesDTO> dependenciesList = new ArrayList<>();
        dependenciesList.add(new DependenciesDTO(clientJrxml, clientJasper));
        dependenciesList.add(new DependenciesDTO(cardMarkingJrxml, cardMarkingJasper));
        return dependenciesList;

    }
}
