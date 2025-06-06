package com.example.buysell.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.buysell.models.Cipher;

import com.example.buysell.repositories.CipherRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Service
@Slf4j
@RequiredArgsConstructor
public class CipherService {

    private final CipherRepository cipherRepository;

    public List<Cipher> listCiphers(String title) {
        if(title != null) cipherRepository.findByTitle(title);
        return cipherRepository.findAll();
    }

    public void saveCipher(Cipher cipher){
        log.info("Saving new {}", cipher);
        cipherRepository.save(cipher);
    }

    public void deleteCipher(Long id){
        cipherRepository.deleteById(id);
    }

    public Cipher getCipherById(Long id) {
        return cipherRepository.findById(id).orElse(null);
    }
}
