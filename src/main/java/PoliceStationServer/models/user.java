package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private String full_name;

    @Id
    @Column(name="user_id")
    @JsonProperty
    private String user_id;

    @Column(name="user_perm")
    @JsonProperty
    private String user_perm;

    @Column(name="cur_loc_x")
    @JsonProperty
    private Double cur_locx;

    @Column(name="cur_loc_y")
    @JsonProperty
    private Double cur_locy;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "user_activity",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "activity_id") }
    )
    Set<activity> activities = new HashSet<>();

    @OneToMany(targetEntity=activity.class, mappedBy="act_approver",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<activity> user = new ArrayList<>();

    public user() {
    }

    public void setCur_locx(Double cur_locx) {
        this.cur_locx = cur_locx;
    }

    public void setCur_locy(Double cur_locy) {
        this.cur_locy = cur_locy;
    }

    public String getUser_id() {
        return user_id;
    }
}
