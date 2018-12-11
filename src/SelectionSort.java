
public class SelectionSort {


	public void Selection (int entrada[]) {

		int i, j, imin, aux =0;

		for (i = 0;  i < entrada.length ; i++) {
			imin =i;
			
			for (j= i +1 ; j < entrada.length; j++) {
				if(entrada[j]< entrada[imin])
					imin=j;

			}

			if(imin !=i) {
				aux = entrada[imin];
				entrada[imin]=entrada[i];
				entrada[i]= aux;
			}



		}

		for (int x = 0; x < entrada.length; x++) {
			System.out.println(entrada[x]);
		}



	}
}


