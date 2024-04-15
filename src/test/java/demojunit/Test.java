package demojunit;

import org.junit.jupiter.api.Assertions;

public class Test {
	
	@org.junit.jupiter.api.Test
	void test() {
		Integer i1=Integer.valueOf(128);
		Integer i2=Integer.valueOf(128);
		
		System.out.println(i1);
		System.out.println(i2);
		Assertions.assertSame(i1, i2);
	}

}
