package demojunit;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestExample9 {

	/**
	 * Les assertions assertTimeout et assertTimeoutPreemptively v�rifie que les
	 * traitements fournis en param�tre s'ex�cutent avant le d�lai pr�cis�. La
	 * diff�rence entre les deux est que assertTimeoutPreemptively interrompt
	 * l'ex�cution des traitements si le d�lai est d�pass�.
	 */
	@Test

	void verifierTimeout() {
		Assertions.assertTimeout(Duration.ofMillis(200), () -> {
			return "";
		});
		Assertions.assertTimeout(Duration.ofSeconds(1), TestExample9::traiter);
	}

	private static String traiter() throws InterruptedException {
		Thread.sleep(2000);
		return "";
	}

	@Test
	@Disabled
	void verifierTimeoutPreemptively() {
		Assertions.assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
			return "";
		});

		Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), TestExample9::traiter);
	}
}
