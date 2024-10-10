package com.example.momento2moviles;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Lista de productos tecnológicos
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Smartphone", "$699.99", R.drawable.smartphone));
        productList.add(new Product("Laptop", "$1,299.99", R.drawable.laptop));
        productList.add(new Product("Smartwatch", "$199.99", R.drawable.smartwatch));
        productList.add(new Product("Headphones", "$149.99", R.drawable.headphones));
        productList.add(new Product("Tablet", "$499.99", R.drawable.tablet));

        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
    }
}