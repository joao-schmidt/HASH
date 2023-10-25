import java.util.Scanner;
import java.util.HashMap;

public class Rato{

    public static void main(String[] args) {
        //o rato roeu a roupa do outro rato que era rei e usava muita roupa que outro rato tambem roeu na rua dos ratos na cidade que era conhecida por ter muito rato, chamada de ratatopolis, outro rato roeu a roupa de outro rato.

        // Scanner entrada = new Scanner(System.in);
        // 
        // texto= entrada.nextLine();
        // entrada.close();
        String texto="o rato roeu a roupa do outro rato que era rei e usava muita roupa que outro rato tambem roeu na rua dos ratos na cidade que era conhecida por ter muito rato, chamada de ratatopolis, outro rato roeu a roupa de outro rato";
        int i;

        String[] palavras = texto.split(" ");
        
        HashMap<String, Integer>base = new HashMap<String, Integer>();
        // base.put("cascavel",45);
        // base.put("Cascavel", 0);
        // base.put("Sao Paulo", 11);
        // base.put("Alto Piquiri", 44);

        for( i=0;i<palavras.length;i++){
           if(base.containsKey(palavras[i]))
            base.put(palavras[i], base.get(palavras[i])+1);
        else{
            base.put(palavras[i],1);
            }
        }
        for(String palavra: base.keySet()){
            System.out.printf("%S : %d\n",palavra,base.get(palavra));
        }

        // base.put("Cascavel", 45);
        // base.put("Cascavel", 0);
        // base.put("Sao Paulo", 11);
        // base.put("Alto Piquiri", 44);
        // System.out.printf("Esta vazio?  %b\n", base.isEmpty());
        // System.out.printf("Contem Cascavel %b\n", base.containsKey("Cascavel"));
        // System.out.printf("Contem Foz do Iguacu? %b\n", base.containsKey("Foz do iguacu"));
        // System.out.printf("Cascavel: %d\n", base.get("Cascavel"));

    }

}