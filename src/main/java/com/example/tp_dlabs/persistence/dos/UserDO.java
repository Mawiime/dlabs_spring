package com.example.tp_dlabs.persistence.dos;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TBL_USER")
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pseudo")
    private String pseudo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<TemperatureDO> temperatureDOList;

    public UserDO(Integer id, String pseudo, String firstName, String lastName, String password) {
        this.id = id;
        this.pseudo = pseudo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public UserDO() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TemperatureDO> getTemperatureDOList() {
        return temperatureDOList;
    }

    public void setTemperatureDOList(List<TemperatureDO> temperatureDOList) {
        this.temperatureDOList = temperatureDOList;
    }

}
