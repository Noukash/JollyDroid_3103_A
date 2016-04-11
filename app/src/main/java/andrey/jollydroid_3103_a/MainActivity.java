package andrey.jollydroid_3103_a;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView MyRecyclerView;
        MyRecyclerView = (RecyclerView) findViewById(R.id.MyRecyclerView);
        MyRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        MyRecyclerView.setAdapter(new Adapter(this));
    }
}
