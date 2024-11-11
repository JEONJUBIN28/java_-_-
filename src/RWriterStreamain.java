import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;





public class RWriterStreamain {	
	
	public static void main(String[] args) throws Exception {	
		
		try(Writer out = new FileWriter("data.txt")){
			out.write('A');
			out.write('한');
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try(Reader in = new FileReader("data.txt")){
		      int ch;
		      
		      while(true) {
		         ch = in.read(); // 문자를 하나씩 읽는다. //2바이트 단위로
		         if(ch == -1) // 더 이상 읽을 문자가 없다면,
		            break;
		         System.out.print((char)ch); // 문자를 하나씩 출력한다.
		      }

			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}	
}