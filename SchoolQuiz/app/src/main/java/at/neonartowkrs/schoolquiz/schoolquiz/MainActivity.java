package at.neonartowkrs.schoolquiz.schoolquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick_Already_Login(View view) { setContentView(R.layout.activity_login); }

    public void onClick_No_Account(View view) {
        setContentView(R.layout.activity_register);
    }





}
