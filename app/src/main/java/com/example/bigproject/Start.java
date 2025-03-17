package com.example.bigproject;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class Start extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        TextView registrationview = findViewById(R.id.registrationview);
        Button signin = findViewById(R.id.signin);
        FirebaseFirestore db = FirebaseFirestore.getInstance();


        //Вход в систему через базу данных
        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                //переход с окна авторизации на  главную страницу
                Intent intent = new Intent(Start.this, MainActivity.class);
                startActivity(intent);

                // получение сведений о пользователе для входа в систему из базы данных
                db.collection("user")
                        .get()
                        .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>()
                        {
                            @Override
                            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                if (task.isSuccessful()) {
                                    for (QueryDocumentSnapshot document : task.getResult()) {

                                        SignInCheck(document.getId(), document.getData());

                                        Log.d(TAG, document.getId() + " => " + document.getData());
                                    }
                                } else {
                                    Log.w(TAG, "Error getting documents.", task.getException());
                                }
                            }
                        });
            }
        });


        //Перейти к регистрации
        registrationview.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Start.this, Registration.class);
                startActivity(intent);
            }
        });


    }

    //проверка данных для входа в систему
    private void SignInCheck(String string, Object object)
    {
        if (string == "email")
        {
            Log.d(TAG, object.toString());
        }

        else if (string == "password")
        {
            Log.d(TAG, object.toString());
        }
        else
        {
            Log.d(TAG, "ошибка");
        }
    }
}