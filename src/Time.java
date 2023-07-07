
class Time{
	public static void main(String[] args){
	Timings t = new Timings();
	t.setHours(3);
	t.setMinutes(59);
	t.setSeconds(59);
	System.out.println(t.Showhours()+" : "+t.Showminutes()+" : "+t.Showseconds());
	}
}
class Timings{
	private int hours;
	private int minutes;
	private int seconds;
	private int validateHours(int h){
		return h >= 0 && h <= 23 ? h : 0;
	}
	private int validateMinutes(int m){
		return m >=0 && m <= 59 ? m : 0;
	}
	private int validateSeconds(int s){
		return s >= 0 && s <= 59 ? s : 0;
	}
	public void setHours(int h){
		hours = validateHours(h);
	}
	public void setMinutes(int m){
		minutes = validateMinutes(m);
	}
	public void setSeconds(int s){
		seconds = validateSeconds(s);
	}
	public int incrementhours(){
		if(hours==23 && minutes==59){
			hours=00;
		}
		else{
			if(minutes==59 && seconds==59) hours+=1;
			else hours+=0;
		}
		return hours;
	}
	public int incrementminutes(){
		if(minutes==59 && seconds==59){
			incrementhours();
			minutes=0;
		}
		else{
			if(seconds==59) minutes+=1;
			else return minutes;
		}
		return minutes;
	}

	public int incrementseconds(){
		if(seconds==59){
			seconds=0;
			incrementminutes();
		}
		else{
			seconds+=1;
		}
		return seconds;
		
	}
	public int Showhours(){
		return incrementhours();
	}
	public int Showminutes(){
		return incrementminutes();
	}
	public int Showseconds(){
		return incrementseconds();
	}
}
		
