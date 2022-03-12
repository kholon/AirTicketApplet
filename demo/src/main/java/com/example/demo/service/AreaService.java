package com.example.demo.service;

import com.example.demo.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AreaService {
    /**
     * 列出区域列表
     *
     * @return areaList
     */
    List<Area> getAreaList();

    /**
     * 根据Id列出具体区域
     *
     * @return area
     */
    List<Area> getAreaById(String areaId1,String areaId2);
}
