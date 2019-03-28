package jasper.jasperreports.dataSource.cardMaking;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CardMakingDTO {
    private String name;
    private Long price;
    private boolean emergency;
}
