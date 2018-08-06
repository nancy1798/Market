package cn.asghoul.dao;

import cn.asghoul.pojo.comment;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public interface CommentDao {
    void addComment (BigInteger orderId,comment comm);
    List<comment> showComment (BigInteger beClientId);
    void delComment (Map<String,Object> map);


}
