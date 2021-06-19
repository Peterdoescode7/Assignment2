package sheridan.drabpe.assignment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetDataRepositoryJpa extends JpaRepository<PetEntityJpa, Integer> {
}
