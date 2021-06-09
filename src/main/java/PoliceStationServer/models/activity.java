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
    private String act_time;

    @ManyToMany(mappedBy = "activities")
    @JsonProperty
    private Set<user> po_list = new HashSet<>();

    @Column(name="act_goal")
    @JsonProperty
    private String act_goal;

    @Id
    @Column(name="act_id")
    @JsonProperty
    private String act_id;

    @Column(name="status")
    @JsonProperty
    private String status;

    @Column(name="act_approver")
    @JsonProperty
    private String act_approver;

    @Column(name="act_loc_x")
    @JsonProperty
    private Double act_locx;

    @Column(name="act_loc_y")
    @JsonProperty
    private Double act_locy;

    public activity() {
    }
}
