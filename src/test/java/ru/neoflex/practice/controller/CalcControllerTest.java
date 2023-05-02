package ru.neoflex.practice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class CalcControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void plus() throws  Exception
    {
        this.mockMvc.perform(get("/plus/3/4")).
                andDo(print()).
                andExpect(content().string("7.0"));
    }

    @Test
    void minus() throws  Exception
    {
        this.mockMvc.perform(get("/minus/3/4")).
                andDo(print()).
                andExpect(content().string("-1.0"));
    }

    @Test
    void multiplier() throws  Exception
    {
        this.mockMvc.perform(get("/multiplier/3/4")).
                andDo(print()).
                andExpect(content().string("12.0"));
    }

    @Test
    void division() throws  Exception
    {
        this.mockMvc.perform(get("/division/-25/5")).
                andDo(print()).
                andExpect(content().string("-5.0"));
    }
}