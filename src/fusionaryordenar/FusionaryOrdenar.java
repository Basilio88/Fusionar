
package fusionaryordenar;

import static fusionaryordenar.Fusion.fusionarYOrdenar;

public class FusionaryOrdenar {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};

        int[] resultado = fusionarYOrdenar(nums1, nums2);
        
        System.out.println(java.util.Arrays.toString(resultado));
    }
    
}
