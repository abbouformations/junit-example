package demojunit;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestExample4 {
	 @Disabled 
	@Test
	  void verifierAttributs() {
	    Dimension sut = new Dimension(800, 600);
	    Assertions.assertAll("Dimensions non conformes",
	      () -> Assertions.assertTrue(sut.getWidth() == 801, "Valeur de width erronee"),
	    		
	      () -> Assertions.assertTrue(sut.getHeight() == 601, "Valeur de height erronee"));
	  }
	 
	 @Disabled
	 @Test 
	  void verifierEgaliteTableaux() {
	    Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 },
	      "Egalite des tableaux");
	  }
	 
	 @Disabled
	 @Test 
	  void verifierNonEgaliteTableaux() {
	    Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 3, 2, 1 }, 
	      "Egalite des tableaux");
	  }
	 
	 @Disabled
	 @Test
	  void verifierEgalite() {
	    Dimension sut = new Dimension(801, 601);
	    Assertions.assertEquals(new Dimension(801, 601), sut, "Dimensions non egales");
	  }
	 
	  @Disabled
	 @Test
	  void verifierTrue() {
	    boolean bool = true;
	    Assertions.assertTrue(bool);
	    Assertions.assertTrue(TestExample4::getBooleen, "Booleen different de true");
	  }
	  
	  static boolean getBooleen() {
	    return Math.abs(-1) == 2;
	  }
	  
	
	  @Test
	  void verifierIterableEquals() {
	    Iterable<Integer> attendu = new ArrayList<>(Arrays.asList(1, 2, 3));
	    Iterable<Integer> actuel = new ArrayList<>(Arrays.asList(1, 2, 3));
	    Assertions.assertIterableEquals(attendu, actuel);
	  }
}
