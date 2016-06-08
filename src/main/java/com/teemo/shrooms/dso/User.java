package com.teemo.shrooms.dso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="USER")
public class User extends BaseEntity{

    @Column(name="user_name")
    private String userName;

    @Column(name="last_polled")
    private Date lastPolled;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLastPolled() {
        return lastPolled;
    }

    public void setLastPolled(Date lastPolled) {
        this.lastPolled = lastPolled;
    }
}
