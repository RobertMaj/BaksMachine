package model.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by RobertM on 2015-11-23.
 */
@Entity
@Table(name = "user_roles",
 uniqueConstraints = @UniqueConstraint(columnNames = {"role", "username"}))
public class Role implements Serializable {

    private Integer userRoleId;
    private String role;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_role_id", unique = true, nullable = false)
    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "role", nullable = false, length = 45)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
