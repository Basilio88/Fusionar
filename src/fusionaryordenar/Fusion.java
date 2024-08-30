
package fusionaryordenar;

public class Fusion {
     public static int[] fusionarYOrdenar(int[] nums1, int[] nums2) {
        int[] fusionado = new int[nums1.length + nums2.length];
        
        // Índices para recorrer ambos arreglos
        int i = 0; // Índice para nums1
        int j = 0; // Índice para nums2
        int k = 0; // Índice para el arreglo fusionado
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                fusionado[k++] = nums1[i++];
            } else {
                fusionado[k++] = nums2[j++];
            }
        }
        
        while (i < nums1.length) {
            fusionado[k++] = nums1[i++];
        }
        
        while (j < nums2.length) {
            fusionado[k++] = nums2[j++];
        }
        
        return fusionado;
    }
}
