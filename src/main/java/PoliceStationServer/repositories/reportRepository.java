package PoliceStationServer.repositories;


import PoliceStationServer.models.report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reportRepository extends JpaRepository<report, String> {
}
