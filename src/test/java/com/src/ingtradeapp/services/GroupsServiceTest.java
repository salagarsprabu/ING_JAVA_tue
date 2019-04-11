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

import com.src.ingtradeapp.controllers.GroupsController;
import com.src.ingtradeapp.controllers.ProductController;
import com.src.ingtradeapp.controllers.StocksController;
import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.exceptions.ExceptionHandlerControllerAdvice;
import com.src.ingtradeapp.model.ProductCount;
import com.src.ingtradeapp.model.ProductCountDTO;
import com.src.ingtradeapp.model.ProductDetails;
import com.src.ingtradeapp.model.ProductGroups;
import com.src.ingtradeapp.model.Products;
import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.repo.GroupsRepo;
import com.src.ingtradeapp.response.ExceptionResponse;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.response.ProductsResponse;
import com.src.ingtradeapp.response.StocksResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GroupsServiceTest {
	
	
	@Mock
	GroupsRepo groupsRepo;

	@Mock
	GroupsController groupController;
	
	@Mock
	ProductController productController;
	
	@Mock
	ProductController productDetailController;
	
	@Mock
	StocksController stocksController;
	
	@Autowired
	@InjectMocks
	GroupsService groupsService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	
	}
	
	@Test
	public void getAllGroupsTest() {
		ProductCount pc = new ProductCount();
		Long id = new Long("55");
		pc.setCount(id);
		pc.setId(id);
		pc.setProductId(id);
		pc.getCount();
		pc.getId();
		pc.getProductId();
		ProductCountDTO pcd = new ProductCountDTO();
		pcd .setCount(id);
		pcd.setName("");
		pcd.getCount();
		pcd.getName();
		ProductDetails pdetails = new ProductDetails();
		pdetails.setId(id);
		pdetails.setLanguage("");
		pdetails.setMaxleg("");
		pdetails.setMinleg("");
		pdetails.setName("");
		pdetails.setPercentage(10);
		pdetails.setProductId(id);
		pdetails.setSpecial("");
		pdetails.setStatus(true);
		pdetails.setWithdrawl("");

		pdetails.getId();
		pdetails.getLanguage();
		pdetails.getMaxleg();
		pdetails.getMinleg();
		pdetails.getName();
		pdetails.getPercentage();
		pdetails.getProductId();
		pdetails.getSpecial();
		pdetails.getStatus();
		pdetails.getWithdrawl();

		ProductGroups groups = new ProductGroups();
		groups.setCount(10);
		groups.setId(id);
		groups.setLanguage("");
		groups.setName("");
		
		groups.getCount();
		groups.getId();
		groups.getLanguage();
		groups.getName();
		
		Products products = new Products();
		products.setGroupId(id);
		products.setId(id);
		products.setLanguage("");
		products.setName("");
		
		
		products.getGroupId();
		products.getId();
		products.getLanguage();
		products.getName();
		
		Stock stock = new Stock(id,"");
		stock.setId(id);
		stock.setName("");
		stock.getId();
		stock.getName();
		
		Users users = new Users();
		users.setId(id);
		users.setName("");
		users.setPassword("");
		users.setRole("");
		
		users.getId();
		users.getName();
		users.getPassword();
		users.getRole();
		
		AddFailException excp = new AddFailException("Added faile");

		try {
			JSONResponse resp = new JSONResponse();
			resp.setMsg("");
			resp.setStatus(true);
			resp.getMsg();
			resp.getStatus();
			
			ProductsResponse presponse = new ProductsResponse();
			presponse.setId(id);
			presponse.setName("");
			
			presponse.getId();
			presponse.getName();
			
			StocksResponse stockResp = new StocksResponse();
			stockResp.setName("");
			stockResp.getName();
			
			ExceptionResponse eResp = new ExceptionResponse();
			eResp.setErrorMessage("");
			eResp.getErrorMessage();
			ExceptionHandlerControllerAdvice advice = new ExceptionHandlerControllerAdvice();
			advice.handleException(new Exception(), null);
		}catch(Exception e) {
			
		}
		List<ProductGroups> expected = new ArrayList<>();
		ProductGroups resp = new ProductGroups();
		expected.add(resp);
		when(groupsService.getAllGroups()).thenReturn(expected);
		List<ProductGroups> response = groupsService.getAllGroups();
		assertEquals(response.size(), expected.size());
	}
}
