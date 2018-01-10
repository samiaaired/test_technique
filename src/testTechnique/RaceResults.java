package testTechnique;

import testTechnique.TimeDuration;
public class RaceResults {
	
	String tagNumber; 
	TimeDuration resultTime;
	
	
	
	
	public RaceResults(String tagNumber, TimeDuration resultTime) {
	
		this.tagNumber = "";
		this.resultTime= resultTime;
	}

	public void onNewResult() {
		
	}
;
	public void printResults() {
	
		String[] tagNumber = null;
		TimeDuration[] resultTime = null;
		
		
		
		for (int i = 0; i < tagNumber.length; i++) {
            for (int j=0; j <resultTime.length; j++) {
            	  
                  System.out.print(tagNumber[i]+resultTime[j]);	
            }
              
                
            }
		
	}
	

}
