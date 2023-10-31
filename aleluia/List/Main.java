import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        
        LinkedList<String> roteiro= new LinkedList<String>();

        LinkedList<String> cidades= new LinkedList<String>();

        boolean jah_existe;
        
        roteiro.add("Cascavel");
        roteiro.add("Toledo");
        roteiro.add("Gramado");
        roteiro.add("Jaragua do Sul");
        roteiro.add("Joinville");
        roteiro.add("Campo Grande");
        roteiro.add("Joinville");
        roteiro.add("Cascavel");
        roteiro.add("Joinville");
        roteiro.add("Guarulhos");

    
        for( String i: roteiro){
            cidades.add(i);
        }

        System.out.printf("foram visitadas %d cidadees distintas.\n", cidades.size());

        // for(String i: roteiro){
        //     jah_existe=false;
        //     for(String j: cidades){
        //         if(i.equals(j)){
        //             jah_existe = true;
        //             break;
        //         }
        //     }
        //     if(jah_existe == false){
        //         cidades.add(i);
        //     }
        // }

     //   System.out.printf("foram visitadas: %d cidades distintas\n", cidades.size());
    }
    
}
