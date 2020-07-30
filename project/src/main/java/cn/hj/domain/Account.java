package cn.hj.domain;


import java.io.Serializable;

public class Account  implements Serializable {

    private static final long serialVersionUID = -8040377338793317736L;

    private Integer id;
    private Integer uid;
    private Double money;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }
}