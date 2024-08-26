package com.example.stocksmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView inventoryCard, settingsCard, userInfoCard, helpCard;
    private TextView inventoryCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize CardViews
        inventoryCard = findViewById(R.id.inventoryCard);
        settingsCard = findViewById(R.id.settingsCard);
        userInfoCard = findViewById(R.id.userInfoCard);
        helpCard = findViewById(R.id.helpCard);

        // Set click listeners
        inventoryCard.setOnClickListener(this);
        settingsCard.setOnClickListener(this);
        userInfoCard.setOnClickListener(this);
        helpCard.setOnClickListener(this);

        // Initialize TextView for inventory count
        inventoryCountTextView = findViewById(R.id.inventoryCount);

        // TODO: Fetch and update inventory count
        updateInventoryCount();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if (v.getId() == R.id.inventoryCard) {
            intent = new Intent(this, InventoryActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.settingsCard) {
            intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.userInfoCard) {
            intent = new Intent(this, UserInfoActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.helpCard) {
            intent = new Intent(this, HelpActivity.class);
            startActivity(intent);
        }
    }

    private void updateInventoryCount() {
        // TODO: Implement logic to fetch inventory count
        // For now, we'll just set a placeholder value
        int count = 0; // Replace with actual count
        inventoryCountTextView.setText(String.valueOf(count));
    }
}