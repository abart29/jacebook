package com.makersacademy.acebook.repository;

import com.makersacademy.acebook.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {
//
//    Optional<Like> findByUser_idAndPost_id(Long user_id, Long post_id);
}
