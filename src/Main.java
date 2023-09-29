public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name ="Lion";
        lion.age=2;

        Zoo myZoo = new Zoo(20,"myZoo","Tunis");
        Zoo myZoo2 = new Zoo(40,"myZoo2","Ariana");
        Animal a = new Animal("Chat","c",2,true);
        //  System.out.println(myZoo.name);
        //  myZoo.displayZoo();
       /* System.out.println("nbCages :"+myZoo.nbrCages);
        System.out.println("nbCages 2 :"+myZoo2.nbrCages);
        System.out.println(myZoo.nbrCages);*/
        myZoo.addAnimal(a);
        myZoo.addAnimal(lion);
        System.out.println(myZoo.searchAnimal(a));
        System.out.println(myZoo.searchAnimal(lion));
        System.out.println(myZoo.searchAnimal(new Animal("vhfvbhfbv")));

        //System.out.println(myZoo.nbranimal);

        myZoo.addAnimal(a);
        // System.out.println(myZoo.removeAnimal(new Animal("Lion")));
        System.out.println("myZoo :"+myZoo.nbranimal);
        // System.out.println(myZoo.searchAnimal(new Animal("Dog")));
        myZoo2.addAnimal(lion);
        System.out.println("myzoo2 "+myZoo2.nbranimal);

        System.out.println("Total :" +Zoo.nbTotalAnimals);
        System.out.println(myZoo.comparerZoo(myZoo2,myZoo));

    }
}