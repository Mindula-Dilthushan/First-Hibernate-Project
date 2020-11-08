package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerTable")
public class Customer {
    @Id
    private String Id;
    @Column(name = "Customer Name")
    private String custName;
    @Column(name = "Customer Address")
    private String custAddress;
    @Column(name = "Customer Email")
    private String custEmail;

    public Customer(String id, String custName, String custAddress, String custEmail) {
        Id = id;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custEmail = custEmail;
    }

    public Customer() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id='" + Id + '\'' +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custEmail='" + custEmail + '\'' +
                '}';
    }
}
