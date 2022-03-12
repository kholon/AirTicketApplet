package com.example.demo.web;

import com.example.demo.entity.Area;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "listarea", method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<Area> list = areaService.getAreaList();
        modelMap.put("arealist",list);
        return modelMap;
    }
    /**
     * 通过区域Id获取区域信息
     *
     * @return
     */
    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(String areaId1,String areaId2) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        System.out.println(areaId1+areaId2);
        List<Area> area =  areaService.getAreaById(areaId1,areaId2);
        modelMap.put("arealist", area);
        return modelMap;
    }
}
