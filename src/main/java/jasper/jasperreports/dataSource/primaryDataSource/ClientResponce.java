package jasper.jasperreports.dataSource.primaryDataSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientResponce {
    private List myThings = new ArrayList<>();

    public List<ClientDTO> getAll(){
        List<ClientDTO> myList = new ArrayList<>();
        myList.add(new ClientDTO("1212",
                "Petar",
                "Bogradska 21",
                "11000",
                "email@google.com",
                "00058655",
                "Beograd",
                "Srpsko",
                "212231-2112", true
                ));
      myList.add( new ClientDTO("33233",
              "Jovan",
              "novosadska 21",
              "11000",
              "njema@google.com",
              "00058655",
              "Novi Sad",
              "Srpsko",
              "1233-3211",
              false));
        return myList;
    }

    public ClientDTO getFromID(){
        return new ClientDTO("33233",
                "Jovan",
                "novosadska 21",
                "11000",
                "njema@google.com",
                "00058655",
                "Novi Sad",
                "Srpsko",
                "1233-3211",
                false);
    }


}
