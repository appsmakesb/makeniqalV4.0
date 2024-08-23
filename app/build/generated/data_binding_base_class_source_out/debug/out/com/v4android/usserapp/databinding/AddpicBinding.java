// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v4android.usserapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddpicBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final ImageView bpick;

  @NonNull
  public final ImageView front;

  @NonNull
  public final ImageView pick;

  @NonNull
  public final Button reg;

  private AddpicBinding(@NonNull RelativeLayout rootView, @NonNull ImageView back,
      @NonNull ImageView bpick, @NonNull ImageView front, @NonNull ImageView pick,
      @NonNull Button reg) {
    this.rootView = rootView;
    this.back = back;
    this.bpick = bpick;
    this.front = front;
    this.pick = pick;
    this.reg = reg;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddpicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddpicBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.addpic, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddpicBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.bpick;
      ImageView bpick = ViewBindings.findChildViewById(rootView, id);
      if (bpick == null) {
        break missingId;
      }

      id = R.id.front;
      ImageView front = ViewBindings.findChildViewById(rootView, id);
      if (front == null) {
        break missingId;
      }

      id = R.id.pick;
      ImageView pick = ViewBindings.findChildViewById(rootView, id);
      if (pick == null) {
        break missingId;
      }

      id = R.id.reg;
      Button reg = ViewBindings.findChildViewById(rootView, id);
      if (reg == null) {
        break missingId;
      }

      return new AddpicBinding((RelativeLayout) rootView, back, bpick, front, pick, reg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
