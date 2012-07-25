package fr.scherrda.android.tuto;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import fr.scherrda.android.tuto.list.ListDocumentsActivity;

public class MainActivity extends Activity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        // TODO Auto-generated method stub

        super.onCreate(savedInstanceState);



        Intent intent = new Intent(getApplicationContext(),                   ListDocumentsActivity.class);

        startActivity(intent);

    }

}