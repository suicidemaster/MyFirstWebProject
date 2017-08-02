package myFirstWebProject.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */

@Entity //Этой аннотацией мы указываем, что данный класс является сущностью.
@Table(name = "CLIENTS")// Этой аннотацией мы указываем, что за эту сущность в БД отвечает таблица с именем CLIENTS

public class Client extends Domain {

    private Long clientId;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String address;
    private List<Contract> phoneNumbers;
    private String email;
    private String password;



    public Client() {

    }

    public Client(String firstName, String lastName, Date birthday, String address, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.password = password;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "clientId",unique=true, nullable = false)
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Column(nullable = false)
    @NotNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(nullable = false)
    @NotNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column( nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(nullable = false)
    @NotNull
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    public List<Contract> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Contract> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Column(nullable = false)
    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(nullable = false)
    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!clientId.equals(client.clientId)) return false;
        if (!firstName.equals(client.firstName)) return false;
        if (!lastName.equals(client.lastName)) return false;
        if (!birthday.equals(client.birthday)) return false;
        if (!address.equals(client.address)) return false;
        if (!phoneNumbers.equals(client.phoneNumbers)) return false;
        if (!email.equals(client.email)) return false;
        return password.equals(client.password);
    }

    @Override
    public int hashCode() {
        int result = clientId.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phoneNumbers.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
