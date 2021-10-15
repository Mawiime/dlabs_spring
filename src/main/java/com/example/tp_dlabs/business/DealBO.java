package com.example.tp_dlabs.business;

import com.example.tp_dlabs.persistence.DealDAO;
import com.example.tp_dlabs.persistence.DealDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DealBO {

    @Autowired
    private DealDAO dealDAO;

    public DealBO() {
        this.dealDAO = new DealDAO();
    }

    public List<DealDTO> retrieveAll(){
        List<DealDO> deals = dealDAO.findAll();

        List<DealDTO> dtos = new LinkedList<>();

        for(DealDO deal : deals){
            dtos.add(new DealDTO(deal.getId(), deal.getTemperature(), deal.getTitle(), deal.getCreator(), deal.getShopName(), deal.getDate(), deal.getImgUrl(), deal.getShopLink(), deal.getDescription(), deal.getPromoCode(), deal.getPriceOld(), deal.getPriceNew()));
        }

        return dtos;
    }

    public DealDTO retrieveOne(int id){
        DealDO deal = dealDAO.findOne(id);
        return new DealDTO(deal.getId(), deal.getTemperature(), deal.getTitle(), deal.getCreator(), deal.getShopName(), deal.getDate(), deal.getImgUrl(), deal.getShopLink(), deal.getDescription(), deal.getPromoCode(), deal.getPriceOld(), deal.getPriceNew());
    }

    public void createOne(DealDO deaLDO){
        dealDAO.save(deaLDO);
    }
}
