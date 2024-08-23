// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public final class MobilebankBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText amount;

  @NonNull
  public final RadioButton cashin;

  @NonNull
  public final RadioButton cashout;

  @NonNull
  public final TextView fifty;

  @NonNull
  public final RelativeLayout hd;

  @NonNull
  public final TextView hundread;

  @NonNull
  public final LinearLayout left;

  @NonNull
  public final TextView note;

  @NonNull
  public final LinearLayout num;

  @NonNull
  public final TextView number;

  @NonNull
  public final FrameLayout operator;

  @NonNull
  public final EditText pin;

  @NonNull
  public final RadioButton send;

  @NonNull
  public final Button sub;

  @NonNull
  public final TextView ten;

  @NonNull
  public final TextView twenty;

  @NonNull
  public final RadioGroup typep;

  @NonNull
  public final ProgressBar wait;

  private MobilebankBinding(@NonNull RelativeLayout rootView, @NonNull EditText amount,
      @NonNull RadioButton cashin, @NonNull RadioButton cashout, @NonNull TextView fifty,
      @NonNull RelativeLayout hd, @NonNull TextView hundread, @NonNull LinearLayout left,
      @NonNull TextView note, @NonNull LinearLayout num, @NonNull TextView number,
      @NonNull FrameLayout operator, @NonNull EditText pin, @NonNull RadioButton send,
      @NonNull Button sub, @NonNull TextView ten, @NonNull TextView twenty,
      @NonNull RadioGroup typep, @NonNull ProgressBar wait) {
    this.rootView = rootView;
    this.amount = amount;
    this.cashin = cashin;
    this.cashout = cashout;
    this.fifty = fifty;
    this.hd = hd;
    this.hundread = hundread;
    this.left = left;
    this.note = note;
    this.num = num;
    this.number = number;
    this.operator = operator;
    this.pin = pin;
    this.send = send;
    this.sub = sub;
    this.ten = ten;
    this.twenty = twenty;
    this.typep = typep;
    this.wait = wait;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MobilebankBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MobilebankBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.mobilebank, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MobilebankBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amount;
      EditText amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.cashin;
      RadioButton cashin = ViewBindings.findChildViewById(rootView, id);
      if (cashin == null) {
        break missingId;
      }

      id = R.id.cashout;
      RadioButton cashout = ViewBindings.findChildViewById(rootView, id);
      if (cashout == null) {
        break missingId;
      }

      id = R.id.fifty;
      TextView fifty = ViewBindings.findChildViewById(rootView, id);
      if (fifty == null) {
        break missingId;
      }

      id = R.id.hd;
      RelativeLayout hd = ViewBindings.findChildViewById(rootView, id);
      if (hd == null) {
        break missingId;
      }

      id = R.id.hundread;
      TextView hundread = ViewBindings.findChildViewById(rootView, id);
      if (hundread == null) {
        break missingId;
      }

      id = R.id.left;
      LinearLayout left = ViewBindings.findChildViewById(rootView, id);
      if (left == null) {
        break missingId;
      }

      id = R.id.note;
      TextView note = ViewBindings.findChildViewById(rootView, id);
      if (note == null) {
        break missingId;
      }

      id = R.id.num;
      LinearLayout num = ViewBindings.findChildViewById(rootView, id);
      if (num == null) {
        break missingId;
      }

      id = R.id.number;
      TextView number = ViewBindings.findChildViewById(rootView, id);
      if (number == null) {
        break missingId;
      }

      id = R.id.operator;
      FrameLayout operator = ViewBindings.findChildViewById(rootView, id);
      if (operator == null) {
        break missingId;
      }

      id = R.id.pin;
      EditText pin = ViewBindings.findChildViewById(rootView, id);
      if (pin == null) {
        break missingId;
      }

      id = R.id.send;
      RadioButton send = ViewBindings.findChildViewById(rootView, id);
      if (send == null) {
        break missingId;
      }

      id = R.id.sub;
      Button sub = ViewBindings.findChildViewById(rootView, id);
      if (sub == null) {
        break missingId;
      }

      id = R.id.ten;
      TextView ten = ViewBindings.findChildViewById(rootView, id);
      if (ten == null) {
        break missingId;
      }

      id = R.id.twenty;
      TextView twenty = ViewBindings.findChildViewById(rootView, id);
      if (twenty == null) {
        break missingId;
      }

      id = R.id.typep;
      RadioGroup typep = ViewBindings.findChildViewById(rootView, id);
      if (typep == null) {
        break missingId;
      }

      id = R.id.wait;
      ProgressBar wait = ViewBindings.findChildViewById(rootView, id);
      if (wait == null) {
        break missingId;
      }

      return new MobilebankBinding((RelativeLayout) rootView, amount, cashin, cashout, fifty, hd,
          hundread, left, note, num, number, operator, pin, send, sub, ten, twenty, typep, wait);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
