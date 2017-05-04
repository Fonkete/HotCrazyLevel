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

public class MaleActivity extends AppCompatActivity {

    int sexylevel;
    int moneylevel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);

        final SeekBar sexySb = (SeekBar) findViewById(R.id.sexySb);
        sexySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sexylevel = progress;
                TextView sexyTv = (TextView) findViewById(R.id.sexyTv);
                sexyTv.setText(String.valueOf(sexylevel));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar moneySb = (SeekBar) findViewById(R.id.moneySb);
        moneySb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                moneylevel = progress;
                TextView moneyTv = (TextView) findViewById(R.id.moneyTv);
                moneyTv.setText(String.valueOf(moneylevel));
                Log.d("money", String.valueOf(moneylevel));
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
                Intent intent = new Intent(MaleActivity.this, ResultActivity.class);
                intent.putExtra("sex", "hombre");
                intent.putExtra("sexyM", sexylevel);
                intent.putExtra("money", moneylevel);
                startActivity(intent);
            }
        });


    }
}
