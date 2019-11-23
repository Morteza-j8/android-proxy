package ir.jalambadani.morteza.proxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private static final int STATUS_ON = 1;
    private static final int STATUS_OFF = 2;
    private static final int STATUS_LOADING = 4;
    private static final String TEXT_STATUS_ON = "Let's Connect";
    private static final String TEXT_STATUS_OFF = "Let's Disconnect";

    private TextView txtStatus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViews();




    }

    private void findViews() {
        txtStatus = findViewById(R.id.acMain_txtStatus);


        txtStatus.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.acMain_txtStatus:

                onClickChangeStatus(txtStatus.getVisibility() == View.GONE ? STATUS_LOADING : TEXT_STATUS_ON.equals(txtStatus.getText().toString()) ? STATUS_ON : STATUS_OFF);

                break;


            default:
        }
    }

    private void onClickChangeStatus(int status) {

        switch (status){

            case STATUS_ON:

                onStatusChangeToOn();

                break;

            case STATUS_OFF:

                onStatusChangeToOff();
                break;
        }

    }

    private void onStatusChangeToOff() {

    }

    private void onStatusChangeToOn() {

    }
}
