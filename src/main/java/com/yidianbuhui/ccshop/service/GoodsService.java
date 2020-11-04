package com.yidianbuhui.ccshop.service;

import com.yidianbuhui.ccshop.entity.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    List<Goods> getGoodsList(Map<String, Object> goodsMap);

    int getCount(Map<String, Object> goodsMap);

    Goods getGoods(Integer id);

    List<Goods> getGoodsByType(Integer typeId);

}
