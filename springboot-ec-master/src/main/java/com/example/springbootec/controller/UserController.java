package com.example.springbootec.controller;

import com.example.springbootec.dao.UserRepository;
import com.example.springbootec.pojo.User;
import com.example.springbootec.service.IEmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("es")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Resource
    private IEmService emService;

    /**
     * 添加
     * @return
     */
    @RequestMapping("/add")
    public User add() {
        return emService.add();
    }

    /**
     * 删除记录
     * @return
     */
    @RequestMapping("/delete")
    public String delete() {
        return emService.delete();
    }

    /**
     * 局部更新
     * @return
     */
    @RequestMapping("/update")
    public User update() {
        return emService.update();
    }
//    /**
//     * 查询
//     * @return
//     */
//    @RequestMapping("query")
//    public Employee query() {
//        Employee accountInfo = employeeRepository.queryEmployeeById("1");
//        System.err.println(new Gson().toJson(accountInfo));
//        return accountInfo;
//    }

    @RequestMapping("/select")
    public List<User> select() {
        List<User> userList = emService.select();
        return userList;
    }

    @RequestMapping("/select_one")
    public User select_one(){
        User user = emService.select_one();
        return user;
    }
}
