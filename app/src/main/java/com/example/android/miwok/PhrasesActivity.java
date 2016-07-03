/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Jak się masz?", "How are you?"));
        words.add(new Word("Jak się nazywasz?", "What is your name?"));
        words.add(new Word("Dokąd idziesz?", "Where are you going?"));
        words.add(new Word("Skąd pochodzisz?", "Where are you from?"));
        words.add(new Word("Nazywam się...", "My name is..."));
        words.add(new Word("Pochodzę z...", "I am from..."));
        words.add(new Word("W porządku", "I'm good."));
        words.add(new Word("Dziękuję.", "Thank you."));
        words.add(new Word("Proszę.", "Please."));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
