package cn.asghoul.pojo;

import java.math.BigInteger;

public class collect {
    private BigInteger collectId;
    private BigInteger clientId;
    private BigInteger itemId;
    private String itemName;
    private int itemType;

    public BigInteger getCollectId() {
        return collectId;
    }

    public void setCollectId(BigInteger collectId) {
        this.collectId = collectId;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    public BigInteger getItemId() {
        return itemId;
    }

    public void setItemId(BigInteger itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }
}
