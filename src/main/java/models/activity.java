package main.java.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activity")
public class activity {

    @Column(name="act_type")
    @JsonProperty
    private String actType;

    @Column(name="act_time")
    @JsonProperty
    private String actTime;

    @Column(name="po_list")
    @JsonProperty
    private int[] poList;

    @Column(name="act_goal")
    @JsonProperty
    private String actGoal;

    @Id
    @Column(name="act_id")
    @JsonProperty
    private int actId;

    @Column(name="status")
    @JsonProperty
    private String status;

    @Column(name="act_approver")
    @JsonProperty
    private int actApprover;

    @Column(name="act_loc_x")
    @JsonProperty
    private double actLocX;

    @Column(name="act_loc_y")
    @JsonProperty
    private double actLocY;
}
