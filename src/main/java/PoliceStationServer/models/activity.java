package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="activity")
public class activity {

    @Column(name="act_type")
    @JsonProperty
    private String act_type;

    @Column(name="act_time")
    @JsonProperty
    private Timestamp act_time;

    @ManyToMany(mappedBy = "activities")
    @JsonProperty
    private Set<user> po_list = new HashSet<>();

    @Column(name="act_goal")
    @JsonProperty
    private String act_goal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="act_id")
    @JsonProperty
    private Integer act_id;

    @Column(name="status")
    @JsonProperty
    private String status;

    @ManyToOne()
    @JoinColumn(name="act_approver", referencedColumnName = "user_id", insertable = false, updatable = false)
    @JsonProperty
    private user act_approver;

    @Column(name="act_loc_x")
    @JsonProperty
    private Double act_locx;

    @Column(name="act_loc_y")
    @JsonProperty
    private Double act_locy;

    public activity() {
    }

    public Set<user> getPo_list() {
        return po_list;
    }

    public Integer getAct_id() {
        return act_id;
    }
}
