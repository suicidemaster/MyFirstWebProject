package myFirstWebProject.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

/**
 * Created by KGBkid on 16.07.2017.
 */

@Entity //Этой аннотацией мы указываем, что данный класс является сущностью.
@Table(name = "PLANS")// Этой аннотацией мы указываем, что за эту сущность в БД отвечает таблица с именем PLANS
public class Plan extends Domain {

    private Long planId;
    private String name;
    private Integer price;
    private List<Option> options;

    public Plan() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "planId",unique=true, nullable = false)
    public Long getPlanId() {
        return planId;
    }

    @Column(nullable = false)
    @NotNull
    public void setPlanId(Long planId) {
        this.planId = planId;
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
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @OneToMany(/*mappedBy = "optionId", */fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
