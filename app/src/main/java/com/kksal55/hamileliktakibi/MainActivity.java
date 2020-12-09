package com.kksal55.hamileliktakibi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.huawei.hms.ads.AdListener;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class MainActivity extends AppCompatActivity {
    private AdListener adListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Toast.makeText(MainActivity.this,"test",Toast.LENGTH_SHORT).show();


        HwAds.init(this);

        BannerView bottomBannerView = findViewById(R.id.hw_banner_view);
        AdParam adParam = new AdParam.Builder().build();
        bottomBannerView.loadAd(adParam);

        BannerView topBannerView = new BannerView(this);
        topBannerView.setAdId("g268xgz78z");
        topBannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        topBannerView.loadAd(adParam);

        RelativeLayout rootView = findViewById(R.id.root_view);
        rootView.addView(topBannerView);



//        BannerView hwBannerView = findViewById(R.id.huawei_banner_view);
//        hwBannerView.setVisibility(View.VISIBLE);
//        // Create an ad request to load an ad.
//        AdParam adParam = new AdParam.Builder().build();
//        hwBannerView.loadAd(adParam);
//        hwBannerView.setAdListener(adListener);
//
//        AdListener adListener = new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                // Called when an ad is loaded successfully.
//                Toast.makeText(MainActivity.this,"Onloaded",Toast.LENGTH_SHORT).show();
//            }
//            @Override
//            public void onAdFailed(int errorCode) {
//                Toast.makeText(MainActivity.this,"onAdFailed",Toast.LENGTH_SHORT).show();
//                //Log.d(TAG , "onAdFailed");
//            }
//            @Override
//            public void onAdOpened() {
//                Toast.makeText(MainActivity.this,"onAdOpened",Toast.LENGTH_SHORT).show();
//                //Log.d(TAG , "onAdOpened");
//            }
//            @Override
//            public void onAdClicked() {
//                Toast.makeText(MainActivity.this,"onAdClicked",Toast.LENGTH_SHORT).show();
//                //Log.d(TAG , "onAdClicked");
//            }
//            @Override
//            public void onAdLeave() {
//                Toast.makeText(MainActivity.this,"onAdLeave",Toast.LENGTH_SHORT).show();
//                //Log.d(TAG , "onAdLeave");
//            }
//            @Override
//            public void onAdClosed() {
//                Toast.makeText(MainActivity.this,"onAdClosed",Toast.LENGTH_SHORT).show();
//                //Log.d(TAG , "onAdClosed");
//            }
//        };
    }
}