package Xray_Doc.JoinDateFilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import net.minecraft.client.Minecraft;

public class getJoinDate {
	public int findJoinDate(String name) throws IOException {
		
		String path=System.getenv("APPDATA")+"/.minecraft/JoinDateFilter/dates.txt";
		File file_dates = new File(path);
		
		path=System.getenv("APPDATA")+"/.minecraft/JoinDateFilter/whitelist.txt";
		File file_wl = new File(path);
		
		BufferedReader reader_names = null;
		BufferedReader reader_wl = null;
		
	    reader_names = new BufferedReader(new FileReader(file_dates));
	    reader_wl=new BufferedReader(new FileReader(file_wl));
	    
	    int check=0;
	    String line;
	    String line2;
	    boolean filter=false;
	    compareDates compareDates=new compareDates();
	    
	    while ((line2=reader_wl.readLine()) != null) {
			if(line2.equalsIgnoreCase(name)) {
				return 2;
			}
	    }
	    //reader_wl.close();
	    
	    while ((line=reader_names.readLine()) != null) {
			if(line.equalsIgnoreCase(name)) {
				String date=reader_names.readLine();
				filter=compareDates.compareJoinDate(date);
				if(filter) {
					return 1;
				}
				else {
					return 2;
				}
			}
		}
	    Minecraft.getMinecraft().player.sendChatMessage("/joindate "+name);
	    
		//reader_names.close();
	    return 0;
	}
}
