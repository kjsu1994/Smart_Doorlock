package iot.jinsu.smart_doorlock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button) findViewById(R.id.logButton);
        Button button1 = (Button) findViewById(R.id.securityButton);
        Button button2 = (Button) findViewById(R.id.pwchangeButton);
        Button button3 = (Button) findViewById(R.id.otpButton);
        Button button4 = (Button) findViewById(R.id.openButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent(activity_Main.this,
                        activity_log.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent(activity_Main.this,
                        ActivitySecuremode.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent(activity_Main.this,
                        ActivityPwchange.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent(activity_Main.this,
                        ActivityOtp.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =  new Intent(activity_Main.this,
                        ActivityOpenDoor.class);
                startActivity(intent);
            }
        });

    }
}