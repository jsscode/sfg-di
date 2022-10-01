package com.springframework.pets;

/**
 * @author codejss
 */
public class PetServiceFactory {

    public PetService getPetService(String petType){

        switch (petType){
            case "dog":
                return new DogPetService();

            case "cat":
                return  new CatPetService();

            default:
                return new DogPetService();
        }

    }
}
