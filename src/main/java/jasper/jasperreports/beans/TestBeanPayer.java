package jasper.jasperreports.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TestBeanPayer {
    public Long id;
    public boolean ucb;
    public Long coreId;
    public String name;
    public String clientId; // mb or jmbg
    public String taxNumber; // pib
//    public DataTypeEnum dataType;
//    public String[] phones;
//    public String[] emails;
//    public String[] contactNames;
    public String param;
    public String payrollAccount;
//    public boolean accountControl;
    public String chargesAccount;
//    public ChargesModelEnum chargesModel;
//    public BigDecimal chargesAmount;
//    public Long totalEmployees;
//    public String[] authorizedEmails;
//    public Date createdAt;
//    public String createdBy;
//    public Date updatedAt;
//    public String lastModifiedBy;
//    public String operatingUnit;
    public String city;
    public String street;



}
