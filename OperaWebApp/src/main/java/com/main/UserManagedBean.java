package com.main;

import com.services.ServiceUser;
import model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by Robert on 2015-11-12.
 */
@ManagedBean(name = "userMb", eager = true)
@Component
@RequestScoped
public class UserManagedBean implements Serializable {

    @PostConstruct
    public void start(){
        user = new User();
        user.setId(1);
        user.setName("Robert");
        user.setSurname("Maj");
    }

    private User user;

    @Autowired
    private ServiceUser serviceUser;

    public void addCustomer() {

        serviceUser.addUser(getUser());
    }

    public void updateCustomer() {
        serviceUser.updateUser(getUser());
    }

    public void deleteUser() {
        serviceUser.deleteUser(getUser());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceUser getServiceUser() {
        return serviceUser;
    }
}
