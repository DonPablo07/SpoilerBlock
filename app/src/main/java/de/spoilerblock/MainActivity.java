package de.spoilerblock;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
                webSearch();
            }

            @SuppressLint("SetTextI18n")
            public void webSearch() {
                EditText keyword = findViewById(R.id.searchkeyword);
                String q = keyword.getText().toString(); //Wandelt das eingegebene Keyword in einen String um
                TextView leereZeile = findViewById(R.id.textWarning);

                if (q.equals("")) {
                    leereZeile.setVisibility(View.VISIBLE);
                }
                if (!q.equals("")) {
                    leereZeile.setVisibility(View.INVISIBLE);
                }
                else {
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                    intent.putExtra(SearchManager.QUERY, q);
                    startActivity(intent);
                }
            }
        });
    }
}