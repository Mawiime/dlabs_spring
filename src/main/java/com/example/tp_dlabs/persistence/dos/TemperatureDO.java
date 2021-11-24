package com.example.tp_dlabs.persistence.dos;

import javax.persistence.*;

@Entity
@Table(name = "TBL_TEMPERATURE")
public class TemperatureDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "value")
    private Integer value;

    @ManyToOne
    @JoinColumn(name = "fk_user")
    private UserDO user;

    @ManyToOne
    @JoinColumn(name = "fk_deal")
    private DealDO deal;

    public TemperatureDO(Integer id, Integer value, UserDO user, DealDO deal) {
        this.id = id;
        this.value = value;
        this.user = user;
        this.deal = deal;
    }

    public TemperatureDO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }

    public DealDO getDeal() {
        return deal;
    }

    public void setDeal(DealDO deal) {
        this.deal = deal;
    }
}
