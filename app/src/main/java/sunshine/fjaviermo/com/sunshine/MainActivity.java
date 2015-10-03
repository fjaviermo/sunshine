package sunshine.fjaviermo.com.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Hola", "onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Hola", "onPause");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Hola", "onStop");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Hola", "onResume");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Hola", "onStart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Hola", "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
