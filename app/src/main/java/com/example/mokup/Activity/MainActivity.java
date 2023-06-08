package com.example.mokup.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mokup.R;
import com.example.mokup.model.Book;
import com.example.mokup.model.BookFactory;
import com.example.mokup.model.IBookDa;

import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private Button button ;
    private Spinner spinner;
    private EditText textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btnBook);
        spinner=findViewById(R.id.spnID);
        textView=findViewById(R.id.edtS);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BookFactory  factory=new BookFactory();
                IBookDa objBookDa=factory.getModel();
                String item=spinner.getSelectedItem().toString();
                List<Book> book=objBookDa.getBook(item);
                String st="";
                for(Book b :book){
                    st+=b.getTitle()+"\n";
                }
                 textView.setText(st);
              /*********************/

            }
        });
        populate();



    }

    private void populate() {
        BookFactory factory=new BookFactory();
        IBookDa objBook=factory.getModel();

        String [] cat=objBook.getCategory();
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cat);
        spinner.setAdapter(adapter);

    }


}