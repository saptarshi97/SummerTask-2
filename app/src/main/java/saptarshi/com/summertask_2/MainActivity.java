package saptarshi.com.summertask_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    final String url="https://qnaxapi.herokuapp.com/memes";
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image=(ImageView)findViewById(R.id.main_image_view);
        Picasso.with(this).load(url).into(image);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    public void reload(MenuItem v){
        Picasso picasso = Picasso.with(this);
        picasso.invalidate(url);
        image=(ImageView)findViewById(R.id.main_image_view);
        picasso.load(url).into(image);
    }
}
