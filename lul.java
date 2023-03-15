import java.util.Scanner;
public class lul{
    public static void main(String  args[]){
        xd myXd = new xd();
        System.out.println("seleccione el numero del mes: ");
        Scanner sc = new Scanner(System.in);
        myXd.mes = Integer.valueOf(sc.nextLine());
        System.out.println(sc);
        while(myXd.mes < 12){
            
            myXd.mes++;
        }
    }
}
