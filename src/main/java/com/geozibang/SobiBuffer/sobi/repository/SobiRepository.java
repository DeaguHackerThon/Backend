package com.geozibang.SobiBuffer.sobi.repository;

import com.geozibang.SobiBuffer.sobi.entity.Sobi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SobiRepository extends JpaRepository<Sobi, Long> {
    List<Sobi> findAllByDateId(Long DateId);
}
