package metiers;

import java.util.Date;

public class Taches {

    private int id;
    private String createur;
    private String description;
    private Date date;
    private String status;
    private String resolution;

    //private ArrayList<Taches> listTask = new ArrayList<>();

    public Taches(int id, String createur, String description, Date date, String status, String resolution){
        this.id = id;
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = status;
        this.resolution = resolution;
    }


}
