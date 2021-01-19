package com.example.hibernateinheritance;

import com.example.hibernateinheritance.models.Check;
import com.example.hibernateinheritance.models.CreditCard;
import com.example.hibernateinheritance.models.Payment;
import com.example.hibernateinheritance.repositories.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository paymentRepository;

	@Test
	void createNewPayment() {

		CreditCard cc = new CreditCard();

		cc.setId(123);
		cc.setAmount("100");
		cc.setCardnumber("123123");

		Check check = new Check();

		check.setId(11);
		check.setAmount("200");
		check.setChecknumber("111");

		paymentRepository.save(cc);

	}

	@Test
	public void testCreatePayment() {



	}

}
