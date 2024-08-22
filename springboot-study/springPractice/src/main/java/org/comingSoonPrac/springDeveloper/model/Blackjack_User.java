
package org.comingSoonPrac.springDeveloper.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "blakjackUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Blackjack_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    // 추가적인 필드 (예: email, createdAt, updatedAt 등)
}
