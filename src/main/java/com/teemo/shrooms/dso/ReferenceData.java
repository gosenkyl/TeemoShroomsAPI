package com.teemo.shrooms.dso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "REFERENCE_DATA")
public class ReferenceData extends BaseEntity{

    @Column(name="set_id")
    private String setId;

    @Column(name="key")
    private String key;

    @Column(name="value")
    private String value;

    @Column(name="order")
    private Long order;

    @Column(name="active_flag")
    private boolean activeFlag;

    public String getSetId() {
        return setId;
    }
    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public Long getOrder() {
        return order;
    }
    public void setOrder(Long order) {
        this.order = order;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }
    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }
}
