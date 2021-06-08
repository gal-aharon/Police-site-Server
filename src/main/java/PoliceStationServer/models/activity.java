package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="activity")
public class activity {

    @Column(name="act_type")
    @JsonProperty
    private String actType;

    @Column(name="act_time")
    @JsonProperty
    private String actTime;

    @ManyToMany(mappedBy = "activities")
    @JsonProperty
    private Set<user> poList = new HashSet<>();

    @Column(name="act_goal")
    @JsonProperty
    private String actGoal;

    @Id
    @Column(name="act_id")
    @JsonProperty
    private String actId;

    @Column(name="status")
    @JsonProperty
    private String status;

    @Column(name="act_approver")
    @JsonProperty
    private String actApprover;

    @Column(name="act_loc_x")
    @JsonProperty
    private Double actLocX;

    @Column(name="act_loc_y")
    @JsonProperty
    private Double actLocY;

    public activity() {
    }
}
