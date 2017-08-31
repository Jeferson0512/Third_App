package com.jeferson.thirdapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox checkBox,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox)findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox)findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox)findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox)findViewById(R.id.checkBox9);

        //Setting check to specific checbox
        checkBox.setChecked(true);
        if(checkBox.isChecked()){
            Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_LONG).show();
        }

    }
    public void androidCheckBoxClicked(View view){

        //action for checkbox click
        switch(view.getId()){
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox)view;
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox2:
                //DO something when user check the box
                CheckBox checkBox2 = (CheckBox)view;
                if(checkBox2.isChecked())
                    Toast.makeText(this, checkBox2.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox3:
                //DO something when user check the box
                CheckBox checkBox3 = (CheckBox)view;
                if(checkBox3.isChecked())
                    Toast.makeText(this, checkBox3.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox4:
                //DO something when user check the box
                if(checkBox4.isChecked())
                    Toast.makeText(this, checkBox4.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox5:
                //DO something when user check the box
                if(checkBox5.isChecked())
                    Toast.makeText(this, checkBox5.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox6:
                //DO something when user check the box
                if(checkBox6.isChecked())
                    Toast.makeText(this, checkBox6.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox7:
                //DO something when user check the box
                if(checkBox7.isChecked())
                    Toast.makeText(this, checkBox7.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox8:
                //DO something when user check the box
                if(checkBox8.isChecked())
                    Toast.makeText(this, checkBox8.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox9:
                //DO something when user check the box
                if(checkBox9.isChecked())
                    Toast.makeText(this, checkBox9.getText() + "selected!", Toast.LENGTH_LONG).show();
                break;


        }

    }
}
