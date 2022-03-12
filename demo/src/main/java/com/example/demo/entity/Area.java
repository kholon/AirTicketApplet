 package com.example.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Area {
    private String flightNo;//飞机型号主键ID
    private String airwaysCn;//航空公司名称
    private  String depAirdrome;//出发地点
    private  String arrAirdrome;//到达地点
    private Date depTime;//出发时间
    private Date arrTime;//到达时间
    private  Integer Price;//机票价格
    private String Platform;//平台

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirwaysCn() {
        return airwaysCn;
    }

    public void setAirwaysCn(String airwaysCn) {
        this.airwaysCn = airwaysCn;
    }

    public String getDepAirdrome() {
        return depAirdrome;
    }

    public void setDepAirdrome(String depAirdrome) {
        this.depAirdrome = depAirdrome;
    }

    public String getArrAirdrome() {
        return arrAirdrome;
    }

    public void setArrAirdrome(String arrAirdrome) {
        this.arrAirdrome = arrAirdrome;
    }

    public String getDepTime() {
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return time.format(depTime);
    }

    public void setDepTime(Date depTime) {
        this.depTime = depTime;
    }

    public String getArrTime() {
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return time.format(arrTime);
    }

    public void setArrTime(Date arrTime) {
        this.arrTime = arrTime;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}
