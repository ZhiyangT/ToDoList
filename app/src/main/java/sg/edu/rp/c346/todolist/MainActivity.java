package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<AndroidVersion> altoDoList;
    ArrayAdapter aaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.ListViewToDo);

        altoDoList = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("MSA", "1/7/2019");
        AndroidVersion item2 = new AndroidVersion("Go for haircut", "22/9/2019");

        altoDoList.add(item1);
        altoDoList.add(item2);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.to_do, altoDoList);
        lvToDo.setAdapter(adapter);
    }
}
