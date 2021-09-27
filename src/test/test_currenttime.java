package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

import quiz1.Register;

class test_currenttime {

	@Test
	void test() {
		class Test_currentTime {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			@Test
			void test() {
				String value = dtf.format(now);
				Register res =new Register();
				String result = res.Currenttime();
				assertEquals(value,result);
				
			}
	}
	}

}