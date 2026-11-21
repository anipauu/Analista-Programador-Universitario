package ar.edu.unlp.info.oo1.IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseDays implements IDateLapse {
	private LocalDate from; 
	private int sizeInDays; 
	
	public DateLapseDays(LocalDate from, LocalDate to) {
		this.from = from; 
		this.sizeInDays = (int) from.until(to, ChronoUnit.DAYS); 
	}
	
	public LocalDate getFrom() {
		return this.from; 
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays); 
	}
	
	public int sizeInDays() {
		return this.sizeInDays; 
	}
	
	public boolean includesDate(LocalDate other) {
		return !other.isAfter(this.getTo()) && !other.isBefore(this.from);	}
	
	
}
