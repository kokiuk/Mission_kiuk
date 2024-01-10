package com.example.mini.hash.repo;

import com.example.mini.hash.entity.Hash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HashRepo extends JpaRepository<Hash, Long> {
    boolean existsByHashWord(String hashWord);
}
