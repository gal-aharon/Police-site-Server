package PoliceStationServer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="user_activity")
public class userActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_activity_id")
    @JsonProperty
    private Integer user_activity_id;

    @Column(name="activity_id")
    @JsonProperty
    private Integer activity_id;

    @Column(name="user_id")
    @JsonProperty
    private String user_id;

    public userActivity(Integer activity_id, String user_id) {
        this.activity_id = activity_id;
        this.user_id = user_id;
    }
}
