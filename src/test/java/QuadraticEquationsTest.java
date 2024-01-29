import org.testng.Assert;
import org.testng.annotations.Test;
import quadratic_equations.QuadraticEquations;

public class QuadraticEquationsTest {

        @Test
        public void testPositiveDiscriminant() {
            QuadraticEquations quadraticEquations = new QuadraticEquations(1, -3, 2);
            quadraticEquations.calcEquation();
            Assert.assertEquals(quadraticEquations.getFirstRoot(), 2.0, 0.001);
            Assert.assertEquals(quadraticEquations.getSecondRoot(), 1.0, 0.001);
        }

        @Test
        public void testZeroDiscriminant() {
            QuadraticEquations quadraticEquations = new QuadraticEquations(1, -4, 4);
            quadraticEquations.calcEquation();
            Assert.assertEquals(quadraticEquations.getRoot(), 2.0, 0.001);
        }

        @Test (expectedExceptions = UnsupportedOperationException.class)
        public void testNoRealRoots() {
            QuadraticEquations quadraticEquations = new QuadraticEquations(1, 1, 1);
            quadraticEquations.calcEquation();
        }
    }

