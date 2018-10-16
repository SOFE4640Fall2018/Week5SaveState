package com.example.sofe4640.savestate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName, lastName, title;

    private static final String KEY_FIRSTNAME= "firstname_key";
    private static final String KEY_LASTNAME = "lastname_key";
    private static final String KEY_TITLE = "title_key";



    private String mFirstName, mLastName, mTitle;
    TextView first, last, mTit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstName = (EditText) findViewById(R.id.edit_employee_firstname);
        lastName = (EditText) findViewById(R.id.edit_employee_lastname);
        title = (EditText) findViewById(R.id.edit_employee_title);

        first = (TextView) findViewById(R.id.empFirst);
        last = (TextView) findViewById(R.id.empLast);
        mTit = (TextView) findViewById(R.id.empTitle);

//        if (savedInstanceState != null) {
//            String savedFirstName = savedInstanceState.getString(KEY_FIRSTNAME);
//            first.setText(savedFirstName);
//
//            String savedLastName = savedInstanceState.getString(KEY_LASTNAME);
//            last.setText(savedLastName);
//
//            String savedTitle = savedInstanceState.getString(KEY_TITLE);
//            mTit.setText(savedTitle);
//
//        }else{
//            Toast.makeText(this, "New entry", Toast.LENGTH_SHORT).show();
//        }

    }


    public void saveView(View view){
        first.setText(firstName.getText().toString().trim());
        last.setText(lastName.getText().toString().trim());
        mTit.setText(title.getText().toString().trim());
    }



    //  @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        outState.putString(KEY_FIRSTNAME, first.getText().toString());
//        outState.putString(KEY_LASTNAME, last.getText().toString());
//        outState.putString(KEY_TITLE, mTit.getText().toString());
//
//        super.onSaveInstanceState(outState);
//    }
//

}
