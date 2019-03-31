package jasper.jasperreports.dataSource.dataFactory;

import jasper.jasperreports.dataSource.accounts.AccountDTO;
import jasper.jasperreports.dataSource.cardMaking.CardMakingDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class DataFactoryDTO {

    private String NAME;
    private List<AccountDTO> ACCOUNTS;
    private List<CardMakingDTO> CARDS;
}
