// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
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

public final class Frag1LayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText amount;

  @NonNull
  public final RelativeLayout amountL;

  @NonNull
  public final TextView fifty;

  @NonNull
  public final TextView hundread;

  @NonNull
  public final LinearLayout left;

  @NonNull
  public final ImageButton next;

  @NonNull
  public final TextView ten;

  @NonNull
  public final TextView twenty;

  private Frag1LayoutBinding(@NonNull LinearLayout rootView, @NonNull EditText amount,
      @NonNull RelativeLayout amountL, @NonNull TextView fifty, @NonNull TextView hundread,
      @NonNull LinearLayout left, @NonNull ImageButton next, @NonNull TextView ten,
      @NonNull TextView twenty) {
    this.rootView = rootView;
    this.amount = amount;
    this.amountL = amountL;
    this.fifty = fifty;
    this.hundread = hundread;
    this.left = left;
    this.next = next;
    this.ten = ten;
    this.twenty = twenty;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Frag1LayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Frag1LayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.frag1_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Frag1LayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amount;
      EditText amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.amount_l;
      RelativeLayout amountL = ViewBindings.findChildViewById(rootView, id);
      if (amountL == null) {
        break missingId;
      }

      id = R.id.fifty;
      TextView fifty = ViewBindings.findChildViewById(rootView, id);
      if (fifty == null) {
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

      id = R.id.next;
      ImageButton next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
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

      return new Frag1LayoutBinding((LinearLayout) rootView, amount, amountL, fifty, hundread, left,
          next, ten, twenty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
