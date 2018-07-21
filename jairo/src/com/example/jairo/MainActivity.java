package com.example.jairo;

import java.util.ArrayList;
import java.util.List;

import com.example.jairo.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listView;
    List<String> listadenombres;
    List<String> listadeedad;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView) findViewById(id.listView1);
        
        //dats para mostrar en mi listas
        listadenombres = new ArrayList<String>();
        listadeedad = new ArrayList<String>();
        
        
        listadenombres.add("leo");
        listadeedad.add("24");
        listadenombres.add("jose");
        listadeedad.add("20");
        listadenombres.add("manuel");
        listadeedad.add("14");
        listadenombres.add("cesar");
        listadeedad.add("34");
        listadenombres.add("carlos");
        listadeedad.add("14");
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,listadenombres);
        
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> AdapterView, View view, int position,long id) 
			{
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this,"usuario seleccionaste a "+listadenombres.get(position)+" su edad es "+listadeedad.get(position), Toast.LENGTH_LONG).show();
			}
        	
		});
    }


    
    
    
}
