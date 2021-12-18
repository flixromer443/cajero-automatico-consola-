package options;
import java.util.Scanner;
import process.payment;
public class Acount {
    public void mostrar(String uid) {
        int res;
        System.out.println("1- caja de ahorro en pesos");
        System.out.println("2- caja de ahorro en dolares");
        Scanner input=new Scanner(System.in);
        int selection=input.nextInt();
        int id;
        switch(selection){
            case 1:
                System.out.println("Caja de ahorro en pesos");
                id=Integer.parseInt(uid);
                res=seleccionar(id,1);
            
            break;
            case 2:
                System.out.println("Caja de ahorro en dolares");
                id=Integer.parseInt(uid);
                res=seleccionar(id,2);
            break;
            default:
                System.out.println("ha ocurrido un error");
            break;    
        }
    }
    private  int seleccionar(int uid,int option){
        Scanner input=new Scanner(System.in);
        int selection;
        int res;
        switch(option){
            case 1:
                System.out.println("1-$1.000");
                System.out.println("2-$1.500");
                System.out.println("3-$2.000");
                System.out.println("4-otro importe");
                selection=input.nextInt();
                if(selection!=4){
                    payment pago=new payment();
                    res=pago.verificar(uid,1,selection);
                    if(res==1){
                        System.out.println("Retire su dinero");
                    }else{
                        System.out.println("No posee fondos suficientes");
                    }
                    
                   
                }else{
                    payment pago=new payment();
                    System.out.println("Ingrese el importe");
                    selection=input.nextInt();
                    res=pago.verificar(uid,1,selection);
                    if(res==1){
                        System.out.println("Retire su dinero");
                    }else{
                        System.out.println("No posee fondos suficientes");
                    }
                }   
            break;
            case 2:
                System.out.println("1-$100");
                System.out.println("2-$150");
                System.out.println("3-$200");
                System.out.println("4-otro importe");
                selection=input.nextInt();
                if(selection!=4){
                    payment pago=new payment();
                    res=pago.verificar(uid,2,selection);
                    if(res==1){
                        System.out.println("Retire su dinero");
                    }else{
                        System.out.println("No posee fondos suficientes");
                    }
                    
                }else{
                    payment pago=new payment();
                    System.out.println("Ingrese el importe");
                    selection=input.nextInt();
                    res=pago.verificar(uid,2,selection);
                    if(res==1){
                        System.out.println("Retire su dinero");
                    }else{
                        System.out.println("No posee fondos suficientes");
                    }
                }    
           break;
        }
        return 0;
    }
   
}
