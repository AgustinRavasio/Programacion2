public class Persona {

        private String Nombre;
        private int Edad;

        public Persona(String Nombre, int Edad) {

            this.Nombre = Nombre;
            this.Edad = Edad;
        }

       public String Descripcion() {
           return Nombre + " tiene " + Edad + " años";
       }

}
