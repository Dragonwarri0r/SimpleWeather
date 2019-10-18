package com.dragonwarrior.simpleweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id; //每个实体类的字段
    private String provinceName; //省份名字
    private int proviceCode; //省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
