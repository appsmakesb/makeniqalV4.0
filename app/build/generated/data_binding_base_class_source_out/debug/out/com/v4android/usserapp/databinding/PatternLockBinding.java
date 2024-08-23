// Generated by view binder compiler. Do not edit!
package com.v4android.usserapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.library.foysaltech.reginald.patternlockview.PatternLockView;
import com.v4android.usserapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PatternLockBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final PatternLockView lockView;

  @NonNull
  public final RelativeLayout mainlayout;

  @NonNull
  public final TextView passwordText;

  @NonNull
  public final Button sub;

  @NonNull
  public final LinearLayout top;

  private PatternLockBinding(@NonNull RelativeLayout rootView, @NonNull PatternLockView lockView,
      @NonNull RelativeLayout mainlayout, @NonNull TextView passwordText, @NonNull Button sub,
      @NonNull LinearLayout top) {
    this.rootView = rootView;
    this.lockView = lockView;
    this.mainlayout = mainlayout;
    this.passwordText = passwordText;
    this.sub = sub;
    this.top = top;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PatternLockBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PatternLockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pattern_lock, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PatternLockBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lock_view;
      PatternLockView lockView = ViewBindings.findChildViewById(rootView, id);
      if (lockView == null) {
        break missingId;
      }

      RelativeLayout mainlayout = (RelativeLayout) rootView;

      id = R.id.password_text;
      TextView passwordText = ViewBindings.findChildViewById(rootView, id);
      if (passwordText == null) {
        break missingId;
      }

      id = R.id.sub;
      Button sub = ViewBindings.findChildViewById(rootView, id);
      if (sub == null) {
        break missingId;
      }

      id = R.id.top;
      LinearLayout top = ViewBindings.findChildViewById(rootView, id);
      if (top == null) {
        break missingId;
      }

      return new PatternLockBinding((RelativeLayout) rootView, lockView, mainlayout, passwordText,
          sub, top);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
