package com.example.demo.mapper;

import com.example.demo.pojo.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemMapper {
    /**
     * 根据 id 查询商品信息
     * @param id
     * @return
     */
    Item queryItemById(String id);

    /**
     * 删除商品信息
     * @param id
     * @return
     */
    int deleteItem(String id);

    /**
     * 修改商品信息
     * @param item
     * @return
     */
    int updateItem(Item item);

    /**
     * 新增商品信息
     * @param item
     * @return
     */
    int addItem(Item item);
}
