package edu.upc.dsa.martianslog;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.List;

import edu.upc.dsa.martianslog.models.FAQ;
import edu.upc.dsa.martianslog.service.ApiService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FaqActivity {
    ApiService apiService;
    private RecyclerView recyclerViewFAQ;
    private RecycleViewAdapterFAQ adapterFAQ;
    public static final String API_URL="http://10.0.2.2:8080/dsaApp/";
    private static final String TAG= "POKEDEX";

   @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Declaración del retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);

    }



    @Override
    public void recyclerViewListClicked(int position) {

    }

    public void returnFunction(View view) {
        Intent intent = new Intent(FaqActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void FAQ(View view) {
        Intent intent = new Intent(FaqActivity.this, FaqActivity.class);
        startActivity(intent);
    }
}
