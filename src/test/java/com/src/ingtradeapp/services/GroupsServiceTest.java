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

import com.src.ingtradeapp.model.ProductGroups;
import com.src.ingtradeapp.model.Stock;
import com.src.ingtradeapp.repo.GroupsRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GroupsServiceTest {
	
	
	@Mock
	GroupsRepo groupsRepo;

	
	@Autowired
	@InjectMocks
	GroupsService groupsService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	
	}
	
	@Test
	public void getAllGroupsTest() {
		List<ProductGroups> expected = new ArrayList<>();
		ProductGroups resp = new ProductGroups();
		expected.add(resp);
		when(groupsService.getAllGroups()).thenReturn(expected);
		List<ProductGroups> response = groupsService.getAllGroups();
		assertEquals(response.size(), expected.size());
	}
}
