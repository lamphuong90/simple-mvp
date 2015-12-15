package com.lpphan.mvp.presenter;

import com.lpphan.mvp.view.MvpLoadingView;

/**
 * Created by lamphuong on 14/12/2015.
 */
public abstract class BaseLoadingPresenter<M,V extends MvpLoadingView<M>> extends BasePresenter<V> implements LoadingPresenter<M,V> {
    protected M mModel;

    public abstract void loadData(boolean pullToRefresh);

    @Override
    public void setData(M model) {
        mModel = model;
    }

    @Override
    public M getData() {
        return mModel;
    }
}
