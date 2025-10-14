package PracticaPag26;

public class Practica36 {
    
        public static void incre(int n){
            if(n>0){
                incre(n-1);
                System.out.print(n);
            }
            else
            System.out.println();
        }
        
    }
    

