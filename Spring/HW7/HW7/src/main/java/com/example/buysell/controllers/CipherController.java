package com.example.buysell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.buysell.models.Cipher;
import com.example.buysell.service.CipherService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CipherController {
    private final CipherService cipherService;

    @GetMapping("/")
    public String ciphers(@RequestParam(name="title", required = false)String title, Model model) { //Model model
        model.addAttribute("ciphers", cipherService.listCiphers(title));
        return "ciphers";
    }

    @PostMapping("/cipher/create")
    public String createCipher(Cipher cipher){
        cipherService.saveCipher(cipher);
        return "redirect:/";
    }


    @GetMapping("/cipher/{id}")
    public String cipherInfo(@PathVariable Long id, Model model) {
        model.addAttribute("cipher", cipherService.getCipherById(id));
        return "cipher-info";
    }

    @PostMapping("/cipher/delete/{id}")
    public String deleteCipher(@PathVariable Long id){
        cipherService.deleteCipher(id);
        return "redirect:/";
    }
}
