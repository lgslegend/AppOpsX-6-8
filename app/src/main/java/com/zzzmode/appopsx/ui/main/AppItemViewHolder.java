package com.zzzmode.appopsx.ui.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zzzmode.appopsx.R;
import com.zzzmode.appopsx.ui.core.LocalImageLoader;
import com.zzzmode.appopsx.ui.model.AppInfo;

/**
 * Created by zl on 2017/5/7.
 */

public class AppItemViewHolder extends RecyclerView.ViewHolder {

  ImageView imgIcon;
  TextView tvName;

  public AppItemViewHolder(View itemView) {
    super(itemView);
    imgIcon = (ImageView) itemView.findViewById(R.id.app_icon);
    tvName = (TextView) itemView.findViewById(R.id.app_name);
  }


  public void bindData(AppInfo appInfo) {
    tvName.setText(appInfo.appName);
    LocalImageLoader.load(imgIcon, appInfo);
  }
}
