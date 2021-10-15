package com.example.tp_dlabs.presentation;

import com.example.tp_dlabs.business.DealBO;
import com.example.tp_dlabs.business.DealDTO;
import com.example.tp_dlabs.business.HomeDTO;
import com.example.tp_dlabs.persistence.DealDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping(value = "/deals")
public class DlabsController {

    @Autowired
    private DealBO dealBO;

    @RequestMapping(method = RequestMethod.GET)
    public List<DealDTO> getAll(){
        final HomeDTO homeDTO = new HomeDTO(dealBO.retrieveAll());

        return homeDTO.getDeals();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public DealDTO getOne(@PathVariable int id){
        return dealBO.retrieveOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody DealDO dealDO){
        dealBO.createOne(dealDO);
    }
}
