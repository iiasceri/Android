package com.androidtutz.anushka.puremvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements WelcomeContract.View{

    private EditText etLastName;
    private TextView tvWelcomeMessage;
    private EditText etFirstName;
    private Button btnSubmit;

    private WelcomeContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLastName=(EditText)findViewById(R.id.etLasttName);
        etFirstName=(EditText)findViewById(R.id.etFirtstName);
        tvWelcomeMessage=(TextView)findViewById(R.id.tvWelcomeMessage);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        presenter=new WelcomePresenter(this);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(etFirstName.getText().toString())){

                    Toast.makeText(getApplicationContext()," Pleas enter first name ",Toast.LENGTH_LONG).show();

                }else{

                    presenter.submitName(etFirstName.getText().toString(),etLastName.getText().toString());
                    presenter.loadWelcomeMessage();

                }
            }
        });


    }

    @Override
    public void showWelcomeMessage(String welcomeMessage) {

        tvWelcomeMessage.setText(welcomeMessage);
    }
}
