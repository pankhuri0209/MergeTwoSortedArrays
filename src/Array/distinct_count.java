package Array;

public class distinct_count {
    static int remove_duplicate(int A[],int N){
        // code here
        // code here
        int index=0;
        for(int i=0;i<N-1;i++)
        {
            if(A[i]==A[i+1])
            {continue;}
            else
            {
                A[index++]= A[i];
            }
        }
        A[index]= A[N-1];
        return index+1;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{4, 2, 4, 5, 2, 3, 3, 1};
        remove_duplicate(arr,arr.length);
    }
}
