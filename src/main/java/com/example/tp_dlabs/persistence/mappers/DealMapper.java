package com.example.tp_dlabs.persistence.mappers;

import com.example.tp_dlabs.business.DealDTO;
import com.example.tp_dlabs.persistence.dos.DealDO;
import com.example.tp_dlabs.persistence.dos.TemperatureDO;
import com.example.tp_dlabs.persistence.dos.UserDO;

public class DealMapper {

    private DealMapper() {

    }

    public static DealDTO map(DealDO dealDO){
        DealDTO dealDTO = new DealDTO();

        int temperature = 0;
        for(TemperatureDO temperatureDO : dealDO.getTemperatureDOList()){
            temperature += temperatureDO.getValue();
        }

        dealDTO.setId(dealDO.getId());
        dealDTO.setTitle(dealDO.getTitle());
        dealDTO.setDescription(dealDO.getDescription());
        dealDTO.setCreator(dealDO.getCreator().getPseudo());
        dealDTO.setShopName(dealDO.getShopName());
        dealDTO.setShopLink(dealDO.getShopLink());
        dealDTO.setDate(dealDO.getDate());
        dealDTO.setImgUrl(dealDO.getImgUrl());
        dealDTO.setPromoCode(dealDO.getPromoCode());
        dealDTO.setPriceOld(dealDO.getPriceOld());
        dealDTO.setPriceNew(dealDO.getPriceNew());
        dealDTO.setTemperature(temperature);

        return dealDTO;
    }

    public static DealDO map(DealDTO dealDTO){
        DealDO dealDO = new DealDO();
        UserDO tempUser = new UserDO();
        tempUser.setId(1);

        dealDO.setTitle(dealDTO.getTitle());
        dealDO.setDescription(dealDTO.getDescription());
        dealDO.setCreator(tempUser);
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
