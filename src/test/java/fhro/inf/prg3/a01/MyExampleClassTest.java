package fhro.inf.prg3.a01;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MyExampleClassTest {
	@org.junit.jupiter.api.Test
	void testMultiply() {
		IntStream.range(-5, 5)
				.forEach(i -> assertEquals(i * (i - 1), new MyExampleClass().multiply(i, i - 1)));
	}
}