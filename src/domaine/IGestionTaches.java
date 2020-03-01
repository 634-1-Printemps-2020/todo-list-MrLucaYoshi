package domaine;

import java.util.Date;

public interface IGestionTaches {

    void createTask(int id, String createur, String description, Date date, String status, String resolution);
    void cancelTask(int id, String status);
    void dateUpdateTask(int id, Date date);
    void seeTask(int id);

}
