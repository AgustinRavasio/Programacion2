public class Main {

    public static void main(String[] args) {

        Persona p = new Persona("JUAN", 23);
        Perro perro = new Perro("LOLO", 11);


        int edadperruna = perro.RetornarEdad();
        System.out.println(edadperruna);

        String  descripcion = p.Descripcion();
        System.out.println(descripcion);




    }

}