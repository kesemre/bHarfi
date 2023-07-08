public class Main {
    public static void main(String[] args) {
        String list [][] = new String[7][5];
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list[i].length;j++){
                if (j==0){
                    list[i][j]=" * ";
                }
                else if((i==0 && j!=4)||(i==3 && j!=4)||(i==6 && j!=4)) {
                    list[i][j]=" * ";
                } else if ((i == 1 || i == 2 ||i==4 ||i==5) && j == 4) {
                    list[i][j]=" * ";


                } else {list[i][j] = "   ";}
            }
        }
        for (String row[]: list){
            for (String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}