class Solution{
    public static void hollow_rectangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totCols; j++) {
                if(i==1 || i==totRows || j==1 || j==totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {  
        int n1 = 7, n2 = 5; 
        hollow_rectangle(n1, n2);  
    }  
}  