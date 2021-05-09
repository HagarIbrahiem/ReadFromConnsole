import java.io.*; 

public class main {
    
    public static void main(String[] args) {
       ReadConsole();
    }
 
    public static void ReadConsole (){
        try {
            
            //read from console
            InputStreamReader _InputStreamReader=new InputStreamReader(System.in); 
            BufferedReader _BufferedReader=new BufferedReader(_InputStreamReader);
            
            //write in file
            FileWriter _FileWriter = new FileWriter("D:\\JavaConsolOutput.txt");
            BufferedWriter _BufferedWriter = new BufferedWriter(_FileWriter);
          
            String data="";
            
            do{
                System.out.println("Enter Data");
                data =_BufferedReader.readLine();
                System.out.println("Data is : "+data);
                //writeinfile
                _BufferedWriter.write(data +"\n"); 
            }while (!data.equals("stop"));
            
               _BufferedWriter.close();
            System.out.println("Success");
        } 
        catch (IOException ex) {
            System.err.println("Error" + ex.getMessage());
        }
    }

    
} 