public class OrdenacaoReal {
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

        // }
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
        int i;
        int[] v1={12,10,9,11,13,15,17};
        //int[] v1={5,7,9,11,13,15,17};
        int[] vr = mergeSort(v1);
        //int[]v2={6,10,12,15};

        // int[] res= merge(v1, v2) ; 
        // for(i=0;i<res.length;i++){
        //     System.out.printf("%d\n", res[i]);
        // }
        // System.out.println();


        //int[] vr = vetor_sub(v1, 3, 5);
        for(i=0;i< vr.length; i++){
            System.out.printf("%d ", vr[i]);
        }
        System.out.println();
    }
    
}
