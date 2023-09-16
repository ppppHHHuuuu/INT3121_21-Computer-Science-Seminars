// Generated by view binder compiler. Do not edit!
package com.android.example.sleepcodelab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.android.example.sleepcodelab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final ConstraintLayout mainActivity;

  @NonNull
  public final TextView outputTextView;

  @NonNull
  public final ScrollView scrollView;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull ConstraintLayout mainActivity, @NonNull TextView outputTextView,
      @NonNull ScrollView scrollView) {
    this.rootView = rootView;
    this.button = button;
    this.mainActivity = mainActivity;
    this.outputTextView = outputTextView;
    this.scrollView = scrollView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = rootView.findViewById(id);
      if (button == null) {
        break missingId;
      }

      ConstraintLayout mainActivity = (ConstraintLayout) rootView;

      id = R.id.output_text_view;
      TextView outputTextView = rootView.findViewById(id);
      if (outputTextView == null) {
        break missingId;
      }

      id = R.id.scrollView;
      ScrollView scrollView = rootView.findViewById(id);
      if (scrollView == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, button, mainActivity,
          outputTextView, scrollView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
