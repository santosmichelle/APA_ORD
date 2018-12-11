
public class InsertionSort {



	public void Insertion(int entrada[]) {

		int i = 0, j, aux =0;


		for ( j = 1; j < entrada.length; j++) {
			aux = entrada[j];
			i= j-1;
			
			while(i >= 0 && entrada[i] > aux) {
			 entrada[i+1] = entrada[i];
                i--;
            }
 
            entrada[i+1] = aux;
			

		}

		for (int x = 0; x < entrada.length; x++) {
			System.out.println(entrada[x]);
		}

	}

}
