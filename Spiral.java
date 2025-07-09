import java.util.ArrayList;
import java.util.List;
class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int rowstart=0,colstart=0,rowend=m-1,colend=n-1;
        while(rowstart<=rowend && colstart<=colend){
        for(int col=colstart;col<=colend;col++){
            spiralList.add(matrix[rowstart][col]);
        }
        rowstart++;
        for(int row=rowstart;row<=rowend;row++){
            spiralList.add(matrix[row][colend]);
        }
        colend--;
        if(rowstart<=rowend){
            for(int col=colend;col>=colstart;col--){
            spiralList.add(matrix[rowend][col]);
        }
        rowend--;
        }
        if(colstart<=colend){
            for(int row=rowend;row>=rowstart;row--){
            spiralList.add(matrix[row][colstart]);
        }
        colstart++;
        }
        }
         return spiralList;
    }
}