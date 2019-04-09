package com.src.ingtradeapp.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.respository.LoginRepository;
import com.src.ingtradeapp.respository.UsersRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UsersServiceTest {
	
	@MockBean
	private UsersRepository usersRepository;
	
	@Test
	public void userDetailsTest() {
	}
	

}
