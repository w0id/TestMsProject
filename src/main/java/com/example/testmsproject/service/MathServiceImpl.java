package com.example.testmsproject.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService{

    private static final String GREETING_TEXT = "Привет, пользователь ";
    private static final String PREVIOUS_FIBO_TEXT = ". Число Фиббоначи номер ";
    private static final String EQUAL_TEXT = " равно ";

    @Override
    public String getFibonachiForUser(String userName, Integer fibonachiNumber) {
        return GREETING_TEXT + userName + PREVIOUS_FIBO_TEXT + fibonachiNumber + EQUAL_TEXT + getFibo(fibonachiNumber);
    }

    private int getFibo(Integer fibonachiNumber) {
        Integer a = 0;
        Integer b = 1;
        for (int i = 2; i <= fibonachiNumber ; i++) {
            Integer next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
