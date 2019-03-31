package jasper.jasperreports.dataSource.accounts;

import jasper.jasperreports.dataSource.cardMaking.CardMakingDTO;

import java.util.ArrayList;
import java.util.List;

public class ChosenAccountsResponse {
    public List<AccountDTO> getAll(){
        List<AccountDTO> accountDTOS = new ArrayList<>();
        accountDTOS.add(new AccountDTO("Tekući račun",
                0D,
                true,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false));
        accountDTOS.add(new AccountDTO("Namenski tekući račun za poljoprivrednike",
                0D,
                true,
                true,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false));

        return accountDTOS;
    }
}
