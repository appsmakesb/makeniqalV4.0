// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ListInternetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView com;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView title;

  @NonNull
  public final LinearLayout tm;

  private ListInternetBinding(@NonNull LinearLayout rootView, @NonNull TextView com,
      @NonNull TextView price, @NonNull TextView title, @NonNull LinearLayout tm) {
    this.rootView = rootView;
    this.com = com;
    this.price = price;
    this.title = title;
    this.tm = tm;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListInternetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListInternetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_internet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListInternetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.com;
      TextView com = ViewBindings.findChildViewById(rootView, id);
      if (com == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.tm;
      LinearLayout tm = ViewBindings.findChildViewById(rootView, id);
      if (tm == null) {
        break missingId;
      }

      return new ListInternetBinding((LinearLayout) rootView, com, price, title, tm);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
