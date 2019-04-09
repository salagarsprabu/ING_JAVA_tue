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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LoginServiceTest {
	
	@MockBean
	private LoginRepository loginRepository;
	
	@Test
	public void singupTest() {
		String name="admin";
		String password="admin";
		Users user=new Users(name,password);
		when(loginRepository.findByNameAndPassword(name, password)).thenReturn(user);
		assertEquals(name, user.getName());
	}
	

}
