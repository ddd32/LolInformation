package com.huyuit.lolinformation.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.huyuit.lolinformation.R;
import com.huyuit.lolinformation.data.local.Region;
import com.huyuit.lolinformation.util.App;
import javax.inject.Inject;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();
  @Inject Retrofit retrofit;
  @Inject FirebaseDatabase firebaseDatabase;
  @BindView(R.id.recycler_main) RecyclerView mRecyclerMain;
  private DatabaseReference databaseReference;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    App.getNetComponent(this).inject(this);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    //databaseReference = firebaseDatabase.getReference("champion");
    //Call<ChampionResponse> championResponseCall =
    //    retrofit.create(RestApiRiot.class).getChampion("vn_VN", true, "tags", Const.API_KEY);
    //championResponseCall.enqueue(new Callback<ChampionResponse>() {
    //  @Override
    //  public void onResponse(Call<ChampionResponse> call, Response<ChampionResponse> response) {
    //    Map<String, Champion> championHashMap = response.body().getData();
    //    List<Champion> list = new ArrayList<>(championHashMap.values());
    //    for (Champion champion : list) {
    //      databaseReference.child(champion.getKey())
    //          .setValue(champion, new DatabaseReference.CompletionListener() {
    //            @Override public void onComplete(DatabaseError databaseError,
    //                DatabaseReference databaseReference) {
    //              Log.d(TAG, "onComplete: " + databaseReference.getRef());
    //            }
    //          });
    //    }
    //  }
    //
    //  @Override public void onFailure(Call<ChampionResponse> call, Throwable t) {
    //
    //  }
    //});
  }
}
