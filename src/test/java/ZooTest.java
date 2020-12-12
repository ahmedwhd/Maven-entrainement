import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ZooTest {

	@Test
	public void test() {
		Zoo zootest = new Zoo();
		Throwable ex = null;
		for (int i = 0; i < 16; i++) {
			try {
				zootest.nouveauVisiteur();
			} catch (Exception e) {
				ex = e;
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

		assertEquals(ex.getMessage(), "Zoo plein");
		assertTrue(ex instanceof Exception);
		assertFalse(ex instanceof IndexOutOfBoundsException);

	}

}
