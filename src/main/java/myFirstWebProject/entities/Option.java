package myFirstWebProject.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by KGBkid on 16.07.2017.
 */

@Entity //Этой аннотацией мы указываем, что данный класс является сущностью.
@Table(name = "OPTIONS")// Этой аннотацией мы указываем, что за эту сущность в БД отвечает таблица с именем OPTIONS
public class Option extends Domain {

    private Long optionId;
    private String name;
    private Double price;
    private Double connectionCost;
    private Contract contract;
    private Plan plan;

    public Option() {
    }

    public Option(String name, Double price, Double connectionCost) {
        this.name = name;
        this.price = price;
        this.connectionCost = connectionCost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "optionId",unique=true, nullable = false)
    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    @Column(nullable = false)
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    @NotNull
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(nullable = false)
    @NotNull
    public Double getConnectionCost() {
        return connectionCost;
    }

    public void setConnectionCost(Double connectionCost) {
        this.connectionCost = connectionCost;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="contractId")
    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="planId")
    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
