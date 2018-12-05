package com.example.springbootec.service.impl;

import com.example.springbootec.dao.UserRepository;
import com.example.springbootec.pojo.User;
import com.example.springbootec.service.IEmService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author: linjie
 * @Description: 接口实现类
 * @Date: 下午 17:23 2018/7/31 0031
 */
@Service
public class EmServiceImpl implements IEmService {
    @Resource
    private UserRepository userRepository;

    @Override
    public User add() {
        User user = new User();
        user.setId("1");
        user.setName("中国一定是天下的武昌无常一定会呵呵");
        user.setLastname("java");
        user.setAge(21);
        userRepository.save(user);
        System.err.println("add a obj");
        return user;
    }

//    /**
//     * @Author: linjie
//     * @Description: 查询
//     * 1、设置模糊查询
//     * 2、设置某字段精确查询
//     * 3、设置年龄从高到低
//     * 4、设置分页
//     * @Date: 下午 17:00 2018/7/31 0031
//     */
//    @Override
//    public List<User> select() {
//        //创建builder
//        BoolQueryBuilder builder = QueryBuilders.boolQuery();
//        //builder下有must、should以及mustNot 相当于sql中的and、or以及not
//        //设置模糊搜索
//        //builder.must(QueryBuilders.fuzzyQuery("name", "中国"));
//        for(User user :userRepository.findByNameLike("中国")){
//            System.out.println(user);
//        }
//        //设置lastName是zh(精确查询)
//        builder.must(new QueryStringQueryBuilder("java").field("lastname"));
//
//        //按照年龄从高到低
//        FieldSortBuilder sort = SortBuilders.fieldSort("age").order(SortOrder.DESC);
//
//        //设置分页(拿第一页，一页显示两条)
//        //注意!es的分页api是从第0页开始的(坑)
//        PageRequest page = PageRequest.of(0, 2);
//
//        //构建查询
//        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
//        //将搜索条件设置到构建中
//        nativeSearchQueryBuilder.withQuery(builder);
//        //将分页设置到构建中
//        nativeSearchQueryBuilder.withPageable(page);
//        //将排序设置到构建中
//        nativeSearchQueryBuilder.withSort(sort);
//        //生产NativeSearchQuery
//        NativeSearchQuery query = nativeSearchQueryBuilder.build();
//
//        //执行
//        Page<User> search = userRepository.search(query);
//
//        //获取总条数(前端分页需要使用)
//        int total = (int) search.getTotalElements();
//
//        //获取查询到的数据内容
//        List<User> content = search.getContent();
//
//        //打印总条数看一下了
//        System.out.println(total);
//        System.out.println(content);
//        return content;
//    }

    /**
     * @Author: 浅然
     * @Description: 模糊查询
     * @Date: 11:57 2018/8/19
     */
    public List<User> select(){
        List<User> list = new ArrayList<>();
        for(User user : userRepository.findByNameLike("中国")){
            list.add(user);
            System.out.println(list);
        }
        return list;
    }
    /**
     * @Author: 浅然
     * @Description: 精确查询
     * @Date: 12:01 2018/8/19
     */
    public User select_one(){
        User user = userRepository.findByName("中国一定是天下的武昌无常一定会呵呵");
        return user;
    }

    /**
     * @Author: linjie
     * @Description: 更新字段数据
     * @Date: 下午 17:05 2018/7/31 0031
     */
    @Override
    public User update() {
        User user = userRepository.queryUserById("1");
        user.setName("jay");
        userRepository.save(user);
        System.err.println("update a obj");
        return user;
    }
    /**
     * @Author: linjie
     * @Description: 删除指定记录
     * @Date: 下午 17:20 2018/7/31 0031
     */ 
    @Override
    public String delete() {
        User user = userRepository.queryUserById("1");
        userRepository.delete(user);
        return "delete success";
    }
}
