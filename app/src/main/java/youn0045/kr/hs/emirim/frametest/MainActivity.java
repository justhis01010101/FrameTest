package youn0045.kr.hs.emirim.frametest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout[] linears= new LinearLayout[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] buts = new Button[3];

        for (int i = 0; i < buts.length; i++) {
            buts[i] = (Button) findViewById(R.id.but1 + i); //
            linears[i]= (LinearLayout)findViewById(R.id.line1+1);
            buts[i].setOnClickListener(butHandler); //
        }
    }

    View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) { //버튼을 클릭했을때 호출되는 부분
            switch (view.getId()){
                case R.id.but1:
                    linears[0].setVisibility(View.VISIBLE);
                    linears[1].setVisibility(View.INVISIBLE);
                    linears[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but2:
                    linears[0].setVisibility(View.INVISIBLE);
                    linears[1].setVisibility(View.VISIBLE);
                    linears[2].setVisibility(View.INVISIBLE);
                    break;
                case R.id.but3:
                    linears[0].setVisibility(View.INVISIBLE);
                    linears[1].setVisibility(View.INVISIBLE);
                    linears[2].setVisibility(View.VISIBLE);
                    break;
            }

        }
    };
}