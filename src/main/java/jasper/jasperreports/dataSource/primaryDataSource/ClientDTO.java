package jasper.jasperreports.dataSource.primaryDataSource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClientDTO {

    private String clientId;
    private String name;
    private String street;
    private String postalCode;
    private String email;

    private String personalIDNumber;
    private String city;
    private String citizenship;
    private String telephoneNumber;

    private Boolean cool;
}
