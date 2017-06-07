package in.good_work.userlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserShowActivity extends AppCompatActivity {
    Intent intent;
    TextView tvUserinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_show);

        tvUserinfo = (TextView) findViewById(R.id.tv_showuser_userinfo);
        intent = getIntent();

        User user1 = new User(
                Long.valueOf(getUserInfoFromIntent(Config.KEY_ID)),
                getUserInfoFromIntent("etName"),
                getUserInfoFromIntent("etSurname"),
                getUserInfoFromIntent("etPhone"),
                getUserInfoFromIntent("etMail"),
                getUserInfoFromIntent("etUrlPhoto")
        );

        TextView txShowUser = (TextView) findViewById(R.id.tv_showuser_userinfo);
        txShowUser.setText(user1.toString());

    }

    private String getUserInfoFromIntent(String value){
        return intent.getStringExtra(value);
    }
}
