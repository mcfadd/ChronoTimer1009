package ChronoServer;

/**
 * @author Andy & Matt
 * 
 * The Racer class, apart of the entitiesDynamic package of the ChronoTimer1009.
 * A racer object represents a competitor in the timing system identified with a bib number.
 * Racers also have an associated name, start time, finish time, and DNF field that are used in other areas of the system.
 */
public class Racer implements Cloneable {
	
	private int bib;
	private String timeStartFormatted;
	private String timeFinishFormatted;
	private long finish;
	private long start;
	private double totalTime;
	private boolean DNF;
	volatile private boolean isActive;
	volatile private double runningTime;
	private boolean isAnonymous;
	
	/**
	 * @param bib number as an integer
	 * Constructor for Racer.
	 */
	public Racer(int bib){

		this.bib = bib;
		this.DNF = false;
		this.isActive = false;
		
	}
	
	/**
	 * Resets the racer
	 */
	
	public void reset(){
		
		this.DNF = false;
		this.isActive = false;
		timeStartFormatted = "";
		timeFinishFormatted = "";
		finish = 0;
		start = 0;
		
	}

	/**
	 * @return bib number
	 */
	public int getBib() {
		return bib;
	}
	
	/**
	 * @param state
	 */
	
	public void setAnonymous(boolean state) {
		isAnonymous = state;
	}
	
	/**
	 * @param bib
	 * @return
	 */
	public boolean setBib(int bib) {
		
		if(!isAnonymous)
			return false;
		
		this.bib = bib;
		return true;
		
	}
	
	/**
	 * @param timeStartFormatted
	 */
	public void setTimeStartFormatted(String timeStartFormatted) {
		this.timeStartFormatted = timeStartFormatted;
	}
	
	/**
	 * @param timeFinishFormatted
	 */
	public void setTimeFinishFormatted(String timeFinishFormatted) {
		this.timeFinishFormatted = timeFinishFormatted;
	}
	
	/**
	 * @return
	 */
	public String getTimeStartFormatted() {
		return timeStartFormatted;
	}

	/**
	 * @return
	 */
	public String getTimeFinishFormatted() {
		return timeFinishFormatted;
	}
	
	@Override
	public Racer clone() {
		
		Racer temp = null;
		
		try {
		
			temp = (Racer) super.clone();
		
		} catch(CloneNotSupportedException ex) {
			
		}
		
		return temp;
	}
	
	
	/**
	 * @param start
	 */
	public void setStartInLong(long start) {
		this.start = start;
	}
	
	/**
	 * @param finish
	 */
	public void setFinishInLong(long finish) {
		this.finish = finish;
	}
	
	/**
	 * @return
	 */
	public long getStartInLong() {
		return start;
	}
	
	/**
	 * @return
	 */
	public long getFinishInLong() {
		return finish;
	}

	/**
	 * Sets the racer's time to Did Not Finish (DNF).
	 */
	/**
	 * 
	 */
	public void setDNF() {
		isActive = false;
		this.DNF = true;
		this.timeStartFormatted = "DNF";
		this.timeFinishFormatted = "DNF";

	}

	/**
	 * @return true if the racer DNF.
	 */
	/**
	 * @return
	 */
	public boolean isDNF() {
		return DNF;
	}

	/**
	 * @return
	 */
	public double getTotalTime() {
		return totalTime;
	}

	/**
	 * @param d
	 */
	public void setTotalTime(double d) {
		this.totalTime = d;
	}
	
	/**
	 * @param active
	 */
	public void setIsActive(boolean active) {
		isActive = active;
	}
	
	/**
	 * @return
	 */
	public boolean isActive() {
		return isActive;
	}
	
	/**
	 * @return
	 */
	public double getRunningTime() {
		return runningTime;
	}
}

