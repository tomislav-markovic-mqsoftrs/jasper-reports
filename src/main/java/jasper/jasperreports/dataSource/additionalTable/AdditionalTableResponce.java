package jasper.jasperreports.dataSource.additionalTable;

import java.util.ArrayList;
import java.util.List;

public class AdditionalTableResponce {
    public List<AdditionalTableDTO> getAll(){
        List<AdditionalTableDTO> myList = new ArrayList<>();
        return myList;
    }

    public AdditionalTableDTO getFromID(){
        return new AdditionalTableDTO("Milojko", "Pantic");
    }
}
