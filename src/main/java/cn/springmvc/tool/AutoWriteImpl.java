package cn.springmvc.tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AutoWriteImpl {
	public static void generate(String classname){
		File file=new File("src"+File.separator+"main"+File.separator+"java"+File.separator+"cn"+File.separator+"springmvc"+File.separator+"service"+File.separator+classname+"Service.java");
		System.out.println(file.getAbsolutePath());
		try {
			boolean flag= file.createNewFile();
			System.out.println(flag);
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            File f=new File("src"+File.separator+"main"+File.separator+"java"+File.separator+"cn"+File.separator+"springmvc"+File.separator+ "cn/springmvc/tool" +File.separator+"impl.txt");
            System.out.println(f.getAbsolutePath());
            BufferedReader br = new BufferedReader(new FileReader(f)); 
            String line = br.readLine();
            while (line != null) {
            	line=line.replaceAll("XXXXXX",classname);
            	System.out.println(line);
            	bw.write(line);
            	bw.newLine();
                line = br.readLine();
            }
            br.close();
            bw.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
	}
	public static void main(String args[]){
		generate("Answer");
		generate("Attend");
		generate("Banner");
		generate("Completed");
		generate("Course");
		generate("Directory");
		generate("File");
		generate("Firstexam");
		generate("Note");
		generate("Question");
		generate("Remind");
		generate("Secondexam");
		generate("Star");
		generate("Switch");
		generate("Tag");
		generate("User");
		generate("Video");
		generate("Zan");
		
	}
}
