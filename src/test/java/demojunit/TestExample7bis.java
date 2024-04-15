package demojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample7bis {
	@Test
	void verifierSame() {
		Etudiant sut = new Etudiant("Ali");
		Etudiant expected = sut;
		Assertions.assertSame(sut, expected);
	}

	
}
