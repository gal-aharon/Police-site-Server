package security.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
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
    private String userId;

    @Column(name="user_perm")
    @JsonProperty
    private String userPerm;

    @Column(name="cur_loc_x")
    @JsonProperty
    private Double curLocX;

    @Column(name="cur_loc_y")
    @JsonProperty
    private Double curLocY;

    public user() {
    }
}
