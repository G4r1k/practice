package ru.neoflex.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.practice.model.simpleCalcData;
@Repository
public interface simpleCalcRepository extends JpaRepository<simpleCalcData,Long>{
}
