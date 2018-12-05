package com.example.springbootec.dao;


import com.example.springbootec.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: linjie
 * @Description: dao接口
 * @Date: 下午 17:04 2018/8/16 0016
 */
@Component
public interface UserRepository extends ElasticsearchRepository<User,String> {

    /**
     * 查询信息
     * @param id
     * @return
     */
    User queryUserById(String id);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    public List<User> findByNameLike(String name);

    /**
     * 精确查询
     * @param name
     * @return
     */
    public User findByName(String name);
}
