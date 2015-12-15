package com.lpphan.mvp.presenter;

import com.lpphan.mvp.view.MvpLoadingView;

/**
 * Created by lamphuong on 14/12/2015.
 */
public interface LoadingPresenter<M,V extends MvpLoadingView<M>> extends Presenter<V> {
    void setData(M model);
    M getData();
}
