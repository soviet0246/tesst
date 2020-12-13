package leaseacar.repository;

import leaseacar.model.Cardata;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface for cardata
public interface CardataRepository extends JpaRepository<Cardata, Long> {
}
