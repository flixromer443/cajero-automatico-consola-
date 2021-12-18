package process;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class payment {
    public int verificar(int id, int acount,int mount){
        
        try{    
            File credentials=new File("files/money.txt");
            Scanner reader=new Scanner(credentials);
            while(reader.hasNextLine()){
                String data=reader.nextLine();
                String[] user_data=data.split(",");
                String uid=Integer.toString(id);
                int saldo;
                if(user_data[0].equals(uid)){
                    if(acount==1){
                       switch(mount){
                           case 1:
                              mount=1000;
                           break; 
                           case 2:
                              mount=1500;
                           break;  
                           case 3:
                              mount=2000;
                           break;
                       }
                       saldo=Integer.parseInt(user_data[1]);
                       if(mount>saldo){
                            return 0;
                       }else{
                           return 1;
                       }
                    }else{
                        switch(mount){
                            case 1:
                               mount=100;
                            break; 
                            case 2:
                               mount=150;
                            break;  
                            case 3:
                               mount=200;
                            break;
                        }
                        saldo=Integer.parseInt(user_data[2]);
                        if(mount>saldo){
                             return 0;
                        }else{
                            return 1;
                        }
                    }
                    
                    
                }
                break;
            }

        }catch(FileNotFoundException e){
            System.out.println("Lo sentimos pero ha ocurrido un error");
        }
        return 0;
    }
}
