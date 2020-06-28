package zhoutingting39.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import zhoutingting39.com.R;

public class SignNameActivity extends BaseActivity{

    protected EditText signNameEdtx;
    protected TextView saveTx,backTx;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_name_layout);
        initView();
        initData();
    }

    @Override
    void initView() {
        signNameEdtx = findViewById(R.id.sign_name_text);
        saveTx = findViewById(R.id.save_tx);
        backTx  = findViewById(R.id.back_tx);
    }

    @Override
    void initData() {
        saveTx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String signName = signNameEdtx.getText().toString().trim();
                //跳转界面 传递个性签名
                CacheUtil.setPermanent("signNmae",signName);
                Intent  goMainTent  = new  Intent(SignNameActivity.this,MainActivity.class);
                startActivity(goMainTent);
                finish();
            }
        });
        backTx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
