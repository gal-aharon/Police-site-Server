package security.repositories;


import security.models.activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface activityRepository extends JpaRepository<activity, String> {
}
