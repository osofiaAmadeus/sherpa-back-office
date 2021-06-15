package com.amadeus.sherpa.backoffice.repository;

import com.amadeus.sherpa.backoffice.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
