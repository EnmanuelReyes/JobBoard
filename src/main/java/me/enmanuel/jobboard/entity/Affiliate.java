package me.enmanuel.jobboard.entity;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 07-Nov-16
 * Time: 1:19 PM
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name= "affiliate")
public class Affiliate {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String email;
    private String url;
    private String token;
    private Boolean active;

    public Affiliate(String name, String email, String url) {
        this.name = name;
        this.email = email;
        this.url = url;
    }

    public Affiliate() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
