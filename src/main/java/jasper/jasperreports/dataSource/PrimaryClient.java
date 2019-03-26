package jasper.jasperreports.dataSource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PrimaryClient {

    private String clientId;
    private String name;
    private String street;
    private String postalCode;
    private String email;

    private String personalIDNumber;
    private String city;
    private String citizenship;
    private String telephoneNumber;
}
