package Java_assignments.HR_arrayAssignment2;

public class array9080_ex07 {
    public static void main(String[] args) {
        int[][] pascalArray = new int[6][6];
        pascalArray[0][0]=1;

        for(int i =1;i<5;i++){
            pascalArray[i][0] =1;
            pascalArray[i][i]=1;
            for(int j=1; j<i+1;j++){
                pascalArray[i][j]=pascalArray[i-1][j]+pascalArray[i-1][j-1];
            }
        }

        for(int i =0;i<5;i++){

            for(int j=0; j<pascalArray[i].length;j++){
                if(pascalArray[i][j]!=0) {
                    System.out.printf("%d ", pascalArray[i][j]);
                }
            }
            System.out.println();
        }
    }
}
