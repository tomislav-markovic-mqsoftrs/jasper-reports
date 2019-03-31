package jasper.jasperreports.dataSource.primaryDataSource;

import java.util.ArrayList;
import java.util.List;

public class ClientResponce {
    private List<ClientDTO> clientDTOList;

    public ClientResponce(){
        this.clientDTOList = this.generateClients();
    }

    private List<ClientDTO> generateClients() {
        List<ClientDTO> clientDTOS = new ArrayList<>();
        ClientDTO client1 = new ClientDTO(
                "11231",
                "Radisa Urosecvic",
                "32232",
                "Sifra",
                "Perica",
                "21.03.1987",
                "Nemanjina 32",
                "Beograd",
                "11000",
                "Srpsko",
                "Licna karta",
                "14.5.2021",
                "223322",
                "Beograd",
                "mail@email.com",
                "011/213-321",
                "", "066/321-321",
                "");

        ClientDTO client2 = new ClientDTO(
                "11231",
                "Slavisa Urosecvic",
                "32232",
                "Sifra",
                "Perica",
                "21.03.1987",
                "Nemanjina 32",
                "Beograd",
                "11000",
                "Srpsko",
                "Licna karta",
                "14.5.2021",
                "223322",
                "Beograd",
                "mail@email.com",
                "011/213-321",
                "", "066/321-321",
                "");


        clientDTOS.add(client1);
        clientDTOS.add(client2);
        return clientDTOS;
    }

    public List<ClientDTO> getAll() {
        return clientDTOList;
    }

    public ClientDTO getFromID() {
        return clientDTOList.get(0);
    }


}
