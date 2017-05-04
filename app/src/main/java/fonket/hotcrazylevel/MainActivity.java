package fonket.hotcrazylevel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static fonket.hotcrazylevel.R.id.radio;
import static fonket.hotcrazylevel.R.id.sendBtn;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioG);
        final String sex = radioGroup.toString();

        Button sendBtn = (Button) findViewById(R.id.sendBtn);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkRadioButton = radioGroup.getCheckedRadioButtonId();

                if (checkRadioButton == -1){
                    Toast.makeText(MainActivity.this, "Se está agarrando a un traba?", Toast.LENGTH_SHORT).show();
                } else {
                    RadioButton radioButton = (RadioButton) radioGroup.findViewById(checkRadioButton);
                    String sex = radioButton.getText().toString();

                    if(sex.contains("hombre")) {
                        Intent intent1 = new Intent(MainActivity.this, MaleActivity.class);
                        intent1.putExtra("sex", sex);
                        startActivity(intent1);
                    } else {
                        Intent intent2 = new Intent(MainActivity.this, FemaleActivity.class);
                        intent2.putExtra("sex", sex);
                        startActivity(intent2);
                    }

                }
            }
        });


    }


}
