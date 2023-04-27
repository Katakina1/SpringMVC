package com.kina.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kina.pojo.User;
import com.kina.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {
    @RequestMapping(value = "/j1")
//    @ResponseBody // 他就不会走视图解析器,会直接返回一个字符串.
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // 创建一个对象
        User user = new User("马越1号", 3, "男");

        String str = mapper.writeValueAsString(user);
        return str;
    }
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<>();
        // 创建一个对象
        User user1 = new User("马越1号", 3, "男");
        User user2 = new User("马越2号", 4, "男");
        User user3 = new User("马越3号", 5, "男");
        User user4 = new User("马越4号", 6, "男");
        User user5 = new User("马越5号", 7, "男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        // 使用ObjectMapper来进行格式化输出
//        // 不使用时间戳方式
//        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        mapper.setDateFormat(sdf);
//        // ObjectMapper, 时间解析后的默认格式为:Timestamp,时间戳
//        String str = mapper.writeValueAsString(date);
        Date date = new Date();
        return JsonUtils.getJson(date);
    }
    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        List<User> userList = new ArrayList<>();
        User user1 = new User("马越1号", 3, "男");
        User user2 = new User("马越2号", 4, "男");
        User user3 = new User("马越3号", 5, "男");
        User user4 = new User("马越4号", 6, "男");
        User user5 = new User("马越5号", 7, "男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        String str = JSON.toJSONString(userList);
        return str;
    }
}
