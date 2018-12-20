package com.example.nurcanzkan.verilerilisteme;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    ListView dataList;
    LinearLayout linearL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final String isletimSistemleri[]={"Cupcake","Donut","Eclair","Froya","GingerBread","Honeycomb","Ice Cream Sandiwich","Jelly Bean","Kitkat","Lollipop","Marshmallow","Nougat"};
        linearL=findViewById(R.id.linearL);


        dataList = findViewById(R.id.dataList);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, android.R.id.text1,isletimSistemleri);
        dataList.setAdapter(adapter);




        dataList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       linearL.setBackgroundResource(R.mipmap.cupcake);
                       Toast.makeText(getApplicationContext(),"Cupcake İşletim Sistemi",Toast.LENGTH_SHORT).show();
                   
                       break;
                   case 1:
                       linearL.setBackgroundResource(R.mipmap.donut);
                       Toast.makeText(getApplicationContext(),"Donut İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 2:
                       linearL.setBackgroundResource(R.mipmap.eclair);
                       Toast.makeText(getApplicationContext(),"Eclair İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 3:
                       linearL.setBackgroundResource(R.mipmap.froya);
                       Toast.makeText(getApplicationContext(),"Froya İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 4:
                       linearL.setBackgroundResource(R.mipmap.gingerbread);
                       Toast.makeText(getApplicationContext(),"GingerBread İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 5:
                       linearL.setBackgroundResource(R.mipmap.honeycomb);
                       Toast.makeText(getApplicationContext(),"Honeycomb İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 6:
                       linearL.setBackgroundResource(R.mipmap.icecreamsandwich);
                       Toast.makeText(getApplicationContext(),"Ice Cream Sandiwich İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 7:
                       linearL.setBackgroundResource(R.mipmap.jellybean);
                       Toast.makeText(getApplicationContext(),"Jelly Neam İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 8:
                       linearL.setBackgroundResource(R.mipmap.kitkat);
                       Toast.makeText(getApplicationContext(),"Kitkat İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 9:
                       linearL.setBackgroundResource(R.mipmap.lollipop);
                       Toast.makeText(getApplicationContext(),"Lollipop İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 10:
                       linearL.setBackgroundResource(R.mipmap.marshmallow);
                       Toast.makeText(getApplicationContext(),"Marshmallow İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
                   case 11:
                       linearL.setBackgroundResource(R.mipmap.nougat);
                       Toast.makeText(getApplicationContext(),"Nougat İşletim Sistemi",Toast.LENGTH_SHORT).show();
                       break;
               }

           }
       });




    }


}
