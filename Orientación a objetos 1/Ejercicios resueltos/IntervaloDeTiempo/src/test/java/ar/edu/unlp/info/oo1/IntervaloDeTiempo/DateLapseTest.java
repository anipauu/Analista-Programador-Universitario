package ar.edu.unlp.info.oo1.IntervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest{
	private IDateLapse date; 
	private IDateLapse sameDate; 
	
	
	@BeforeEach
	void setUp() {
		date = new DateLapse(LocalDate.of(2026, 10, 1), LocalDate.of(2027, 10, 1));
		sameDate = new DateLapse(LocalDate.of(2026, 10, 25), LocalDate.of(2026, 10, 25)); 
	}
	
	@Test
	void sizeInDays() {
		assertEquals(365, date.sizeInDays()); 
		assertEquals(0, sameDate.sizeInDays());
	}
	
	@Test
	void includeDate() {
		assertTrue(date.includesDate(LocalDate.of(2027, 2, 1))); 
		
		assertTrue(date.includesDate(LocalDate.of(2026, 10, 1)));
		assertTrue(date.includesDate(LocalDate.of(2027, 10, 1))); 
		
		assertFalse(date.includesDate(LocalDate.of(2026, 9, 30)));
		assertFalse(date.includesDate(LocalDate.of(2027, 10, 2)));
	}

}
