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
		String tagNumber;
		TimeDuration resultTime;
		String[][] tabResult;
		tabResult = new String[2][];
		
		for (int i = 0; i < tabResult.length; i++) {
            for (int j=0; j <tabResult[i].length; j++) {
            	  
                  System.out.print(tabResult[i][j]);	
            }
              
                
            }
		
	}
	

}
