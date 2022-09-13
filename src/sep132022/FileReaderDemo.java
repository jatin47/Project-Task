package sep132022;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        Customer customer = new Customer();


        FileReader file = new FileReader("/home/agent47/Videos/OBS_Vid/Codes/customer.txt");
        

        try{
            BufferedReader in = new BufferedReader(file);
            String s;
        
            while((s = in.readLine()) != null){
        
                String[] var = s.split("~");
                for(int i = 0 ; i <= var.length-1;i++){
                    customer.setId(var[0]);
                    customer.setName(var[1]);
                    customer.setDob(var[2]);
                    customer.setAddress(var[3]);
                    customer.setEmail(var[4]);
                    customer.setMob(var[5]);
                    customer.setAccount(var[6]);
                }
            }
                System.out.println(customer);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        
    }
    // public void read(File file) throws IOException{
    //     Scanner scanner = new Scanner(file);
    
    //     while(scanner.hasNext()){
    //         String[] tokens = scanner.nextLine().split("~");
    //         String last = tokens[tokens.length - 1];
    //         System.out.println(last);
    //     }
    // }
    
}
