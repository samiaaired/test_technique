package testTechnique;

public class TimeDuration  {
	
	int seconde ;
	int minute; 
	int heure;

	public TimeDuration(int seconde) throws BadBadValueException {
		if (seconde<0) {
			throw new BadBadValueException();
		}
		else {
			this.seconde = seconde;
		}
		
		}
	
	

	public TimeDuration(int seconde, int minute) throws BadBadValueException {
		if (seconde<0) {
			throw new BadBadValueException();
		}
		
	else {
		this.seconde = seconde;
		this.minute = minute;
	}
		
	}
	
	



	public TimeDuration(int seconde, int minute, int heure)throws BadBadValueException  {
		if (seconde<0) {
			throw new BadBadValueException();
		}
	else {
		this.seconde = seconde;
		this.minute = minute;
		this.heure = heure;	
	}
		
	}



	@Override
	public String toString() {
		return "TimeDuration [seconde=" + seconde + ", minute=" + minute + ", heure=" + heure + "]";
	}

	
	
	
	

}
