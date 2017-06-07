package in.good_work.userlist;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etId;
    private EditText etName;
    private EditText etSurname;
    private EditText etPhone;
    private EditText etMail;
    private EditText etUrlPhoto;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId = (EditText) findViewById(R.id.et_main_id);
        etName = (EditText) findViewById(R.id.et_main_name);
        etSurname = (EditText) findViewById(R.id.et_main_surname);
        etPhone = (EditText) findViewById(R.id.et_main_phone);
        etMail = (EditText) findViewById(R.id.et_main_mail);
        etUrlPhoto = (EditText) findViewById(R.id.et_main_urlphoto);
        btnSend = (Button) findViewById(R.id.btn_main_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserShowActivity.class);
                intent.putExtra(Config.KEY_ID, getValueEt(etId));
                intent.putExtra("etName", getValueEt(etName));
                intent.putExtra("etSurname", getValueEt(etSurname));
                intent.putExtra("etPhone", getValueEt(etPhone));
                intent.putExtra("etMail", getValueEt(etMail));
                intent.putExtra("etUrlPhoto", getValueEt(etUrlPhoto));
                startActivity(intent);
            }
        });
    }

    @NonNull
    private String  getValueEt(EditText v){
        return v.getText().toString();
    }
}
