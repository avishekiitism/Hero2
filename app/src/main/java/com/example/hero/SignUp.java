package com.example.hero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {
    EditText firstName, lastName, userName, emailId,passWord;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sign_up );
        firstName=findViewById ( R.id.textView4 );
        lastName=findViewById ( R.id.textView10 );
        userName=findViewById ( R.id.textView11 );
        emailId=findViewById ( R.id.textView12 );
        passWord=findViewById ( R.id.textView14 );
        FirebaseDatabase.getInstance ().getReference ().child ( "Users" ).setValue ( "abcd" );
    }

    public void upload(View view) {
        rootNode = FirebaseDatabase.getInstance ();
        reference=rootNode.getReference ("Users");
        reference.setValue ( "Car" );

    }

}