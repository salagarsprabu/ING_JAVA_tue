package com.src.ingtradeapp.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.repo.StockRepository;
import com.src.ingtradeapp.response.StocksResponse;

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
		List<Stock> expected = new ArrayList<>();
		Stock resp = new Stock();
		resp.setName("AMGS");
		expected.add(resp);
		when(stockService.getAllStocks()).thenReturn(expected);
		List<Stock> response = stockService.getAllStocks();
		assertEquals(response.size(), expected.size());
	}
}
