package com.lisn.mvpframe;

import android.app.Activity;
import android.os.Bundle;

import com.lisn.mvpframe.present.BasePersenter;


/**
 * V  IGrilView接口
 *
 */

public abstract  class BaseActivty<V,T extends BasePersenter<V>> extends Activity {
    protected  T mPresent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresent=createPresent();
        mPresent.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        mPresent.detach();
        super.onDestroy();

    }

    /**
     * 子类实现具体的构建过程
     * @return
     */
    protected abstract T createPresent() ;
}
