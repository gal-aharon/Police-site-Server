package PoliceStationServer.repositories;


import PoliceStationServer.models.activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface activityRepository extends JpaRepository<activity, String> {
}
