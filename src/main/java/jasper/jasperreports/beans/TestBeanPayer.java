package jasper.jasperreports.beans;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class TestBeanPayer {
//    public Long id;
////    public boolean ucb;
//    public Long coreId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getPayrollAccount() {
        return payrollAccount;
    }

    public void setPayrollAccount(String payrollAccount) {
        this.payrollAccount = payrollAccount;
    }

    public String getChargesAccount() {
        return chargesAccount;
    }

    public void setChargesAccount(String chargesAccount) {
        this.chargesAccount = chargesAccount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
