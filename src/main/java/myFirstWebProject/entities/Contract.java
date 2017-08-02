package myFirstWebProject.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */

@Entity //Этой аннотацией мы указываем, что данный класс является сущностью.
@Table(name = "CONTRACTS")// Этой аннотацией мы указываем, что за эту сущность в БД отвечает таблица с именем CLIENTS
public class Contract extends Domain {

    private Long contractId;
    private String phoneNumber;
    private Plan plan;
    private List<Option> options;
    private Client client;

    public Contract() {
    }

    public Contract(String phoneNumber, Plan plan) {
        this.phoneNumber = phoneNumber;
        this.plan = plan;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "contractId",unique=true, nullable = false)
    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    @NotNull
    @ManyToOne
    @JoinColumn(name = "clientId")
    public Client getClient() {
        return this.client;
    }

    public void setClient (Client client) {
        this.client = client;
    }

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="planId")
    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @OneToMany(/*mappedBy = "option",*/ cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
