package com.navlauncher.dual;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Najprv spustíme VocalizerEX
        startVocalizerEX();
        
        // Počkáme 500ms a potom spustíme iGo
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startIGo();
                finish(); // Zatvoríme launcher
            }
        }, 500);
    }
    
    private void startVocalizerEX() {
        try {
            // Názvy balíkov pre VocalizerEX
            String[] possiblePackages = {
                "es.codefactory.vocalizertts",
                "com.codefactory.vocalizerex",
                "com.vocalizer.ex"
            };
            
            boolean started = false;
            for (String packageName : possiblePackages) {
                Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
                if (intent != null) {
                    startActivity(intent);
                    started = true;
                    break;
                }
            }
            
            if (!started) {
                Toast.makeText(this, "VocalizerEX nie je nájdený", Toast.LENGTH_SHORT).show();
            }
            
        } catch (Exception e) {
            Toast.makeText(this, "Chyba pri spustení VocalizerEX", Toast.LENGTH_SHORT).show();
        }
    }
    
    private void startIGo() {
        try {
            // Názvy balíkov pre iGo Nextgen
            String[] possiblePackages = {
                "com.nng.igoprimoisr.javaclient",
                "com.nng.igo.primong.igoworld",
                "com.nng.igoprimoisr",
                "com.nng.igo.primong"
            };
            
            boolean started = false;
            for (String packageName : possiblePackages) {
                Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
                if (intent != null) {
                    startActivity(intent);
                    started = true;
                    break;
                }
            }
            
            if (!started) {
                Toast.makeText(this, "iGo Nextgen nie je nájdený", Toast.LENGTH_SHORT).show();
            }
            
        } catch (Exception e) {
            Toast.makeText(this, "Chyba pri spustení iGo", Toast.LENGTH_SHORT).show();
        }
    }
}
