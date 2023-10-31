import java.util.LinkedList;
import java.util.HashSet;

public class Conjunto{
    public static int[] elementos_unicos_int(int[] valores){
        // valores= 10,9,9,7,9,10,7,8
        // unicos= 10,9,8,7 ordem nao importa...
        int[] unicos;
        int i;
        HashSet conjunto = new HashSet<Integer>();
        for(i=0;i<valores.length;i++){
            conjunto.add(valores[i]);
        }

        unicos= new int[conjunto.size()];
        for(Integer u : conjunto){
            unicos[i]= u;
            i++;
        }

        return unicos;
    }
    public static void main(String[] args){
 
        int i;
        int[] valores= {10,9,9,7,9,10,7,8};
        int [] unicos= elementos_unicos_int(valores);


        System.out.println("valores: [ ");
        for(i=0; i<valores.length;i++){
            System.out.printf("%d ", valores[i]);
        }
        System.out.println("]");
        System.out.println("Elementos unicos: [ ");
        for(i=0;i<unicos.length;i++){
            System.out.printf("%d ",unicos[i]);
        }
        System.out.println("]");

    }
}