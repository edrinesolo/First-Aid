package firstaid.solomon.com.firstaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* WebView web=(WebView)findViewById(R.id.web);
        WebSettings webSetting = web.getSettings();
        webSetting.setJavaScriptEnabled(true);
        webSetting.setDisplayZoomControls(true);
        web.loadUrl("file:///android_asset/www/index.html");   // now it will not fail here*/

        fin=(Button)findViewById(R.id.bMain);
        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(MainActivity.this,Dashboard.class);
                startActivity(t);
                finish();
            }
        });


    }
}
