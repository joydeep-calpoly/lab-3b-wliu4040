package lab_3c;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class JUnitTests {

	@Test
	public void testQuery() {
		Database database = Mockito.mock(Database.class);
		Service s = new Service(database);
		s.query(null);
		verify(database).isAvailable();
	}
	@Test
	public void testgetDataBaseID() {
		Database database = Mockito.mock(Database.class);
		Service s = new Service(database);
		s.getDatabaseID();
		verify(database).getUniqueId();
	}
}
