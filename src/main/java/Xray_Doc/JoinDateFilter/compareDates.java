package Xray_Doc.JoinDateFilter;

public class compareDates {	
	public boolean compareJoinDate(String date){
		int year=Integer.parseInt(date.substring(0,4));
		int month=Integer.parseInt(date.substring(5,7));
		int day=Integer.parseInt(date.substring(8,10));
		
		int cutoff_year=config.cutoff_year;
		int cutoff_month=config.cutoff_month;
		int cutoff_day=config.cutoff_day;
		
		if(year>=cutoff_year && month>=cutoff_month && day>=cutoff_day) //fuck you aholic
			return true;
		
		return false;
	}
}
