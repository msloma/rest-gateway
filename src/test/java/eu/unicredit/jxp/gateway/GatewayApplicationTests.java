package eu.unicredit.jxp.gateway;

import eu.unicredit.jxp.gateway.model.Approvers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class GatewayApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void getUserids() {
		Approvers a = new Approvers("u");
		assertTrue("u".equals(a.getUserids()));
	}

	@Test
	void getMails() {
		Approvers a = new Approvers("u");
		assertEquals("u@mailasp.internal", a.getMails());
	}

}
