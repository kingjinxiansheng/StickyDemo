package wobiancao.stickydemo.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by my301s on 2017/10/11.
 */

public class HeaderProductLayout extends LinearLayout {
    ImageView mImageView;
    public HeaderProductLayout(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.header_layout, this);
        mImageView = (ImageView) view.findViewById(R.id.header_product_image);
    }

    //量取view此时Y轴的距离
    public int getDistanceY() {
        int[] location = new int[2];
        mImageView.getLocationOnScreen(location);
       // int x=location[0];//获取当前位置的横坐标
        int y = location[1];//获取当前位置的纵坐标
        return y;
    }

}
