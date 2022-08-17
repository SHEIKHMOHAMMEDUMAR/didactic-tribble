import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
	Calculator obj;
	@Test
	public void testAdd() {
		obj = new Calculator();
		assertEquals(30, obj.add(10, 20));
	}
}
