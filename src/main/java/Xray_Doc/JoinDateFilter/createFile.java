package Xray_Doc.JoinDateFilter;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;

public class createFile {
	public void createDataFiles() throws IOException {
		
    	String foldpath=Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "/JoinDateFilter";
    	File folder=new File(foldpath);
    	String dpath=Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "/JoinDateFilter/dates.txt";
    	File file = new File(dpath);
    	String wlpath=Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "/JoinDateFilter/whitelist.txt";
    	File wlfile = new File(wlpath);
    	
    	folder.mkdir();
    	file.createNewFile();
    	wlfile.createNewFile();
	  	}
	}

