package de.spoilerblock;

import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            //webSearch();
               //TODO Beim Klicken des Buttons soll eine Websuche gestartet werden.
            }
            /*
            public void webSearch() {
                EditText keyword = findViewById (R.id.searchkeyword); //Wandelt das eingegebene Keyword in einen String um
                String q = keyword.getText().toString();

                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, q);
                startActivity(intent);
            }
            */
        });
    }
}