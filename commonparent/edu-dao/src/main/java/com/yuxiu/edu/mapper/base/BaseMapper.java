package com.yuxiu.edu.mapper.base;

/**
 * @author GeZhiGuang
 * @version 0.1
 * @date 2020/7/31
 */
public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUID(String uuid);

    public void update(T t);

    public void insert(T t);
}
