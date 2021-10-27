package com.example.tp_dlabs.persistence;

import com.example.tp_dlabs.business.DealDTO;

public class DealMapper {

    private DealMapper() {

    }

    public static DealDTO map(DealDO dealDO){
        DealDTO dealDTO = new DealDTO();

        dealDTO.setId(dealDO.getId());
        dealDTO.setTitle(dealDO.getTitle());
        dealDTO.setDescription(dealDO.getDescription());
        dealDTO.setCreator(dealDO.getCreator());
        dealDTO.setTemperature(dealDO.getTemperature());
        dealDTO.setShopName(dealDO.getShopName());
        dealDTO.setShopLink(dealDO.getShopLink());
        dealDTO.setDate(dealDO.getDate());
        dealDTO.setImgUrl(dealDO.getImgUrl());
        dealDTO.setPromoCode(dealDO.getPromoCode());
        dealDTO.setPriceOld(dealDO.getPriceOld());
        dealDTO.setPriceNew(dealDO.getPriceNew());

        return dealDTO;
    }

    public static DealDO map(DealDTO dealDTO){
        DealDO dealDO = new DealDO();

        dealDO.setTitle(dealDTO.getTitle());
        dealDO.setDescription(dealDTO.getDescription());
        dealDO.setCreator(dealDTO.getCreator());
        dealDO.setTemperature(dealDTO.getTemperature());
        dealDO.setShopName(dealDTO.getShopName());
        dealDO.setShopLink(dealDTO.getShopLink());
        dealDO.setDate(dealDTO.getDate());
        dealDO.setImgUrl(dealDTO.getImgUrl());
        dealDO.setPromoCode(dealDTO.getPromoCode());
        dealDO.setPriceOld(dealDTO.getPriceOld());
        dealDO.setPriceNew(dealDTO.getPriceNew());

        return dealDO;
    }
}
