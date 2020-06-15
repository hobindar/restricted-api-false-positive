package ca.hobin.restrictedapi;

import android.view.KeyEvent;

import androidx.fragment.app.FragmentActivity;

class TestFragmentActivity extends FragmentActivity {

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        // The below triggers a RestrictedApi warning
        return super.dispatchKeyEvent(event);
    }

}
