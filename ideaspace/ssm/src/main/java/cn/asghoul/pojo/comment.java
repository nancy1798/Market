package cn.asghoul.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

public class comment {
    private BigInteger commentId;
    private BigInteger beClientId;
    private BigInteger clientId;
    private String mainBody;
    private Timestamp commentTime;

    public BigInteger getCommentId() {
        return commentId;
    }

    public void setCommentId(BigInteger commentId) {
        this.commentId = commentId;
    }

    public BigInteger getBeClientId() {
        return beClientId;
    }

    public void setBeClientId(BigInteger beClientId) {
        this.beClientId = beClientId;
    }

    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    public String getMainBody() {
        return mainBody;
    }

    public void setMainBody(String mainBody) {
        this.mainBody = mainBody;
    }

    public Timestamp getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
    }
}
