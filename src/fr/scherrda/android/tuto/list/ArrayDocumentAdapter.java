package fr.scherrda.android.tuto.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import fr.scherrda.android.tuto.R;
import fr.scherrda.android.tuto.list.model.Document;

import java.util.List;


public class ArrayDocumentAdapter extends ArrayAdapter {
    List<Document> mDocuments;
    LayoutInflater mInflater;



    static class ViewHolder {
        public TextView nameView;
        public TextView sizeView;
        public ImageView iconeView;
    }


    /**
     * Constructeur
     */
    public ArrayDocumentAdapter(Context context, List<Document> documents) {
        super(context, R.layout.row_list, documents);
        this.mDocuments = documents;
        mInflater = LayoutInflater.from(context);
    }



    @Override

    public View getView(int position, View convertView, ViewGroup parent) {



        ViewHolder holder;

        View rowView = convertView;

        if (rowView == null) {
            //création de l’objet View à partir de la ressource Layout
            rowView = mInflater.inflate(R.layout.row_list, null);



            holder = new ViewHolder();
            holder.nameView = (TextView) rowView.findViewById(R.id.name);

            holder.sizeView = (TextView) rowView.findViewById(R.id.size);

            holder.iconeView = (ImageView) rowView.findViewById(R.id.icon);

            rowView.setTag(holder);
        }else {
            holder = (ViewHolder) rowView.getTag();
        }


        //récupération du document identifié par sa position dans la liste
        Document document = mDocuments.get(position);


        //Valorisation du Texte1 de la Vue avec le nom du document
        holder.nameView.setText(document.getName());



        //Valorisation du Texte2 avec la taille du document
        holder.sizeView.setText(String.valueOf(document.getSize()) + "Ko");



        //Affichage de l’icône correspondante
        holder.iconeView.setImageResource(document.getIcone());



        return rowView;
    }
}
