package jasper.jasperreports.dataSource.parameters;


import jasper.jasperreports.dataSource.anouncment.AnnouncementDTO;
import jasper.jasperreports.dataSource.anouncment.AnnouncementResponse;
import jasper.jasperreports.dataSource.cardMaking.CardMakingDTO;
import jasper.jasperreports.dataSource.cardMaking.CardMakingResponce;
import jasper.jasperreports.dataSource.primaryDataSource.ClientDTO;
import jasper.jasperreports.dataSource.primaryDataSource.ClientResponce;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParametersData {

    public Map<String, Object> mapParameters(){
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(ParametersEnum.REPORT_TITLE.name(), "ZAHTEV ZA KORIŠĆENJE/IZMENU RAČUNA/PAKET RAČUNA");


        /* List to hold Items */
        List<ClientDTO> clientDTOS = new ClientResponce().getAll();
        List<AnnouncementDTO> announcementDTOS = new AnnouncementResponse().getAll();
        List<CardMakingDTO> cardMakingDTOS = new CardMakingResponce().getAll();

    parameters.put(ParametersEnum.CLIENT.name(), clientDTOS);
        parameters.put(ParametersEnum.ADDITIONAL_TABLE.name(), clientDTOS );
        parameters.put(ParametersEnum.CARD_MAKING.name(), new JRBeanCollectionDataSource(cardMakingDTOS));
        parameters.put(ParametersEnum.ANNOUNCEMENTS.name(), new JRBeanCollectionDataSource(announcementDTOS));


        return parameters;
    }
}
