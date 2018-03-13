package com.shwethavasudevan.timeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btndiff;
    TextView time1, time2, timediff;
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
    int t1hours, t1mins, t1day, t2hours, t2mins, t2day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time1 = findViewById(R.id.time1txt);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time1.setText( cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.SHORT, Locale.getDefault())+ ", " + sdf.format(cal.getTime()));
                t1hours  = cal.get(Calendar.HOUR_OF_DAY);
                t1mins = cal.get(Calendar.MINUTE);
                t1day = cal.get(Calendar.DAY_OF_WEEK);
            }
        });

        time2 = findViewById(R.id.time2txt);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time2.setText( cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.SHORT, Locale.getDefault()) + ", " + sdf.format(cal.getTime()));
                t2hours = cal.get(Calendar.HOUR_OF_DAY);
                t2mins = cal.get(Calendar.MINUTE);
                t2day = cal.get(Calendar.DAY_OF_WEEK);
            }
        });

        timediff = (TextView)findViewById(R.id.timedifftxt);
        btndiff = findViewById(R.id.btndiff);
        btndiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hours, minutes;
                if(t2day-t1day==0) {
                    hours = t2hours - t1hours;
                    minutes = t2mins - t1mins;
                    if (minutes < 0) {
                        minutes += 60;
                        hours -= 1;

                    }
                    //timediff.setText(Duration: + hours + "");
                }

                    else {

                    }
                }
        });

        //int get (TemporalField field)


    }
}
