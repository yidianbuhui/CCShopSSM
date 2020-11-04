package com.yidianbuhui.ccshop.service.impl;

import com.yidianbuhui.ccshop.dao.CarouselMapper;
import com.yidianbuhui.ccshop.entity.Carousel;
import com.yidianbuhui.ccshop.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CarouselServiceImpl implements CarouselService {

    @Resource
    private CarouselMapper carouselMapper;
    @Override
    public List<Carousel> getCarouselList(Map<String, Object> carouselMap) {
        return carouselMapper.getCarouselList(carouselMap);
    }

    @Override
    public int getCount(Map<String, Object> carouselMap) {
        return carouselMapper.getCount(carouselMap);
    }

    @Override
    public Carousel getCarousel(Integer id) {
        return carouselMapper.selectCarousel(id);
    }

}
