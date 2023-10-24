import java.util.Scanner;
import java.util.HashMap;

public class Teste{



    public static void main(String[] args) {

        HashMap<String, String> capitais = new HashMap<String,String>();

      

        capitais.put("Parana","Curitiba");
        capitais.put("Santa Catarina", "Florianopolis");
        capitais.put("Rio Grande do Sul","Porto Alegre");
        capitais.put("Rio de Janeiro","Rio de Janeiro");
        capitais.put("Amazonas","Manaus");
        capitais.put("Amapa","Macapa");
        capitais.put("Goias","Goiania");
        //System.out.println(capitais.get("Santa Catarina"));
        
        for(String i: capitais.keySet()){
            System.out.println(i+" : "+ capitais.get(i));
        }
    }
}