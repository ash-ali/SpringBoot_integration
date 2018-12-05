package com.example.springbootec.service;

import com.example.springbootec.pojo.User;

import java.util.List;
/**
 * @Author: linjie
 * @Description: 接口
 * @Date: 下午 16:41 2018/7/31 0031
 */ 
public interface IEmService {
    /**
     * @Author: linjie
     * @Description: 添加记录
     * @Date: 下午 17:24 2018/7/31 0031
     */
    User add();
    /**
     * @Author: linjie
     * @Description: 查询
     * 1、设置模糊查询
     * 2、设置某字段精确查询
     * 3、设置年龄从高到低
     * 4、设置分页
     * @Date: 下午 17:00 2018/7/31 0031
     */
    List<User> select();
    /**
     * @Author: linjie
     * @Description: 更新字段数据
     * @Date: 下午 17:05 2018/7/31 0031
     */
    User update();
    /**
     * @Author: linjie
     * @Description: 删除指定记录
     * @Date: 下午 17:20 2018/7/31 0031
     */
    String delete();

    /**
     * 精确
     * @return
     */
    User select_one();
}
