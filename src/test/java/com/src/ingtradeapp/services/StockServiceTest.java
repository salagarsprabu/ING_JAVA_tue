package com.src.ingtradeapp.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.src.ingtradeapp.repo.StockRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StockServiceTest {
	
	
	@Mock
	StockRepository stockRepo;

	
	@Autowired
	@InjectMocks
	StockService stockService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getAllStocksTest() {
	}
}
