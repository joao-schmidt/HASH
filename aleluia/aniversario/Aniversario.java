import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;
import java.lang.Math;
public class Aniversario{

   public static int randomInt( int min, int max){
    return(int)((Math.random())*(max-min)+min);
   }

    public static void main(String[] args) {

    int np=23;
    int n=1000;
    int i,j;
    int repetidos=0;  
    float prob;

    HashSet<Integer> datas = new HashSet<Integer>();

    for(i=0;i<n;i++){
        for(j=0;j<np;j++){
            datas.add(randomInt(0, 364));
        }
        if(datas.size()<np){
            repetidos++;
        }
       
        datas.clear();

        
    }
    prob=(100 * repetidos)/n;
        System.out.printf(" chance de repetor = %.2f\n", prob);


    }
}