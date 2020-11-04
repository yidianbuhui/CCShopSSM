package com.yidianbuhui.ccshop.controller;

import com.yidianbuhui.ccshop.common.RespBean;
import com.yidianbuhui.ccshop.entity.GoodsType;
import com.yidianbuhui.ccshop.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/goodsType")
public class GoodsTypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;

    @RequestMapping("/list")
    public Map<String,Object> getGoodsTypeList(Map<String,Object> goodsTypeMap){
        int count = goodsTypeService.getCount(goodsTypeMap);
        List<GoodsType> goodsTypeList = goodsTypeService.getGoodsTypeList(goodsTypeMap);
        Map<String,Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count",count);
        returnMap.put("list",goodsTypeList);
        return returnMap;
    }

    @RequestMapping(value = "/getGoodsById",method = RequestMethod.GET)
    public GoodsType getGoodsType(@RequestParam Integer id){

        return goodsTypeService.getGoodsType(id);
    }

}
