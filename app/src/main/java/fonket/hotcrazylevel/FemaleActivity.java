package fonket.hotcrazylevel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by felip on 27-04-2017.
 */

public class FemaleActivity extends AppCompatActivity {

    int cutelevel;
    int crazylevel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);

        SeekBar sexySb = (SeekBar) findViewById(R.id.sexySb);
        sexySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                cutelevel = progress;
                TextView sexyTv = (TextView) findViewById(R.id.sexyTv);
                sexyTv.setText(String.valueOf(cutelevel));
                            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar crazySb = (SeekBar) findViewById(R.id.crazySb);
        crazySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                crazylevel = progress;
                TextView crazyTv = (TextView) findViewById(R.id.crazyTv);
                crazyTv.setText(String.valueOf(crazylevel));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Button btnFinal = (Button) findViewById(R.id.btnfinal);
        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FemaleActivity.this, ResultActivity.class);
                Log.d("CRAZY", String.valueOf(crazylevel) + String.valueOf(cutelevel));
                intent.putExtra("crazy", crazylevel);
                intent.putExtra("sexyW", cutelevel);
                startActivity(intent);

            }
        });
    }
}
