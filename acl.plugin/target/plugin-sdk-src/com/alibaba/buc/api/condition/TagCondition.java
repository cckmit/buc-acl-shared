package com.alibaba.buc.api.condition;

public class TagCondition implements Condition {

    private static final long serialVersionUID = 3609766025043776086L;
    private String            name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
