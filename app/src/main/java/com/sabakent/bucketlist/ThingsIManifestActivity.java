package com.sabakent.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsIManifestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_imanifest);
        setupList();


    }

    private void setupList() {
        BucketListEntry[] thingsIManifest = {
                new BucketListEntry("Becoming Mobile Developer", "I want to become an expert with a high payed salary", R.drawable.coder, 5),
                new BucketListEntry("Fit", "Get healthier", R.drawable.fit, 4.5f),
                new BucketListEntry("Xiao", "Get C6 Xiao", R.drawable.xiao, 5),
                new BucketListEntry("Cottage", "I want to live in a semi-secluded area", R.drawable.cottage, 4.3f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_imanifest);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsIManifest);
        recyclerView.setAdapter(adapter);
    }
}