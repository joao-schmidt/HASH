public class QuickSort{

public static int particionamento(int[] v, int ini, int fim){
    int i,j;
    int pos_piv=ini;

    for(i=ini;i<fim; i++){

        }
       
    }
    public static void troca(int[] v, int a,int b){
        int aux= v[b];
        v[b]= v[a];
        v[a]=aux;
        }
    
    
    public static void QuickSort(int[] v){
        quickSort(v, 0,v.length-1);

    }


    public static void quickSort(int[] v, int ini, int fim){
       
        if (ini<fim){
        int pos_piv = particionamento(v, ini, fim);
        quickSort(v, ini, pos_piv-1);
        quickSort(v, pos_piv+1, fim);
        }
    }
    public static int[] merge(int[] va, int[] vb){
        int[] vc;
        int i=0,j=0,k=0,tam;
        
        tam= va.length+vb.length;

        if(va.length==0)return vb;
        if(vb.length==0) return va;
        vc= new int[tam];

        while(k<tam){
            if(i<va.length && j< vb.length){
                if(va[i]<=vb[j]){
                    vc[k]=va[i];
                    i++;
                }else{
                    vc[k]=vb[j];
                    j++;
                }
            }else{
                if(i>=va.length){
                    vc[k]= vb[j];
                    j++;
                }else{
                    vc[k]= va[i];
                    i++;
                }
            }
            k++;
        }
        
        
        return vc;
        
    }

    public static int[] mergeSort(int[]v){
        int[] vr, ve ,vd;
        int meio,i;
        
        if(v.length<2){
            return v;
        }

        meio= v.length/2;

        ve = vetor_sub(v, 0, meio);
        vd = vetor_sub(v, meio, v.length);

        vr = merge(mergeSort(ve), mergeSort(vd));

        // System.out.printf("meio: %d ", meio);
        // for(i=0;i<ve.length;i++){
        //     System.out.printf("asfsaf", ve[i]);

        //}
        return vr;
    }
    public static int[] vetor_sub(int[]v,int ini,int fim){
        int[] vr = new int[fim-ini];
        int i,k=0;
       
        for(i=ini;i<fim;i++){
            vr[k]=v[i];
            k++;
        }


        return vr;   
    }



    public static void main(String[] args) {
        
    }
}