package com.example.tp_dlabs.business;

import java.util.List;

public class HomeDTO {
    private List<DealDTO> deals;

    public HomeDTO(List<DealDTO> deals){
        this.deals = deals;
    }

    public List<DealDTO> getDeals() {
        return deals;
    }

    public void setDeals(List<DealDTO> deals) {
        this.deals = deals;
    }
}
