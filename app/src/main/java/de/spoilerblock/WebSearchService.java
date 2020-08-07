package de.spoilerblock;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.app.SearchManager;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class WebSearchService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public WebSearchService(String name) {
        super(name);
    }
    @Override
    protected void onHandleIntent(Intent workIntent) {

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE); // Ein Ausdruck den ich benötige, um "findViewById (R.id.searchkeyword)" anwenden zu können (Wieso kann ich nicht sagen..)
        @SuppressLint("InflateParams") View layout = inflater.inflate(R.layout.activity_main, null);

        EditText keyword = layout.findViewById (R.id.searchkeyword); //Wandelt das eingegebene Keyword in einen String um
        String q = keyword.getText().toString();

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH ); //Startet eine Websuche basierend auf dem ausgegebenen String von den Befehlen zuvor.
        intent.putExtra(SearchManager.QUERY, q);
        workIntent = intent;

        String dataString = workIntent.getDataString();

        //TODO erstelle funktion die dataString, also die zurückgegebenen Daten aus dem Intent (WebSuche des Keywords), auswertet.

    }
}
