package main.java.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user {

    @Column(name="username")
    @JsonProperty
    private String username;

    @Column(name="password")
    @JsonProperty
    private String password;

    @Column(name="full_name")
    @JsonProperty
    private String fullName;

    @Id
    @Column(name="user_id")
    @JsonProperty
    private int userId;

    @Column(name="user_perm")
    @JsonProperty
    private String userPerm;
}
