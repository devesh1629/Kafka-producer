package com.example.project;

import com.example.project.services.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleSourceDestinationMapperIntegrationTest {

    @InjectMocks
    private TestService testService;


    @Test
    public void testReverse() {
        assertEquals(testService.getReverse("devesh"), "hseved");
    }
}
