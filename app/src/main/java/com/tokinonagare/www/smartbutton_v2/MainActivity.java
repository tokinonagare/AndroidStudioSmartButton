package com.tokinonagare.www.smartbutton_v2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buckyesButton = (Button)findViewById(R.id.buckysBotton);

        buckyesButton.setOnClickListener(
                new  Button.OnClickListener(){
                    public void onClick(View v){
                        TextView buckyesText = (TextView)findViewById(R.id.buckysText);
                        buckyesText.setText("Good job Hoss!");
                    }
                }
        );

        buckyesButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v) {
                        TextView buckysText = (TextView)findViewById(R.id.buckysText);
                        buckysText.setText("Holy carp, that was a long one!");
                        return true;
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
