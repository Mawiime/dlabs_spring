package com.example.tp_dlabs.business;

import java.util.Calendar;

public class DealDTO {
    private int id;
    private int temperature;
    private String title;
    private String creator;
    private String shopName;
    private Calendar date;
    private String imgUrl;
    private String shopLink;
    private String description;
    private String promoCode;
    private long priceOld;
    private long priceNew;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public String getShopLink() {
        return shopLink;
    }

    public void setShopLink(String shopLink) {
        this.shopLink = shopLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
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
}
