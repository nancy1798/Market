package cn.asghoul.pojo;

import java.math.BigInteger;

public class commentstate {
    private BigInteger orderId;
    private int commentsState;

    public BigInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public int getCommentsState() {
        return commentsState;
    }

    public void setCommentsState(int commentsState) {
        this.commentsState = commentsState;
    }
}
