package com.yidianbuhui.ccshop.controller;

import com.yidianbuhui.ccshop.common.RespBean;
import com.yidianbuhui.ccshop.entity.Goods;
import com.yidianbuhui.ccshop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/portal/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getGoodsList(@RequestBody Map<String,Object> goodsMap, HttpServletRequest request ){
        HttpSession session = request.getSession();
        System.out.println("+++++\n"+goodsMap);
        int count = goodsService.getCount(goodsMap);
        List<Goods> goodsList = goodsService.getGoodsList(goodsMap);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("count",count);
        returnMap.put("list",goodsList);
        session.setAttribute("returnMap",returnMap);
        return returnMap;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Goods getGoodsById(@RequestParam Integer id){
        return goodsService.getGoods(id);
    }

    @RequestMapping(value = "/getByType",method = RequestMethod.POST)
    public List<Goods> getGoodsByType(@RequestParam Integer typeId){
        return goodsService.getGoodsByType(typeId);
    }

}
