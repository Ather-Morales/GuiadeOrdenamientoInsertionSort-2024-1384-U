

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Metodo de ordenamiento por insercion");

        int[] arr = {19, 11,20, 34 ,1};

        System.out.println("Arreglo original");
        for (int num : arr) {
            System.out.println(num+"");
        }

        System.out.println();

        System.out.println("========================");

        insertionSort(arr);//Llamada al metodo

        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.println(num+"");
            
        }


    }

    public static void insertionSort(int[] arr){

        int n= arr.length;

        for (int i=1; i < n; i++) {
            int key = arr[i]; //Seleccionamos el elemento a insertar en su posicion correcta

            int j= i-1;
            /*movemos los elementos mayores que key a una posicion adelante de su posicion actual
             */
            
             while (j >= 0 && arr[j] > key) {

                arr[j+1]= arr[j];
                j--;
        
                
             }

             arr[j+1]= key; //insertmos key en su posicion correcta

        }



    }


}
