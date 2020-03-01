package domaine;

import metiers.Taches;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionTaches implements IGestionTaches{

    private List<Taches> listTask = new ArrayList<>();

    @Override
    public void createTask(String createur, String description, Date date, String status, String resolution) {
        int newId = listTask.size()+1;
        Taches nouvelleTache = new Taches(newId, createur, description, date, status, resolution);
        listTask.add(nouvelleTache);
        System.out.println("ID de votre nouvelle tâche : " + newId);
    }

    @Override
    public void cancelTask(int id, String status) {
        for(int i=0; i<listTask.size(); i++){
            if()
        }
    }

    @Override
    public void dateUpdateTask(int id, Date date) {

    }

    @Override
    public void seeTask(int id) {

    }
}
