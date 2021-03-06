package com.yidianbuhui.ccshop.dao;

import com.yidianbuhui.ccshop.entity.Carousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarouselMapper {
    List<Carousel> getCarouselList(Map<String, Object> carouselMap);

    int getCount(Map<String, Object> carouselMap);

    Carousel selectCarousel(Integer id);

}