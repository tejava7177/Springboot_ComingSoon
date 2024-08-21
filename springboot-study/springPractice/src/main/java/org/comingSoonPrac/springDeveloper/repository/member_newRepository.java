package org.comingSoonPrac.springDeveloper.repository;

import org.comingSoonPrac.springDeveloper.model.member_new;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface member_newRepository extends JpaRepository<member_new, Long> {

}