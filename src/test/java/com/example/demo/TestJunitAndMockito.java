package com.example.demo;
import com.example.demo.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJunitAndMockito {

        @Test
        void testUserName() {
            User user = new User();
            user.setName("Test");
            assertEquals("Test", user.getName());
        }
    }


