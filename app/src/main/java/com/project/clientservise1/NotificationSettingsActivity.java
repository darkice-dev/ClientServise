package com.project.clientservise1;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.CheckBoxPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreference;

public class NotificationSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings_container, new NotificationSettingsFragment())
                .commit();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public static class NotificationSettingsFragment extends PreferenceFragmentCompat {

        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.notification_settings, rootKey);

            SwitchPreference all_push_notification_on_off = findPreference("all_push_notification_on_off");
            CheckBoxPreference check_box_onChangeStateRequest = findPreference("check_box_onChangeStateRequest");
            SwitchPreference email_notif_on_off = findPreference("email_notification_on_off");
            EditTextPreference email_for_notification = findPreference("email_for_notification");

            check_box_onChangeStateRequest.setEnabled(all_push_notification_on_off.isChecked());
            email_for_notification.setEnabled(email_notif_on_off.isChecked());

            all_push_notification_on_off.setOnPreferenceClickListener(event -> {
                check_box_onChangeStateRequest.setEnabled(!check_box_onChangeStateRequest.isEnabled());
                return true;
            });

            email_notif_on_off.setOnPreferenceClickListener(event -> {
                email_for_notification.setEnabled(!email_for_notification.isEnabled());
                return true;
            });
        }
    }
}