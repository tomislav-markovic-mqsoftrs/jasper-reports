package jasper.jasperreports.dataSource.anouncment;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementResponse {
    public List<AnnouncementDTO> getAll(){
        List<AnnouncementDTO> announcementResponseList = new ArrayList<>();

        announcementResponseList.add(new AnnouncementDTO("Pismom na adresu", true, true));
        announcementResponseList.add(new AnnouncementDTO("SMS", true, true));
        announcementResponseList.add(new AnnouncementDTO("E-mail", false, true));
        announcementResponseList.add(new AnnouncementDTO("Agent prodaje", false, true));
        announcementResponseList.add(new AnnouncementDTO("Kontakt centar", false, true));
        announcementResponseList.add(new AnnouncementDTO("Online banka", true, true));
        announcementResponseList.add(new AnnouncementDTO("Drustvene mreze", false, true));



        return announcementResponseList;
    }
}
