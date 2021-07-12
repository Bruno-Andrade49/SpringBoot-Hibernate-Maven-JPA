/*package com.example.springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.projeto.entities.Order;
import com.example.projeto.entities.Usuario;
import com.example.springboot.enums.OrderStatus;
import com.example.springboot.repositories.OrderRepository;
import com.example.springboot.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		Usuario usuario01 = new Usuario(null, "Bruno", "b.emanueandrade@hotmail.com", "83986773132", "123456");
		Usuario usuario02 = new Usuario(null, "Gilmara", "b.gabrielandrade@hotmail.com", "83986773132", "1234568");
		
		Order order01 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, usuario02);

		userRepository.saveAll(Arrays.asList(usuario01, usuario02));
		orderRepository.saveAll(Arrays.asList(order01));
	}

}
*/