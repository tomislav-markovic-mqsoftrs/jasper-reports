package jasper.jasperreports.dataSource.cardMaking;

import java.util.ArrayList;
import java.util.List;

public class CardMakingResponce {
public List<CardMakingDTO> getAll(){
    List<CardMakingDTO> cardMakingDTOS = new ArrayList<>();
    cardMakingDTOS.add(new CardMakingDTO("MasterCard debit kartica", 0l, false));
    cardMakingDTOS.add(new CardMakingDTO("DinaCard debitna kartica", 0l, false));
    return cardMakingDTOS;
}
}
