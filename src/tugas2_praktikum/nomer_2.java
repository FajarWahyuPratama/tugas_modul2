package tugas2_praktikum;
public class nomer_2 {
    public static void main(String[] args){
        int[][] a= {
            {10,20},
            {30,40},
            {50,60}
        };
        int[][] b= {
            {7,8},
            {9,10},
            {11,12}
        };
        if((a.length == b.length) && (a[0].length == b[0].length)){
            int[][] c = new int[a.length][a[0].length];
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
            for(int i=0; i<c.length; i++){
                for(int j=0; j<c[0].length; j++){
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("Fajar wahyu pratama");
    }
}
