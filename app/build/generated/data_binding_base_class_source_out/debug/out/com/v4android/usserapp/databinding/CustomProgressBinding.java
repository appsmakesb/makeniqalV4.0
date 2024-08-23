// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.github.ybq.android.spinkit.SpinKitView;
import com.v4android.usserapp.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class CustomProgressBinding implements ViewBinding {
  @NonNull
  private final SpinKitView rootView;

  @NonNull
  public final SpinKitView spinKit;

  private CustomProgressBinding(@NonNull SpinKitView rootView, @NonNull SpinKitView spinKit) {
    this.rootView = rootView;
    this.spinKit = spinKit;
  }

  @Override
  @NonNull
  public SpinKitView getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomProgressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_progress, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomProgressBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    SpinKitView spinKit = (SpinKitView) rootView;

    return new CustomProgressBinding((SpinKitView) rootView, spinKit);
  }
}
