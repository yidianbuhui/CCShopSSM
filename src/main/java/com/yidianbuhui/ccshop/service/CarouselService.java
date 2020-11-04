package com.yidianbuhui.ccshop.service;

import com.yidianbuhui.ccshop.entity.Carousel;

import java.util.List;
import java.util.Map;

public interface CarouselService {
    List<Carousel> getCarouselList(Map<String, Object> carouselMap);

    int getCount(Map<String, Object> carouselMap);

    Carousel getCarousel(Integer id);

}
