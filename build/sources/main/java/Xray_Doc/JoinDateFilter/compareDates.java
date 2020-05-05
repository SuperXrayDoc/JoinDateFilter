package Xray_Doc.JoinDateFilter;

public class compareDates {	
	public boolean compareJoinDate(String date){
		int year=Integer.parseInt(date.substring(0,4));
		int month=Integer.parseInt(date.substring(5,7));
		int day=Integer.parseInt(date.substring(8,10));
		
		int cutoff_year=config.cutoff_year;
		int cutoff_month=config.cutoff_month;
		int cutoff_day=config.cutoff_day;
		
		System.out.println(cutoff_year +"/"+ cutoff_month + "/" + cutoff_day);
		
		if(year>=cutoff_year)
			if(month>=cutoff_month)
				if(day>=cutoff_day)
				{
					return true;
				}
		return false;
	}
}
