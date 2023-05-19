package sg.edu.rp.c346.id22022505.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mod1;
    TextView mod2;
    TextView mod3;
    TextView mod4;
    TextView mod5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.textView);
        mod2 = findViewById(R.id.textView2);
        mod3 = findViewById(R.id.textView3);
        mod4 = findViewById(R.id.textView4);
        mod5 = findViewById(R.id.textView5);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("value", "Module Code: C203" + "\n" + "Module Name: Web App Development in PHP" + "\n" + "Academic Year: 2023" + "\n" + "Semester: 1" + "\n" + "Module Credit: 4" + "\n" + "Venue: W64M");
                startActivity(intent);
            }
        });

        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", "Module Code: C206" + "\n" + "Module Name: Software Development Process" + "\n" + "Academic Year: 2023" + "\n"+"Semester: 1"+"\n"+"Module Credit: 4"+"\n"+"Venue: W64M");
                startActivity(intent);
            }
        });

        mod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value", "Module Code: C218"+"\n"+"Module Name: UI/UX Design for Apps"+"\n"+"Academic Year: 2023" + "\n"+"Semester: 1"+"\n"+"Module Credit: 4"+"\n"+"Venue: W64M");
                startActivity(intent);
            }
        });

        mod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value", "Module Code: C235"+"\n"+"Module Name: IT Security and Management"+"\n"+"Academic Year: 2023" + "\n"+"Semester: 1"+"\n"+"Module Credit: 4"+"\n"+"Venue: W64M");
                startActivity(intent);
            }
        });

        mod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                intent.putExtra("value", "Module Code: C346"+"\n"+"Module Name: Mobile App Development"+"\n"+"Academic Year: 2023" + "\n"+"Semester: 1"+"\n"+"Module Credit: 4"+"\n"+"Venue: W64M");
                startActivity(intent);
            }
        });
    }
}
