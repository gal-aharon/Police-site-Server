package PoliceStationServer.repositories;

import PoliceStationServer.models.userActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userActivityRepository extends JpaRepository<userActivity, String> {
}
