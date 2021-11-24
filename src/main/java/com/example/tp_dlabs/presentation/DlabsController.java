package com.example.tp_dlabs.presentation;

import com.example.tp_dlabs.business.DealBO;
import com.example.tp_dlabs.business.DealDTO;
import com.example.tp_dlabs.business.HomeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class DlabsController {

    @Autowired
    private DealBO dealBO;

    @GetMapping(path="/public/deals")
    public HomeDTO getAll(){
        return new HomeDTO(dealBO.retrieveAll());
    }

    @GetMapping(path="/public/deals/{id")
    public DealDTO getOne(@PathVariable int id){
        return dealBO.retrieveOne(id);
    }

    @PostMapping(path="/deals")
    @Transactional
    public void create(@RequestBody DealDTO dealDTO){
        dealBO.createOne(dealDTO);
    }
}
