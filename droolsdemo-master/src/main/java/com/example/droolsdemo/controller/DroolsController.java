package com.example.droolsdemo.controller;

import com.example.droolsdemo.pojo.User;
import com.example.droolsdemo.util.KieSessionUtils;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * drools控制器
 */
@RestController
public class DroolsController {

    /**
     * 判断传入的值是否是double类型的规则test01
     * @return
     * @throws Exception
     */
    @GetMapping("/drools01")
    public String show01() throws Exception{
        KieSession session = KieSessionUtils.getAllRules();
        session.insert(new Double(1));
        session.fireAllRules();
        return "ok";
    }

    /**
     * 判断user对象相关属性是否符合规则test02
     * @return
     * @throws Exception
     */
    @GetMapping("/drools02")
    public String show02() throws Exception{
        KieSession session = KieSessionUtils.getAllRules();
        User user = new User();
        user.setName("浅然");
        user.setAge(20);
        user.setSex("男");
        session.insert(user);
        session.fireAllRules();
        return "ok";
    }
}
