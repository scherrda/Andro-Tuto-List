package fr.scherrda.android.tuto.list;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import fr.scherrda.android.tuto.R;
import fr.scherrda.android.tuto.list.model.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class ListDocumentsActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private Logger log;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        mListView = (ListView)findViewById(R.id.listdocs);

//getDocuments : fabrique une liste de documents fixe
        List<Document> documents = getDocuments();

//association avec l'adaptateur
        mListView.setAdapter(new ArrayDocumentAdapter(this, documents));

        //l'activité enregistrée comme listener sur le clic d'item
        mListView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        //récupération de l’item sélectionné
        Document document =
                (Document)mListView.getAdapter().getItem(position);

        String name = document.getName();

        //affichage d’un message Toast
        Log.e("HELLO","HELLLLLLOOOOOOO");
        Toast.makeText(this, "Vous avez cliqué sur le document : " + name,
                Toast.LENGTH_LONG).show();
    }


    /**
     * retourne une liste de documents
     */
    private List<Document> getDocuments() {
        List<Document> liste = new ArrayList<Document>();

        Document doc1 = new Document(1, "doc1.doc", 10000, R.drawable.icn_word);
        liste.add(doc1);
        Document doc2 = new Document(2, "MonDocumentPres.ppt", 200000, R.drawable.icn_ppt);
        liste.add(doc2);
        Document doc3 = new Document(3, "unCalcul.xls", 300000, R.drawable.icn_xls);
        liste.add(doc3);
        Document doc4 = new Document(4, "doc4.doc", 150000, R.drawable.icn_word);
        liste.add(doc4);

        return liste;
    }
}
