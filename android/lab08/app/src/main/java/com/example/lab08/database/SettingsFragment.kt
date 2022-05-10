package com.example.lab08.database

import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import androidx.preference.EditTextPreference
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.example.lab08.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)

        val idPreference:EditTextPreference?=findPreference("id")
        val colorPreference:ListPreference?=findPreference("color")

        colorPreference?.summaryProvider = ListPreference.SimpleSummaryProvider.getInstance()
        Preference.SummaryProvider<EditTextPreference>{
            preference ->
            val text = preference.text
            if(TextUtils.isEmpty(text)){
                "설정이 되지 않았음"
            }else{
                "설정된 id 값은 $text 입니다"
            }
        }
    }
}