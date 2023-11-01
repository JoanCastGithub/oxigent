package com.oxigent.challenge.products.repository;

import com.oxigent.challenge.products.domain.GroupCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupCompanyRepository extends JpaRepository<GroupCompanyEntity, Long> {
}
