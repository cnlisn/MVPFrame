package com.lisn.mvpframe.present;


import com.lisn.mvpframe.bean.Girl;
import com.lisn.mvpframe.model.GirlModelImlV1;
import com.lisn.mvpframe.model.IGirlModel;
import com.lisn.mvpframe.view.IGrilView;

import java.util.List;

/**
 * present层
 */

public class GirlPresentV1<T> extends BasePersenter<IGrilView> {
    /**
     * 持有视图层 UI接口的引用  此时的视图层Activity
     */
    IGrilView mGrilView;

    public GirlPresentV1(IGrilView mGrilView) {
        this.mGrilView = mGrilView;
    }

    /**
     * 持有模型Model的引用
     */
    IGirlModel girlModel = new GirlModelImlV1();

    @Override
    public void fetch() {
        mGrilView.showLoading();
        if (girlModel != null) {
            /**
             * 参数为数据回调监听
             */
            girlModel.loadGirl(new IGirlModel.GirlOnLoadlitener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //回调视图层
                    mGrilView.showGrils(girls);
                }
            });
        }
    }
}
