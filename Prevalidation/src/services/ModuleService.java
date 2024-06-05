package services;

import java.util.List;

import repositories.ModuleRepository;

public class ModuleService {
   ModuleRepository moduleRepository=new ModuleRepository();
   public void ajouterModule(Module module){
        moduleRepository.insert(module);
    }   

    public List<Module> listerModules(){
        return moduleRepository.selectAll();
    }

    public Module rechercherParLibelle(String libelle) {
        return moduleRepository.selectByLibelle(libelle);
    } 
}
