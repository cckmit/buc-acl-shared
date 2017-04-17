package com.alibaba.buc.api.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Operation implements Serializable {

    private static final long serialVersionUID = -3738366235013855582L;

    /**
     * 操作名
     */
    private String            title;

    /**
     * 操作name
     */
    private String            name;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Operation) {
            Operation op = (Operation) obj;
            return new EqualsBuilder().append(op.name, this.name).append(op.title, this.title).isEquals();
        } else return false;
    }

}
