package demojunit;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class TestdynamicAvecCollection {
	 @TestFactory
	 @Disabled
	  Collection<DynamicTest> dynamicTestsAvecCollection() {
	    Collection<DynamicTest> resultat = new ArrayList<>();
	    for (int i = 1; i <= 5; i++) {
	      int val = i;
	      resultat.add(DynamicTest.dynamicTest("Ajout " + val + "+" + val, 
	          () -> Assertions.assertEquals(val * 2, val + val)));
	    }
	    return resultat;
	  }
	 
	 @TestFactory
	  Collection<DynamicTest> dynamicTestsAvecCollection2() {
	    Collection<DynamicTest> resultat = new ArrayList<>();
	   
	      resultat.add(DynamicTest.dynamicTest("Ajout " + 1 + "+" + 1, 
	          () -> Assertions.assertEquals(1 * 2, 1+3)));
	      
	      resultat.add(DynamicTest.dynamicTest("Ajout " + 2 + "+" + 2, 
		          () -> Assertions.assertEquals(2 * 2, 2+2)));
	   
	    return resultat;
	  }
}
