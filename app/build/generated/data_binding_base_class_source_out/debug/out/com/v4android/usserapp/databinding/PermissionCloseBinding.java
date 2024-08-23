// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class PermissionCloseBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout adsf;

  @NonNull
  public final LinearLayout cem;

  @NonNull
  public final RelativeLayout four;

  @NonNull
  public final LinearLayout gal;

  @NonNull
  public final TextView link;

  @NonNull
  public final TextView link2;

  private PermissionCloseBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout adsf,
      @NonNull LinearLayout cem, @NonNull RelativeLayout four, @NonNull LinearLayout gal,
      @NonNull TextView link, @NonNull TextView link2) {
    this.rootView = rootView;
    this.adsf = adsf;
    this.cem = cem;
    this.four = four;
    this.gal = gal;
    this.link = link;
    this.link2 = link2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PermissionCloseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PermissionCloseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.permission_close, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PermissionCloseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adsf;
      LinearLayout adsf = ViewBindings.findChildViewById(rootView, id);
      if (adsf == null) {
        break missingId;
      }

      id = R.id.cem;
      LinearLayout cem = ViewBindings.findChildViewById(rootView, id);
      if (cem == null) {
        break missingId;
      }

      id = R.id.four;
      RelativeLayout four = ViewBindings.findChildViewById(rootView, id);
      if (four == null) {
        break missingId;
      }

      id = R.id.gal;
      LinearLayout gal = ViewBindings.findChildViewById(rootView, id);
      if (gal == null) {
        break missingId;
      }

      id = R.id.link;
      TextView link = ViewBindings.findChildViewById(rootView, id);
      if (link == null) {
        break missingId;
      }

      id = R.id.link2;
      TextView link2 = ViewBindings.findChildViewById(rootView, id);
      if (link2 == null) {
        break missingId;
      }

      return new PermissionCloseBinding((RelativeLayout) rootView, adsf, cem, four, gal, link,
          link2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
