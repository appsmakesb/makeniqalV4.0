// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v4android.usserapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SliderLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView OneSliderText;

  @NonNull
  public final ImageView myimage;

  private SliderLayoutBinding(@NonNull RelativeLayout rootView, @NonNull TextView OneSliderText,
      @NonNull ImageView myimage) {
    this.rootView = rootView;
    this.OneSliderText = OneSliderText;
    this.myimage = myimage;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SliderLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SliderLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.slider_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SliderLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.OneSliderText;
      TextView OneSliderText = ViewBindings.findChildViewById(rootView, id);
      if (OneSliderText == null) {
        break missingId;
      }

      id = R.id.myimage;
      ImageView myimage = ViewBindings.findChildViewById(rootView, id);
      if (myimage == null) {
        break missingId;
      }

      return new SliderLayoutBinding((RelativeLayout) rootView, OneSliderText, myimage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
