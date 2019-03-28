package jasper.jasperreports.dataSource.anouncment;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AnnouncementDTO {
    private String name;
    private boolean excerpt;
    private boolean commercialMessages;
}
