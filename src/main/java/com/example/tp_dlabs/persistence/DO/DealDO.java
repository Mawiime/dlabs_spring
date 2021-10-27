package com.example.tp_dlabs.persistence.DO;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="TBL_DEAL")
public class DealDO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="shop_name")
    private String shopName;

    @Column(name="shop_link")
    private String shopLink;

    @Column(name="price_old")
    private long priceOld;

    @Column(name="price_new")
    private long priceNew;

    @Column(name="promo_code")
    private String promoCode;

    @Column(name="date")
    private Calendar date;

    @Column(name="img_url")
    private String imgUrl;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "fk_creator")
    private UserDO creator;

    @OneToMany(mappedBy = "deal")
    private List<TemperatureDO> temperatureDOList;

    public DealDO(Integer id, String title, String shopName, String shopLink, long priceOld, long priceNew, String promoCode, Calendar date, String imgUrl, String description, UserDO creator) {
        this.id = id;
        this.title = title;
        this.shopName = shopName;
        this.shopLink = shopLink;
        this.priceOld = priceOld;
        this.priceNew = priceNew;
        this.promoCode = promoCode;
        this.date = date;
        this.imgUrl = imgUrl;
        this.description = description;
        this.creator = creator;
    }

    public DealDO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLink() {
        return shopLink;
    }

    public void setShopLink(String shopLink) {
        this.shopLink = shopLink;
    }

    public long getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(long priceOld) {
        this.priceOld = priceOld;
    }

    public long getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(long priceNew) {
        this.priceNew = priceNew;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public UserDO getCreator() {
        return creator;
    }

    public void setCreator(UserDO creator) {
        this.creator = creator;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TemperatureDO> getTemperatureDOList() {
        return temperatureDOList;
    }

    public void setTemperatureDOList(List<TemperatureDO> temperatureDOList) {
        this.temperatureDOList = temperatureDOList;
    }
}
