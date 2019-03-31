package jasper.jasperreports.dataSource.dataFactory;

import jasper.jasperreports.dataSource.accounts.ChosenAccountsResponse;
import jasper.jasperreports.dataSource.cardMaking.CardMakingResponce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataFactoryResponse {
    public List<DataFactoryDTO> getAll(){
        List<DataFactoryDTO> dataFactoryDTOS = new ArrayList<>();
        DataFactoryDTO first = new DataFactoryDTO("Tomica", new ChosenAccountsResponse().getAll(), new CardMakingResponce().getAll());
        dataFactoryDTOS.add(first);

        return dataFactoryDTOS;
    }
}
