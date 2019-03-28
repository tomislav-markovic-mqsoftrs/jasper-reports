package jasper.jasperreports.dataSource.secondaryDataSource;

import java.util.ArrayList;
import java.util.List;

public class PersonResponce {
    public List<PersonDTO> getAll(){
        List<PersonDTO> myList = new ArrayList<>();
        return myList;
    }

    public PersonDTO getFromID(){
        return new PersonDTO("Milojko",
                "Pantic");
    }
}
