package com.pinyougou.hf.manager.controller;


import com.pinyougou.hf.framework.model.TbBrand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BrankController {

    @GetMapping("findAll")
    public List<TbBrand>findAll(){
       List<TbBrand>list=new ArrayList<>();
       list.add(new TbBrand().setId(1L).setName("联想").setFirstChar("L"));
       list.add(new TbBrand().setId(2L).setName("小米").setFirstChar("X"));
       list.add(new TbBrand().setId(3L).setName("华为").setFirstChar("H"));
       return list;
    }
}
