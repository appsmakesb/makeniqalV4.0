// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v4android.usserapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OrderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnNo;

  @NonNull
  public final Button btnYes;

  @NonNull
  public final TextView camount;

  @NonNull
  public final TextView cnumber;

  @NonNull
  public final TextView cost;

  @NonNull
  public final TextView ctype;

  @NonNull
  public final TextView msg;

  @NonNull
  public final TextView newb;

  @NonNull
  public final TextView sender;

  @NonNull
  public final TextView time;

  @NonNull
  public final TextView trnx;

  @NonNull
  public final TextView utime;

  private OrderBinding(@NonNull LinearLayout rootView, @NonNull Button btnNo,
      @NonNull Button btnYes, @NonNull TextView camount, @NonNull TextView cnumber,
      @NonNull TextView cost, @NonNull TextView ctype, @NonNull TextView msg,
      @NonNull TextView newb, @NonNull TextView sender, @NonNull TextView time,
      @NonNull TextView trnx, @NonNull TextView utime) {
    this.rootView = rootView;
    this.btnNo = btnNo;
    this.btnYes = btnYes;
    this.camount = camount;
    this.cnumber = cnumber;
    this.cost = cost;
    this.ctype = ctype;
    this.msg = msg;
    this.newb = newb;
    this.sender = sender;
    this.time = time;
    this.trnx = trnx;
    this.utime = utime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OrderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_no;
      Button btnNo = ViewBindings.findChildViewById(rootView, id);
      if (btnNo == null) {
        break missingId;
      }

      id = R.id.btn_yes;
      Button btnYes = ViewBindings.findChildViewById(rootView, id);
      if (btnYes == null) {
        break missingId;
      }

      id = R.id.camount;
      TextView camount = ViewBindings.findChildViewById(rootView, id);
      if (camount == null) {
        break missingId;
      }

      id = R.id.cnumber;
      TextView cnumber = ViewBindings.findChildViewById(rootView, id);
      if (cnumber == null) {
        break missingId;
      }

      id = R.id.cost;
      TextView cost = ViewBindings.findChildViewById(rootView, id);
      if (cost == null) {
        break missingId;
      }

      id = R.id.ctype;
      TextView ctype = ViewBindings.findChildViewById(rootView, id);
      if (ctype == null) {
        break missingId;
      }

      id = R.id.msg;
      TextView msg = ViewBindings.findChildViewById(rootView, id);
      if (msg == null) {
        break missingId;
      }

      id = R.id.newb;
      TextView newb = ViewBindings.findChildViewById(rootView, id);
      if (newb == null) {
        break missingId;
      }

      id = R.id.sender;
      TextView sender = ViewBindings.findChildViewById(rootView, id);
      if (sender == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      id = R.id.trnx;
      TextView trnx = ViewBindings.findChildViewById(rootView, id);
      if (trnx == null) {
        break missingId;
      }

      id = R.id.utime;
      TextView utime = ViewBindings.findChildViewById(rootView, id);
      if (utime == null) {
        break missingId;
      }

      return new OrderBinding((LinearLayout) rootView, btnNo, btnYes, camount, cnumber, cost, ctype,
          msg, newb, sender, time, trnx, utime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
