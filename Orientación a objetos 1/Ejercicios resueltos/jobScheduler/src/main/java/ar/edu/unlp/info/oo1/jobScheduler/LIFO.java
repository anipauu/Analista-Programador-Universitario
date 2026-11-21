package ar.edu.unlp.info.oo1.jobScheduler;
import java.util.List; 
public class LIFO implements Policy{
	
	public JobDescription next(List<JobDescription> jobs) {
		 JobDescription nextJob = jobs.get(jobs.size()-1);
         return nextJob;
	}
}
