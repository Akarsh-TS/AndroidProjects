package com.example.akarshts.todolist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> arraytodo;
    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arraytodo=new ArrayList<String>();
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraytodo);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);
        registerForContextMenu(listView);
        try {
            Scanner scanner=new Scanner(openFileInput("todo.txt"));
            while (scanner.hasNext()){
                String todo=scanner.nextLine();
                arrayAdapter.add(todo);
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if(v.getId()!=R.id.list){
            return;
        }
        menu.setHeaderTitle("MENU");
        String[] option={"delete","cancel"};
        for (String options:option)
            menu.add(options);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int index=info.position;
        if(item.getTitle().equals("delete")){
            arraytodo.remove(index);
            arrayAdapter.notifyDataSetChanged();
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        try {
            PrintWriter pw = new PrintWriter(openFileOutput("todo.txt", Context.MODE_PRIVATE));
            for (String todo : arraytodo) {
                pw.println(todo);

            }
            pw.close();
            super.onBackPressed();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    public void addlist(View view){
        EditText editText=(EditText)findViewById(R.id.input);
        String i=editText.getText().toString();
        if (i.isEmpty()){
            return;
        }
        arrayAdapter.add(i);
        editText.setText(null);
    }
}
