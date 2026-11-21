package ar.edu.unlp.info.oo1.jobScheduler;
import java.util.List; 

public class FIFO implements Policy{

	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.get(0); 
		return nextJob; 
	}
}
