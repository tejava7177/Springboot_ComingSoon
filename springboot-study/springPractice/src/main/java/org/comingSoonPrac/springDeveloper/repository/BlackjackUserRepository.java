package org.comingSoonPrac.springDeveloper.repository;



import org.comingSoonPrac.springDeveloper.model.Blackjack_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlackjackUserRepository extends JpaRepository<Blackjack_User, Long> {
}