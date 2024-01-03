import java.util.*;

public class unionand_inter {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>hp=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            hp.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            hp.add(arr2[i]);
        }
        System.out.println(hp);
        hp.clear();
        System.out.println(hp);
        //Intersection
        for(int i=0;i<arr1.length;i++)
        {
            hp.add(arr1[i]);
        }
        System.out.println(hp);
        int count=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(hp.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                hp.remove(arr2[i]);
            }
        }
        System.out.println( );
        System.out.println(count);
    }
}
