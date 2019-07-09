package sg.edu.rp.c346.todolist;

public class AndroidVersion {
    private String ToDO;
    private String date;

    public AndroidVersion(String toDO, String date) {
        ToDO = toDO;
        this.date = date;
    }

    public String getToDO() {
        return ToDO;
    }

    public void setToDO(String toDO) {
        ToDO = toDO;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return ToDO + date ;
    }
}
