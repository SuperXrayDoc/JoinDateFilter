package Xray_Doc.JoinDateFilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import net.minecraft.client.Minecraft;

public class getJoinDate {
	public int findJoinDate(String name) throws IOException {
		
		String path=Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "/JoinDateFilter/dates.txt";
		File file_dates = new File(path);
		
		path=Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "/JoinDateFilter/whitelist.txt";
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
				reader_wl.close();
				reader_names.close();
				return 2;
			}
	    }
	    reader_wl.close();
	    
	    while ((line=reader_names.readLine()) != null) {
			if(line.equalsIgnoreCase(name)) {
				String date=reader_names.readLine();
				filter=compareDates.compareJoinDate(date);
				reader_names.close();
				if(filter) {
					return 1;
				}
				else {
					return 2;
				}
			}
		}
	    reader_names.close();
	    
	    Minecraft.getMinecraft().player.sendChatMessage("/joindate "+name);
	    
	    return 0;
	}
}
