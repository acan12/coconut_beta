package app.beelabs.com.coconut.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import app.beelabs.com.coconut.R;
import app.beelabs.com.coconut.model.api.response.LoginResponseModel;
import app.beelabs.com.codebase.base.BaseActivity;
import app.beelabs.com.codebase.base.response.BaseResponse;
import app.beelabs.com.codebase.component.CoconutFrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Response;


public class MainActivity extends BaseActivity {
    @BindView(R.id.root)
    CoconutFrameLayout rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRootView(findViewById(R.id.root));
        ButterKnife.bind(this);


//        showApiProgressDialog(App.getAppComponent(), new ResourceDao(this) {
//            @Override
//            public void call() {
//                this.postPhoneNumber("081212341212", MainActivity.this, BaseDao.getInstance(MainActivity.this, IConfig.KEY_CALLER_API_SOURCE).callback);
//            }
//        }, "Loading", false);


//        showFragment(new MainFragment(), R.id.container);

        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootView.setBackgroundColor(getResources().getColor(R.color.color_white));
            }
        });
    }

    @OnClick(R.id.loadButton)
    public void onLoadButton(View view) {
        loginAPI();
    }

    @Override
    protected void onApiFailureCallback(String message, BaseActivity ac) {
        super.onApiFailureCallback(message, ac);
    }

    @Override
    protected void onApiResponseCallback(BaseResponse mr, int responseCode, Response response) {
//        getRootView().setBackgroundColor(getResources().getColor(R.color.color_black_transparent80));

        if (responseCode == 1) {
            LoginResponseModel model = (LoginResponseModel) mr;
            Log.d("", model.getMeta().getMessage());

//            case IConfig.KEY_CALLER_API_SOURCE:
//                Toast.makeText(this, IConfig.KEY_CALLER_API_SOURCE, Toast.LENGTH_LONG).show();
//
//                showProgressDialogOnDAOCalled(new ResourceDao(this) {
//                    @Override
//                    public void call() {
//                        this.getSourcesDAO(MainActivity.this, BaseDao.getInstance(MainActivity.this, IConfig.KEY_CALLER_API_ARTICLE).callback);
//                    }
//                });
//
//                break;
//            case IConfig.KEY_CALLER_API_ARTICLE:
//                Toast.makeText(this, IConfig.KEY_CALLER_API_ARTICLE, Toast.LENGTH_LONG).show();
//                break;
        }
    }


    private void loginAPI() {
//        showApiProgressDialog(App.getAppComponent(), new ResourceDao(this) {
//            @Override
//            public void call() {
//                LoginRequestModel model = new LoginRequestModel(
//                        "08568742365",
//                        "123123",
//                        "xxxxxx",
//                        "yyyyyyy");
//
//                new ResourceDao(MainActivity.this)
//                        .onLogin(model, MainActivity.this,
//                                getInstance(MainActivity.this, 1).callback);
//            }
//        });

    }


//        @Override
//        protected void onApiResponseCallback(BaseResponse br, int responseCode, Response response) {
//            super.onApiResponseCallback(br, responseCode, response);
//            dismissProgressDialog();
//            if (responseCode == API_KEY_LOGIN) {
//                if (response.isSuccessful()) {
//                    LoginResponseModel model = (LoginResponseModel) br;
//
//                    if (model.getMeta().isStatus()) { // if success
//
//                    }


}
