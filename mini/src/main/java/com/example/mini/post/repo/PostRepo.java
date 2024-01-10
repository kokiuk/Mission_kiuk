package com.example.mini.post.repo;

import com.example.mini.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    List<Post> findByBoard_IdOrderByIdDesc(Long id);



}
