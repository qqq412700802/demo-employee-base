package com.demo.employee.base;


import java.io.Serializable;

/**
 * 基础service类，抽象出公共的增删改查方法
 * @param <T>
 */
public interface IService<T> {
    int save(T entity);

    int removeById(Serializable id);

    int updateById(T entity);

    T getById(Integer id);
}
