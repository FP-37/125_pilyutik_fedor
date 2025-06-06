package com.example.buysell.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buysell.models.Cipher;

public interface CipherRepository extends JpaRepository<Cipher,Long> {
    List<Cipher> findByTitle(String title);
}
