public class Herencia30septJava {

    public static void main(String[] args) {
       
        Animal animal1 = new Animal();
        animal1.setEspecie("mamifero");
        System.out.println(animal1.getEspecie());
        animal1.comer();
        animal1.dormir();
        Perro perro1 = new Perro();
        perro1.setEspecie("mamifero");
        perro1.setRaza("pitbull");
        
        perro1.setRaza("pibull");
        perro1.hacer_sonido();
        perro1.comer();
        perro1.dormir();



public class Animal {
    String especie;
    
    public Animal(){
        
    }

    public String getEspecie() {
        return especie;
    }

 class Perro extends Animal {
       
        private String raza;

        public Perro() {
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }
        public void hacer_sonido(){
            System.out.println("el perro ladra");
        }
        
    
}


    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void comer (){
       System.out.println("el animal  de especie:" + this.especie + "come todo los dias");
    }
    public void dormir(){
        System.out.println("el animale esta durmiendo");
        
    }
 
    }
    
       
    }
}
