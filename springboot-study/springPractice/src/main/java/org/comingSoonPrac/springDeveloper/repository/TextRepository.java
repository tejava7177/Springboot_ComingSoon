package org.comingSoonPrac.springDeveloper.repository;

import org.comingSoonPrac.springDeveloper.model.TextEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<TextEntry, Long> {
}
