package metiers;

import java.util.Date;
import java.util.Objects;

public class Taches {

    private int id;
    private String createur;
    private String description;
    private Date date;
    private String status;
    private String resolution;

    public Taches(int id, String createur, String description, Date date, String status, String resolution){
        this.id = id;
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = status;
        this.resolution = resolution;
    }

    public int getId() {
        return id;
    }

    public void setStatus(String message){
        this.status = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString() {
        return "Taches{" +
                "id=" + id +
                ", createur='" + createur + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taches taches = (Taches) o;
        return id == taches.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
