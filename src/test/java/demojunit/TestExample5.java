package demojunit;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestExample5 {
	@Test
	@Disabled
	void verifierLinesMatch() {
		List<String> expectedLines = Arrays.asList("A1", "A2", "A3", "A4");
		List<String> emails = Arrays.asList("A1", "A2", "A3", "A4");
		Assertions.assertLinesMatch(expectedLines, emails);
	}

	@Test
	@Disabled
	void verifierLinesMatch2() {
		List<String> expectedLines = Arrays.asList("(.*)@(.*)", "(.*)@(.*)");
		List<String> emails = Arrays.asList("test@gmail.com", "jm@test.fr");
		Assertions.assertLinesMatch(expectedLines, emails);
	}

	/*
	 * Il est aussi possible d'ignorer un ou plusieurs �l�ments durant la
	 * comparaison gr�ce � un marqueur d'avance rapide : ils peuvent par exemple
	 * permettre d'ignorer des �l�ments dont la valeur change � chaque ex�cution.
	 * 
	 * Un marqueur d'avance rapide commence et termine par �>>� et doit poss�der au
	 * moins quatre caract�res.
	 */

	@Test
	@Disabled
	void verifierLinesMatch3() {
		List<String> expectedLines = Arrays.asList("(.*)@(.*)", ">>10>>", "(.*)@(.*)");
		List<String> emails = Arrays.asList("test@gmail.com", "test", "email","ff", "jm@test.fr","test","test","test","test","test","ddd","test@hh.k");
		Assertions.assertLinesMatch(expectedLines, emails);
	}

	/**
	 * Il est possible de mettre une description entre les doubles chevrons : cette
	 * description sera ignor�e.
	 */
	@Disabled
	@Test
	void verifierLinesMatch4() {
		List<String> expectedLines = Arrays.asList("(.*)@(.*)", ">> go to the last >>", "(.*)@(.*)");
		List<String> emails = Arrays.asList("test@gmail.com", "test", "email", "jm@test.fr");
		Assertions.assertLinesMatch(expectedLines, emails);
	}

	/**
	 * Il est possible de pr�ciser un nombre exact d'�l�ments � ignorer.
	 * 
	 * 
	 */
@Disabled
	@Test
	void verifierLinesMatch5() {
		List<String> expectedLines = Arrays.asList("A1", ">>2>>", "A4");
		List<String> emails = Arrays.asList("A1", "A2", "A3", "A4");
		Assertions.assertLinesMatch(expectedLines, emails);
	}

	/**
	 * Si le nombre d'�l�ments � ignorer ne peut �tre atteint ou est insuffisant
	 * alors la m�thode l�ve une exception.
	 */

	@Test
	void verifierLinesMatch6() {

		List<String> expectedLines = Arrays.asList("A1", ">> 20 >>", "A4");
		List<String> emails = Arrays.asList("A1", "A2", "A3", "A4");
		Assertions.assertLinesMatch(expectedLines, emails);
	}
}
