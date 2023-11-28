import javax.xml.validation.Validator;

public class Ordecaçãodois {
    

    public static int countingSxT() {
        int [] v={0,3,2,3,0,1,3,2};
        int[] saida=new int[v.length];
        int i, val,max;
        int[] cont;
        
        
        max=v[0];

        for(i=1;i<v.length;i++){
            if(v[i]>max){
                max=v[i];
            }
            
        }cont= new int[max+1];

        for(i=0;i<v.length;i++){
            val=v[i];
            cont[val]++;
        }

        for(i=1;i<cont.length;i++){
            cont[i]=cont[i]+cont[i];
        }

        for(i=v.length-1;i>=0;i--){
            val=v[i];
            cont[val]--;
            saida[cont[val]]=val;
        }

        System.out.println();
        return max;

        

    }
    public static void main(String[] args) {
      int [] v={0,3,2,3,0,1,3,2};
      countingSxT();
    }
}
