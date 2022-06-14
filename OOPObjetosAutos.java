public class OOPObjetosAutos {
    public static void main(String[] args) {
        //Definiremos tres objetos en base a la clase OOPClaseAuto que modelan vehículos en la realidad.
        OOPClaseAuto a1=new OOPClaseAuto();
        a1.marca="Toyota";
        a1.modelo="Hilux";
        a1.color="Gris";
        a1.cantpuertas=4;
        a1.encender();

        OOPClaseAuto a2=new OOPClaseAuto();
        a2.marca="Mercedes Benz";
        a2.modelo="New Actros";
        a2.color="Azul";
        a2.cantpuertas=2;
        a2.apagar();

        OOPClaseAuto a3=new OOPClaseAuto();
        a3.marca="Scania";
        a3.modelo="S High Roof";
        a3.color="Negro";
        a3.cantpuertas=2;
        a3.encender();
    }
}
