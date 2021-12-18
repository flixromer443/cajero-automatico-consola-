import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import options.Acount;
public class app{
    private static void validate (String user, String password){
        try{
            File credentials=new File("files/credentials.txt");
            Scanner reader=new Scanner(credentials);
            while(reader.hasNextLine()){
                String data=reader.nextLine();
                String[] user_data=data.split(",");
                String cadena1=user.toUpperCase() + password;
                String cadena2=user_data[1] + user_data[3];
                if(cadena1.equals(cadena2)){
                    System.out.println("usuario: " + user_data[1] +" "+ user_data[2] );
                    Acount user_acount= new Acount();
                    String uid=user_data[0];
                    user_acount.mostrar(uid);
                    break;
                }
            }
            
        }catch(FileNotFoundException e){
            System.out.println("ha ocurrido un error");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.println("Presione un boton para continuar");
        input.nextLine();
        
        System.out.println("Ingrese su nombre de usuario: ");
        String user=input.nextLine();
        System.out.println("Ingrese su clave(4 digitos): ");
        String password=input.nextLine();
        validate(user, password);
        
    }
}