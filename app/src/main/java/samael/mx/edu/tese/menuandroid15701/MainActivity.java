package samael.mx.edu.tese.menuandroid15701;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion1:
                textView.setText(String.format(getString(R.string.MenuMensajeItems), item.getTitle()));
            break;
            case R.id.opcion2:
                textView.setText(String.format(getString(R.string.MenuMensajeItems), item.getTitle()));
                break;
            case R.id.opcion3:
                textView.setText(String.format(getString(R.string.MenuMensajeItems), item.getTitle()));
                break;
            case R.id.opcion4:
                textView.setText(String.format(getString(R.string.MenuMensajeItems), item.getTitle()));
                break;
            case R.id.opcion5:
                textView.setText(String.format(getString(R.string.MenuMensajeItems), item.getTitle()));
                break;

        }
    return super.onOptionsItemSelected(item);

    }
}
