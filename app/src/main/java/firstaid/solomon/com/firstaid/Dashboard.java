package firstaid.solomon.com.firstaid;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    Button volunteer; //locate hosipital button
    Button needy; // give first aid button
    Button quiz; //quiz button
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        volunteer=(Button)findViewById(R.id.btnVolunteer);
        needy=(Button)findViewById(R.id.btnNeedy);
        quiz=(Button)findViewById(R.id.btnQuiz);

        volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMaps= new Intent(context,MapsActivity.class);
                startActivity(startMaps);
            }
        });

        needy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent me=new Intent(Dashboard.this,Main2Activity.class);
                startActivity(me);


            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Dashboard.this,Questions.class);
                startActivity(i);

            }
        });
    }
}
