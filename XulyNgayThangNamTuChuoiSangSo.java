import java.text.SimpleDateFormat;  
import java.util.Date;  
public class StringToDateExample1 {  
public static void main(String[] args)throws Exception {  
    String sDate1="1/1/2002";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+" => "+date1); 
    }  
}  