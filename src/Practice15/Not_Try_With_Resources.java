package Practice15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Not_Try_With_Resources {
	public static void main(String[] args) {
		
		String inFielPath="D://A.txt";
		String outFilePath="D://C.txt";
		
		FileInputStream  in =null;
		FileOutputStream out=null;
		
		try {
			in=new FileInputStream(inFielPath);
			out = new FileOutputStream(outFilePath);
			int c;
			
			while((c=in.read()) !=-1) {
				
				out.write(c);
				
			}
			
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}finally {
			
			if (in != null) {
				
				try {
					
					in.close();
					
				}catch(IOException e) {
					e.printStackTrace();
					
				}
				
			}
			
			if (out !=null) {
				try {
					out.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
