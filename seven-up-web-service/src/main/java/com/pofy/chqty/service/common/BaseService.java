package com.pofy.chqty.service.common;

import java.util.List;

/**
 * function - 通用service接口
 *
 * @author POFY
 * @version 1.0
 * @date 2018-05-20
 **/
public interface BaseService<T> {
    /**
     * function - 查询所有
     * @param  entity
     * @return  List<T>
     * @author POFY
     * @date 2018-05-20
     */
    List<T> list(T entity);

    /**
     * function - 根据实体属性查询符合条件的数据
     * @param entity
     * @return T
     * @author POFY
     * @date 2018-05-20
     */
    T get(T entity);

    /**
     * function - 根据逐渐进行查询
     * @param key
     * @return T
     * @author POFY
     * @date 2018-05-20
     */
    T findByPrimaryKey(String key);

    /**
     * function - 更新实体数据
     * @param  entity
     * @return  int
     * @author POFY
     * @date 2018-05-20
     */
    int update(T entity);

    /**
     * function - 保存实体
     * @param  entity
     * @return  int
     * @author POFY
     * @date 2018-05-20
     */
    int save(T entity);

    /**
     * function - 删除实体
     * @param  entity
     * @return  int
     * @author POFY
     * @date 2018-05-20
     */
    int delete(T entity);
}
