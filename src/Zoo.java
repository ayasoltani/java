import java.util.List;

public class Zoo {
    Animal [] animals;
    String name;
    String city;
     final int nbrCages=25;//howa taill de tab et chaque animal est dans un cage
    static  int  nbTotalAnimals;

    int nbranimal;
    // fi tab nal9ach plusieurs types
    public Zoo( int nbrCages,String name,String city){
        this.animals= new Animal[nbrCages];
        this.name=name;
        this.city=city;
        //this.nbrCages=nbrCages;
    }

    public void displayZoo(){
      System.out.println("le cages est " + nbrCages + " est " + animals.length + " de " + name +" de "+ city );

}
@Override // cest une anotation maneha lmethode bch namlilha redefinition
public String toString(){
        String s="Name :"+name+"\n"+"city"+city+"\n"+"cage"+nbrCages;
       String r="";
       for(int i=0;i<nbranimal;i++){
           r+=animals[i].toString();
       }
       return s+r;
}
    public boolean addAnimal(Animal animal) {
        if(nbranimal<nbrCages && searchAnimal(animal)== -1){
                animals[nbranimal] = animal;
                nbranimal++;//bch kn nzid animal yekhou ejdid
                nbTotalAnimals++;
                return true;
            }

        return false;
    }

public int searchAnimal(Animal animal){
        for (int i = 0; i < nbranimal; i++) {
            if (animals[i].name == animal.name) {

                return i;
            }
        }
        return -1;
}
   // Ajouter un animal une seule fois (un animal est unique ) dans un zoo
//● Interdire de dépasser le nombre maximal d’animaux dans un zoo
    public int searchAnimal2(Animal animal){
        int j,i = 0;
        while(animals[i] != animal)
            for ( i = 0; i < animals.length; i++) {
                if (animals[i] == animal) {
                    j=i;
                    return j;
                }
            }
        return -1;
    }
    /*Créez la méthode “boolean removeAnimal(Animal an)” qui permet de supprimer un
    animal et de renvoyer le succès de la suppression.*/
    public boolean removeAnimal(Animal an) {
        int index=searchAnimal(an);
        if (index ==-1){
            return false;
        }
        else{
            for (int i = index; i < nbranimal-1; i++) {
                 animals[i] = animals[i+1];
            }
            nbranimal--;
            nbTotalAnimals--;
            animals[nbranimal]=null;
            return true;

        }
    }
    public boolean isZooFull(){
        if(nbranimal==nbrCages ){
            return true;
        }
        return false;
    }
    public Zoo comparerZoo(Zoo z1,Zoo z2){
        if(z1.nbranimal>z2.nbranimal){
            System.out.println("ok");

            return z1;
        }
        System.out.println("non");

        return z2;
    }


}



