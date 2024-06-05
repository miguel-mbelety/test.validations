package services;

import java.util.List;

import entities.Cours;
import repositories.CoursRepository;

public class CoursService {
    CoursRepository coursRepository=new CoursRepository();

    public void ajouterCours(Cours cours){
        CoursRepository.Insert(cours);
    }

     public List<Cours> listerCours(){
        return coursRepository.selectAll();
    }

    public Cours rechercherParLibelle(String libelle) {
        return coursRepository.selectByLibelle(libelle);
    }
}
