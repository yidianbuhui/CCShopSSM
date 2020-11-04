package com.yidianbuhui.ccshop.controller;

import com.yidianbuhui.ccshop.entity.Carousel;
import com.yidianbuhui.ccshop.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/portal/carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map<String, Object> getCarouselList(@RequestBody Map<String, Object> carouselMap) {
        int count = carouselService.getCount(carouselMap);
        List<Carousel> carouselList = carouselService.getCarouselList(carouselMap);
        Map<String, Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count", count);
        returnMap.put("list", carouselList);
        return returnMap;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Carousel getGoodsById(@RequestParam Integer id){
        return carouselService.getCarousel(id);
    }

}
