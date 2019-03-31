package jasper.jasperreports.dataSource.accounts;


import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class AccountDTO {
    private String NAME;
    private Double MONTHLY_AMOUNT;
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
