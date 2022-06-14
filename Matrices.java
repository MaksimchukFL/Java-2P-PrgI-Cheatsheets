public class Matrices {

    public static void main(String[] args) {
	/*Declaración de una matriz vacía. <tipodedato> [][] <nombre>=new <tipodedato> [i][j]; siendo i el número
	de filas de la matriz y j el número de columnas. */
        int [][] matrizvacia=new int[3][3];
    /*Declaraciòn de una matriz inicializada. <tipodedato> [][] <nombre>={elementos}; dandole directamente
    formato a los elementos. */
        int [][] identidad={{1,0,0},
                            {0,1,0},
                            {0,0,1}};
    //Imprimimos una matriz con for anidados y dándole formato en pantalla:
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            System.out.print(identidad[i][j]+" ");
        }
        System.out.println(" ");
    }
    }
}
