import java.util.HashMap;

public class NumberOfElementsInIntersection {
    public static int numberOfElementsInIntersection(int arr1[], int arr2[], int n , int m){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr1[i],true );
        }
        int count = 0;
        for(int i=0; i<m; i++){
            if(map.containsKey(arr2[i])){
                count++;
                map.remove(arr2[i]);
            }
        }return count;
    }

    public static void main(String[] args) {

    }
}
