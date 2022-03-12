package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Area;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AreaDao {
    /**
     * 列出区域列表
     *
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 根据Id列出具体区域
     *
     * @return area
     */
    List<Area> queryAreaById(String depAirdrome,String arrAirdrome);


}
