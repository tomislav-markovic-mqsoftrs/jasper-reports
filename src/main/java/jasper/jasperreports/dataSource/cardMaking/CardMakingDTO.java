package jasper.jasperreports.dataSource.cardMaking;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CardMakingDTO {

    private String NAME;
    private Double MONTHLY_AMOUNT;
    private boolean URGENT;
    private boolean RSD;
    private boolean EUR;
    private boolean USD;
    private boolean CHF;
    private boolean GBP;
    private boolean AUD;
    private boolean CAD;
    private boolean DKK;
    private boolean NOK;
    private boolean SEK;
}
