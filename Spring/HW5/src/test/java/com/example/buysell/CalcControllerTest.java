package com.example.buysell;

import static
 org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static
 org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static
 org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.buysell.controllers.CalcController;

@WebMvcTest(CalcController.class)
public class CalcControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCalculator() throws Exception {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(view().name("calc"));
    }
}
