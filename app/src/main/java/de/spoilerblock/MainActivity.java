package de.spoilerblock;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab); //Run-button in the App
        fab.setOnClickListener(new View.OnClickListener() { //Set the "fab" Button to a OnClickListener

            // Start the Program "webSearch"
            @Override
            public void onClick(View view) {
                webSearch();
            }

            // Do a Google request for the Text in the "searchkeyword" Box
            @SuppressLint("SetTextI18n")
            public void webSearch() {
                EditText keyword = findViewById(R.id.searchkeyword);
                String q = keyword.getText().toString(); //Wandelt das eingegebene Keyword in einen String um
                TextView leereZeile = findViewById(R.id.textWarning); //Die TextView "leereZeile" hat die ID = "textWarning"
                GetJsonData JsonData = new GetJsonData();


                if (q.equals("")) {                                    //Wenn der Text/String im Feld "keyword" leer ist, soll die TextView "leereZeile" angezeigt werden!
                    leereZeile.setVisibility(View.VISIBLE);
                }
                if (!q.equals("")) {                                    //Wenn der Text/String im Feld "keyword" nicht leer ist, soll die TextView "leereZeile" nicht angezeigt werden!
                    leereZeile.setVisibility(View.INVISIBLE);
                } else {
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                    intent.putExtra(SearchManager.QUERY, q);
                    startActivity(intent);
                }
            }
        });
    }
}

