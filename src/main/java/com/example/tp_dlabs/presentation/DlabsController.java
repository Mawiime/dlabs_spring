package com.example.tp_dlabs.presentation;

import com.example.tp_dlabs.business.DealBO;
import com.example.tp_dlabs.business.DealDTO;
import com.example.tp_dlabs.business.HomeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deals")
public class DlabsController {

    @Autowired
    private DealBO dealBO;

    @RequestMapping(method = RequestMethod.GET)
    public HomeDTO getAll(){
        final HomeDTO homeDTO = new HomeDTO(dealBO.retrieveAll());

        return homeDTO;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public DealDTO getOne(@PathVariable int id){
        return dealBO.retrieveOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @Transactional
    public void create(@RequestBody DealDTO dealDTO){
        dealBO.createOne(dealDTO);
    }
}
