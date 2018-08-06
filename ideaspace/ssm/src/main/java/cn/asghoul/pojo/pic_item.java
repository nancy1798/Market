package cn.asghoul.pojo;

import java.math.BigInteger;

public class pic_item {
    private BigInteger picId;
    private BigInteger itemId;
    private String picAddress;

    public BigInteger getPicId() {
        return picId;
    }

    public void setPicId(BigInteger picId) {
        this.picId = picId;
    }

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
        this.itemId = itemId;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }
}
