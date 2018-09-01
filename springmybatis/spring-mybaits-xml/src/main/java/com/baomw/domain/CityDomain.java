package com.baomw.domain;

/**
 * 描述:
 * 城市domain
 *
 * @author baomw
 * @create 2018-08-30 下午 11:03
 */
public class CityDomain {
    private int id;
    private String name;
    private String provice;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProvice() {
        return provice;
    }
}
