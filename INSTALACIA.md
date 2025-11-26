# Navigation Launcher - Návod na inštaláciu a použitie

## ✅ ČO JE PRIPRAVENÉ:
- Kód je nastavený pre **VocalizerEX** (es.codefactory.vocalizertts)
- Kód je nastavený pre **iGo Nextgen** (com.nng.igoprimoisr.javaclient)

## 📱 AKO ZOSTAVIŤ APK:

### MOŽNOSŤ A: Android Studio (Windows/Mac/Linux)

1. **Nainštalujte Android Studio:**
   - Stiahnite z: https://developer.android.com/studio
   - Počas inštalácie zaškrtnite "Android SDK" a "Android SDK Platform"

2. **Otvorte projekt:**
   - Spustite Android Studio
   - Kliknite "Open" → vyberte priečinok NavigationLauncher
   - Počkajte 5-10 minút na stiahnutie závislostí

3. **Zostavte APK:**
   - V hornom menu: **Build** → **Build Bundle(s) / APK(s)** → **Build APK(s)**
   - Počkajte 1-2 minúty
   - Po dokončení kliknite "locate" v notifikácii
   - APK nájdete v: `app/build/outputs/apk/debug/app-debug.apk`

### MOŽNOSŤ B: Gradle z príkazového riadka (Linux/Mac)

```bash
# Rozbaľte projekt
unzip NavigationLauncher.zip
cd NavigationLauncher

# Uistite sa, že máte Java 17 alebo novšiu
java -version

# Zostavte APK
./gradlew assembleDebug

# APK bude v: app/build/outputs/apk/debug/app-debug.apk
```

### MOŽNOSŤ C: Použite online nástroj

Ak nemáte PC alebo nechcete inštalovať Android Studio:
1. Nahrajte projekt na online službu ako **Replit** alebo **GitHub Codespaces**
2. Tam nainštalujte Android SDK
3. Zostavte pomocou Gradle

---

## 📲 INŠTALÁCIA NA K706:

1. **Skopírujte APK:**
   - Pripojte K706 k PC cez USB
   - Skopírujte `app-debug.apk` do K706 (napr. do Downloads)

2. **Povoľte inštaláciu z neznámych zdrojov:**
   - Nastavenia → Zabezpečenie → "Neznáme zdroje" → Zapnúť
   - (Alebo pri inštalácii vás to samo vyzve)

3. **Nainštalujte APK:**
   - Otvorte súborovú aplikáciu
   - Nájdite app-debug.apk
   - Kliknite na ňu a potvrďte inštaláciu

---

## ⚙️ NASTAVENIE AKO PREDVOLENÁ NAVIGÁCIA:

**TOTO JE NAJDÔLEŽITEJŠIA ČASŤ!**

1. Otvorte **Nastavenia**
2. Prejdite na **Aplikácie** (alebo "Apps")
3. Kliknite na **Predvolené aplikácie** (alebo "Default apps")
4. Nájdite **Navigačná aplikácia** (alebo "Navigation app")
5. Vyberte **"Nav Launcher"**

Alternatívne:
- Nastavenia → Aplikácie → Nav Launcher → "Nastaviť ako predvolené" → Navigácia

---

## 🎯 AKO TO FUNGUJE:

Keď:
1. Systém Android potrebuje navigáciu
2. Alebo keď kliknete na GPS súradnice
3. Alebo spustíte Nav Launcher manuálne

Potom:
1. **Spustí sa VocalizerEX** (es.codefactory.vocalizertts)
2. Počká 500ms
3. **Spustí sa iGo Nextgen** (com.nng.igoprimoisr.javaclient)
4. Launcher sa zavrie na pozadí

Vďaka tomu, že Nav Launcher je označený ako navigačná aplikácia, **získa správny audio focus** a iGo by malo stišovať hudbu pri navigačných pokynoch! 🎵

---

## 🔧 RIEŠENIE PROBLÉMOV:

### Aplikácia sa nenainštaluje:
- Skontrolujte, či máte povolené neznáme zdroje
- Skúste reštartovať K706

### Nav Launcher nie je v zozname navigačných aplikácií:
- Reštartujte K706
- Prejdite Nastavenia → Aplikácie → Nav Launcher → "Vymazať predvolené"
- Skúste znova

### VocalizerEX alebo iGo sa nespúšťajú:
Možno máte inú verziu. Overte názvy balíkov:
1. Nainštalujte "App Inspector" z Google Play
2. Overte názvy:
   - VocalizerEX: **es.codefactory.vocalizertts** ✓
   - iGo Nextgen: **com.nng.igoprimoisr.javaclient** ✓
3. Ak sú iné, dajte mi vedieť a upravím kód

### Hudba sa stále nestišuje:
1. Uistite sa, že Nav Launcher je naozaj nastavený ako predvolená navigácia
2. V iGo: Nastavenia → Zvuk → Zapnite "Znížiť hlasitosť médií"
3. Reštartujte K706
4. Skúste najprv spustiť Nav Launcher, potom prehrať hudbu, potom navigovať

### iGo sa zabije pri zapnutí svetiel:
To je iný problém. Ak sa to stále deje, môžeme pridať do launchera watchdog, ktorý bude automaticky reštartovať iGo.

---

## 📝 ČO ĎALEJ:

Ak toto nefunguje alebo potrebujete úpravy:
1. Skúste najprv základné fungovanie (spúšťajú sa obe aplikácie?)
2. Potom testujte audio focus (stišuje sa hudba?)
3. Dajte mi vedieť výsledky a môžem to ďalej upraviť

---

## 🆘 POTREBUJETE POMOC?

Ak neviete, ako zostaviť APK, môžem:
1. Ukázať video návod
2. Pomôcť krok po kroku cez TeamViewer
3. Skúsiť online build service

Dajte vedieť! 🚗📍
