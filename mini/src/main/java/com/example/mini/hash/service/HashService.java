package com.example.mini.hash.service;

import com.example.mini.hash.repo.HashRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HashService {
    private HashRepo hashRepo;

}
