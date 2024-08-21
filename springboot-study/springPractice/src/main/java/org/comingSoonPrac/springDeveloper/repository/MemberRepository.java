package org.comingSoonPrac.springDeveloper.repository;

import org.comingSoonPrac.springDeveloper.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
