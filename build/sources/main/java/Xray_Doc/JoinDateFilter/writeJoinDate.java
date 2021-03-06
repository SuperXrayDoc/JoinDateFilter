package Xray_Doc.JoinDateFilter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class writeJoinDate {
	public void newDateAppend(String name, String date) throws IOException, InterruptedException {
		String path=System.getenv("APPDATA")+"/.minecraft/JoinDateFilter/dates.txt";
		File file = new File(path);
		
		FileWriter fw = new FileWriter(path,true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw);
		out.print(name+"\n"+date+"\n");
		out.close();
		wait(3000); //prevent getting kicked for spam
		
		return;
	}
}
