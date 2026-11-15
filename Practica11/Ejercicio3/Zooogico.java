package Practica11.Ejercicio3;
import java.util.ArrayList;

public class Zooogico {

    private ArrayList<Animal> animales;
    private ArrayList<Ave> aves;
    private ArrayList<Mamifero> mamiferos;
    private ArrayList<Reptil> reptiles;

    public Zooogico() {
        animales = new ArrayList<>();
        aves = new ArrayList<>();
        mamiferos = new ArrayList<>();
        reptiles = new ArrayList<>();

    }

    public void añadirAnimal(Animal animal) {
        animales.add(animal);

        if (animal instanceof Ave) {
            aves.add((Ave) animal);
        } else if (animal instanceof Mamifero) {
            mamiferos.add((Mamifero) animal);
        } else if (animal instanceof Reptil) {
            reptiles.add((Reptil) animal);
        }

        System.out.println("Animal añadido al zoológico: " + animal.getNombre());
    }

    public boolean animalBuscar(String nombre) {
    for (int i = 0; i < animales.size(); i++) {
        Animal a = animales.get(i);
        if (a.getNombre().equalsIgnoreCase(nombre)) {
            animales.remove(i);
            aves.remove(a);
            mamiferos.remove(a);
            reptiles.remove(a);
            System.out.println("Animal eliminado del zoológico: " + nombre);
            return true;
        }
    }
    System.out.println("No se encontró en el zoológico: " + nombre);
    return false;
}

    public void mostrarZoologico() {
        System.out.println("Animales en el zoológico:");
        for (Animal animal : animales) {
            animal.mostrarInformacion();
        }
    }

    public void mostrarAves() {
        System.out.println("================================");
        System.out.println("Aves en el zoológico:");
        for (Ave ave : aves) {
            if (ave instanceof Animal) {
                ((Animal) ave).mostrarInformacion();
            }
        }
    }

    public void mostrarMamiferos() {
        System.out.println("================================");
        System.out.println("Mamíferos en el zoológico:");
        for (Mamifero mamifero : mamiferos) {
            if (mamifero instanceof Animal) {
                ((Animal) mamifero).mostrarInformacion();
            }
        }
    }

    public void mostrarReptiles() {
        System.out.println("================================");
        System.out.println("Reptiles en el zoológico:");
        for (Reptil reptil : reptiles) {
            if (reptil instanceof Animal) {
                ((Animal) reptil).mostrarInformacion();
            }
        }
    }

    public static void main(String[] args) {
        Zooogico zoologico = new Zooogico();

        BorregoCimarron borrego = new BorregoCimarron("Borrego Cimarrón", "Montañas");
        BisonteAmericano bisonte = new BisonteAmericano("Bisonte Americano", "Praderas");
        LoboCanadiense lobo = new LoboCanadiense("Lobo Canadiense", "Bosques");
        ZorroArtico zorro = new ZorroArtico("Zorro Ártico", "Tundra");
        OsoNegro oso = new OsoNegro("Oso Negro", "Bosques");
        Panda panda = new Panda("Panda", "Bosques");
        CamelloBactriano camello = new CamelloBactriano("Camello Bactriano", "Desierto");
        MonoJapones mono = new MonoJapones("Mono Japonés", "Selvas");
        Jirafa jirafa = new Jirafa("Jirafa", "Savanas");
        CanguroRojo canguro = new CanguroRojo("Canguro Rojo", "Bosques");
        PavoReal pavo = new PavoReal("Pavo Real", "Bosques");
        Avestruz avestruz = new Avestruz("Avestruz", "Bosques");
        GrullaCoronada grulla = new GrullaCoronada("Grulla Coronada", "Bosques");
        GuajolteNorteño guajolte = new GuajolteNorteño("Guajolte Norteamericano", "Bosques");
        GanzoEgipcio ganzo= new GanzoEgipcio("Ganzo Egipcio", "Bosques");
        Cuervo cuervo = new Cuervo("Cuervo", "Bosques");
        VaranoNilo varano = new VaranoNilo("Varano del Nilo", "Ríos");
        Cincuate cincuate = new Cincuate("Cincuate", "Bosques");
        CulebrillaCiega culebrilla = new CulebrillaCiega("Culebrilla Ciega", "Bosques");
        TortugaOrejasRojas tortuga = new TortugaOrejasRojas("Tortuga de Orejas Rojas", "Bosques");
        // estos son mamiferos
        
        zoologico.añadirAnimal(borrego);
        zoologico.añadirAnimal(bisonte);
        zoologico.añadirAnimal(lobo);
        zoologico.añadirAnimal(zorro);
        zoologico.añadirAnimal(oso);
        zoologico.añadirAnimal(panda);
        zoologico.añadirAnimal(camello);
        zoologico.añadirAnimal(mono);
        zoologico.añadirAnimal(jirafa);
        zoologico.añadirAnimal(canguro);
        
        
        //estos son aves
        
        zoologico.añadirAnimal(pavo);
        zoologico.añadirAnimal(avestruz);
        zoologico.añadirAnimal(grulla);
        zoologico.añadirAnimal(guajolte);
        zoologico.añadirAnimal(ganzo);
        zoologico.añadirAnimal(cuervo);
        
        
        //estos son reptiles
        zoologico.añadirAnimal(varano);
        zoologico.añadirAnimal(cincuate);
        zoologico.añadirAnimal(culebrilla);
        zoologico.añadirAnimal(tortuga);


        zoologico.mostrarZoologico();
        zoologico.mostrarReptiles();
        zoologico.mostrarMamiferos();
        zoologico.mostrarAves();


    }

}



    

