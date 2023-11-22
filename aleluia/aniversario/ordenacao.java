public class ordenacao {

    public static void troca(int[] vetor, int pos_a,int pos_b){
        int aux= vetor[pos_b];
        vetor[pos_b]= vetor[pos_a];
        vetor[pos_a]=aux;
    }

    public static void ordenacao10(){ //errado cipa
        int [] valores = new int[]{94,27,32,46,8,0};
        int i, tamanho = valores.length,aux,j;
        
        for(j=0;j<valores.length-1;j++){
            for(i=0;i<tamanho-1;i++){
                if(valores[i]>valores[i+1]){
                    troca(valores,j, j+1);
                }
                
            }
            tamanho--;
        }
        for(i=0; i<valores.length;i++){
            System.out.println(valores[i]);
        }

    }
    
    public static void ordenacao1(){ //errado cipa
        int [] valores = new int[]{94,27,32,46,8,0};
        int i, tamanho = valores.length,maior,j;

        for(j=0;j<valores.length;j++){
            for(i=0;i<tamanho-1;i++){
                if(valores[i]>valores[i+1]){
                    maior= valores[i+1];
                    valores[i+1]= valores[i];
                    valores[i]=maior;
                }
                
            }
            tamanho--;
        }
        for(i=0; i<valores.length;i++){
            System.out.println(valores[i]);
        }

    }

    public static void Orenacao2(){
        int [] valores = new int[]{94,27,32,46,8,0};
        int i,j, tamanho = valores.length,aux;

        for(i=0;i<valores.length;i++){
            for(j=0;j<valores.length-1-i;j++){
                if(valores[j]>valores[j+1]){
                    aux= valores[j+1];
                    valores[j+1]= valores[j];
                    valores[j]= aux;
                }
            }
        }
        for(i=0; i<valores.length;i++){
            System.out.println(valores[i]);
        }
    }
    

    public static void InsertSort(){
       int i,j;
       int [] valores = new int[]{94,27,32,46,8,0};
       
        if(valores.length>1){
            for(i=1;i<valores.length;i++){
                j=i;
                while (valores[j]<valores[j-1] && j>0) {
                    troca(valores, j, j-1);
                    j--;
                }
            }
        }
        for(i=0; i<valores.length;i++){
            System.out.println(valores[i]);
        }



    }
    public static void main(String[] args) {
       InsertSort();
    }

}
