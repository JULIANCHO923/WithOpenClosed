package unitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import parking.DateToday;
public class TestDateToday {
	
	public DateToday dateToday;
	public static final int MONDAY = 1;
	
	@Before
	public void init(){
		dateToday = spy(DateToday.class);		
	}
	
	@Test
	public void WhenDayIsMondayThenReturnTrue() {						
		when(dateToday.dayToday()).thenReturn(MONDAY);
		
		boolean result = dateToday.isMonday();
		
		verify(dateToday).dayToday();
		assertTrue(result);
	}
	
	@Test
	public void WhenDayIsMondayThenReturnFalse() {
		int differentDayItisThursday = 4;		
		when(dateToday.dayToday()).thenReturn(differentDayItisThursday);
		
		boolean result = dateToday.isMonday();
						
		verify(dateToday).dayToday();		
		assertFalse(result);
	}
}
