package fonket.hotcrazylevel;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by felip on 03-05-2017.
 */
public class ResultFragment extends Fragment {

    public ResultFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView result = (TextView) view.findViewById(R.id.resultTv);
        String sex = getActivity().getIntent().getStringExtra("sex");

        if (sex != null) {
            int sexyM = getActivity().getIntent().getExtras().getInt("sexyM");
            int money = getActivity().getIntent().getExtras().getInt("money");
            if (sexyM < 5 && money < 5) {
                result.setText("ESTAS EN NO GO ZONE. Su novio no es muy bonito y tampoco tiene mucho dinero, Espero sea chistoso y amoroso es lo que le queda");
            } else if (sexyM > 4 && sexyM < 7 && money <= 5) {
                result.setText("ESTAS EN LA FUNZONE. Su pololo no es el prospecto ideal como compañero pero puede entretenerse todo lo que quieras. Tomando en cuenta que la etapa FUNZONE es temporal");
            } else {
                result.setText("ESTAS EN LA HUSBANDZONE. Su pololo tiene la mezcla entre guapo y adinerado, es el hombre ideal para ser su esposo");
            }
        } else {
            int sexyW = getActivity().getIntent().getExtras().getInt("sexyW");
            int crazy = getActivity().getIntent().getExtras().getInt("crazy");
            if (sexyW < 5 && crazy > 7) {
                result.setText("ESTAS EN LA  NO GO ZONE. Ten cuidado con tu integridad fisica y mental. Manten la calma y alejate de ella sin mostrar miedo");
            } else if (sexyW > 5 && sexyW < 7 && crazy < 8 && crazy > 4) {
                result.setText("ESTAS EN LA FUN ZONE. Tu polola es cuerda la mayor parte del tiempo y es guapa. La vida es ahora disfrútala a concho");
            } else {
                result.setText("ESTAS EN LA WIFEZONE. Su polola es perfecta. Un equilibrio perfecto entre belleza y sensatez. La mujer ideal para ser su esposa");
            }

        }


    }
}
