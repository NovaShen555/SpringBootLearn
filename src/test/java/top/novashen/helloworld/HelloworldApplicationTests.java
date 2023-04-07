package top.novashen.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.novashen.helloworld.pojo.Person;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
