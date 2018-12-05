package com.example.springbootec.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * 实体类
 */
//indexName:索引库的名称，建议以项目的名称命名
//type:类型，建议以实体的名称命名
//replicas:每个分区默认的备份数
//refreshInterval:刷新间隔
//shards:默认分区数
@Document(indexName = "add",type = "user", shards = 1,replicas = 0, refreshInterval = "-1")
public class User {
    @Id
    private String id;          //标识
    //@Field默认是可以不加的，默认所有属性都会添加到ES中。加上@Field之后，@document默认把所有字段加上索引失效，只有加@Field 才会被索引(同时也看设置索引的属性是否为no)
    @Field
    private String name;
    @Field
    private String lastname;
    @Field
    private Integer age = 0;

    /**
     * setter or getter
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 重写toString
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
