package main.java.repositories;

import main.java.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reportRepository extends JpaRepository<user, String> {
}
