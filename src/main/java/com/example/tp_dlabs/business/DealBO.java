package com.example.tp_dlabs.business;

import com.example.tp_dlabs.persistence.DAO.DealDAO;
import com.example.tp_dlabs.persistence.DO.DealDO;
import com.example.tp_dlabs.persistence.mappers.DealMapper;
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

        final List<DealDTO> dtos = new LinkedList<>();

        for(final DealDO deal : deals){
            dtos.add(DealMapper.map(deal));
        }

        return dtos;
    }

    public DealDTO retrieveOne(int id){
        return DealMapper.map(dealDAO.findOne(id));
    }

    public void createOne(DealDTO dealDTO){
        dealDAO.save(DealMapper.map(dealDTO));
    }
}
