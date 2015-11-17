package model.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by RobertM on 2015-10-19.
 */
@Entity
@Table(name = "\"user\"")
public class User implements Serializable {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;


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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
