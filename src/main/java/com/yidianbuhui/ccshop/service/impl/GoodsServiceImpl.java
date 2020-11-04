package com.yidianbuhui.ccshop.service.impl;

import com.yidianbuhui.ccshop.dao.GoodsMapper;
import com.yidianbuhui.ccshop.entity.Goods;
import com.yidianbuhui.ccshop.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsList(Map<String, Object> goodsMap) {
        return goodsMapper.getGoodsList(goodsMap);
    }

    @Override
    public int getCount(Map<String, Object> goodsMap) {
        return goodsMapper.getCount(goodsMap);
    }

    @Override
    public Goods getGoods(Integer id) {
        return goodsMapper.getGoods(id);
    }

    @Override
    public List<Goods> getGoodsByType(Integer typeId) { return goodsMapper.getGoodsByType(typeId); }

}
