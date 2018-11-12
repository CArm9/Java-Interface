package figure1;
public class Main {
    public static void main(String[] args){
        Dog d = new Dog( );
        DogToy dt = new DogToy( );
        doAnimalcall(d);
        doAnimalcall(dt);
    }
    public static void doAnimalcall(Animal a){
        a.animalcall();
    }
}
