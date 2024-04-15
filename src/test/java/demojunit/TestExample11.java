package demojunit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class TestExample11 {

	@Test
	void testAvecHamcrest() {
		assertThat(1 + 2, isA(Integer.class));
		assertThat(1 + 2, equalTo(3));
	}
}
