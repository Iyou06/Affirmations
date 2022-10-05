package com.example.affirmations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.affirmations.adapter.ItemAdapter;
import com.example.affirmations.data.Datasource;

import org.jetbrains.annotations.Nullable;

import java.util.List;

import kotlin.jvm.internal.Intrinsics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List myDataset = (new Datasource()).loadAffirmations();
        RecyclerView recyclerView = (RecyclerView)this.findViewById(R.id.recycler_view);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setAdapter((RecyclerView.Adapter)(new ItemAdapter((Context)this, myDataset)));
        recyclerView.setHasFixedSize(true);
    }
}
