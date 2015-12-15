package com.lpphan.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lpphan.mvp.presenter.BasePresenter;
import com.lpphan.mvp.view.MvpView;

/**
 * Created by lamphuong on 14/12/2015.
 */
public abstract class MvpActivity<V extends MvpView,P extends BasePresenter<V>> extends AppCompatActivity implements MvpView{
    protected P mPresenter;

    public abstract P createPresenter();

    protected P getPresenter(){
        return mPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.detachView();
    }
}
