package com.yidianbuhui.ccshop.entity;

import java.util.Date;

public class Carousel {
    private Integer id;

    private String cardesc;

    private String imgpath;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardesc() {
        return cardesc;
    }

    public void setCardesc(String cardesc) {
        this.cardesc = cardesc == null ? null : cardesc.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}