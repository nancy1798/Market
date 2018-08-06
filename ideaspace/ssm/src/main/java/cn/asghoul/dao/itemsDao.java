package cn.asghoul.dao;

import cn.asghoul.pojo.items;

import java.util.List;
import java.util.Map;

public interface itemsDao {
    List<items> SelectItems (Map<String,Object> map);
}
