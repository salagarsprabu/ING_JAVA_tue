package com.src.ingtradeapp.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
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

import com.src.ingtradeapp.model.Products;
import com.src.ingtradeapp.repo.ProductRepository;
import com.src.ingtradeapp.response.ProductsResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductServiceTest {
	
	
	@Mock
	ProductRepository productRepo;

	
	@Autowired
	@InjectMocks
	ProductService productService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);	
	}
	
	@Test
	public void getAllProducts() {
		List<Products> expected = new ArrayList<>();
		Products resp = new Products();
		resp.setId(new Long("1"));
		resp.setName("Test");
		expected.add(resp);
		Long value = new Long("1");
		when(productRepo.findAllByGroupId(any(Long.class))).thenReturn(expected);
		List<ProductsResponse> response = productService.getAllProducts(value);
		assertEquals(response.size(), expected.size());
	}
}
